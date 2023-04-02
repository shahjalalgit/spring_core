package spring_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // this can be said points-cut method, and where this method will call in that point is called join-cut
    // double dot(..) for, it matches all of the parameter of function
    @Before("execution(* spring_aop.ShoppingCart.checkout(..))")  //execution defines: for which which perticular method that we want to execute
    public void beforelogger(JoinPoint jp){ // joinPoint for accessing the parameters of business method
//        System.out.println(jp.getSignature());
        String  arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: " + arg);
    }

    // * (any_return_type) * (any_package).*(any_class)
    @After("execution(* *.*.checkout(..))")
    public void afterlogger(){
        System.out.println("After Loggers");
    }


    // accessing return value
    @Pointcut("execution(* spring_aop.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }
    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "returnValue")
    public void afterReturning(String returnValue){
        System.out.println("After Returning: "+returnValue);
    }
}
