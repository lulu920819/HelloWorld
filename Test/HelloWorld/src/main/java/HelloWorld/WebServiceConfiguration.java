package HelloWorld;
/**
 * Created by llu1 on 9/8/2016.
 */


import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import javax.xml.ws.Endpoint;

@EnableWs
@Configuration
public class WebServiceConfiguration  extends WsConfigurerAdapter{

    @Autowired
    HelloWorld helloWorld;

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        CXFServlet cxfServlet = new CXFServlet();
        return new ServletRegistrationBean(cxfServlet, "/test/*");
    }

    @Bean(name = "cxf")
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), helloWorld);
        endpoint.publish("/hello");
        return endpoint;
    }
}
