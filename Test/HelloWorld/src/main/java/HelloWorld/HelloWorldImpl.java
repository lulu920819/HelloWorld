package HelloWorld;
/**
 * Created by llu1 on 9/8/2016.
 */
import HelloWorld.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldImpl implements HelloWorld {
@Override
    public void sayhello(String InputStr){

    System.out.println("Hello" + InputStr);

}
}
