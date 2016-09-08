package HelloWorld;
/**
 * Created by llu1 on 9/8/2016.
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://test.com/",name = "HelloWorld")
public interface HelloWorld {
    @WebMethod(operationName = "sayHello")
    @WebResult(name = "sayHelloResult")
    void sayhello(@WebParam(name = "InputStr")String inputStr );
}
