package spring_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "spring_aop")
@EnableAspectJAutoProxy     //this need for Aspect, points-cut method, and join-cut
public class BeanConfig {
}
