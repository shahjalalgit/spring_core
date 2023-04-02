package spring_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(spring_aop..*)") // it's define, for which particular type of class that we want to execute for all the methods available
    public void authenticatingPointCut(){

    }

    @Pointcut("within(spring_aop.ShoppingCart.*)")
    public void authorizationPointCut(){

    }
    @Before("authenticatingPointCut() && authenticatingPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }
}
