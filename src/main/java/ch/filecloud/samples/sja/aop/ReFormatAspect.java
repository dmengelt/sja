package ch.filecloud.samples.sja.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * Created by domi on 10/27/14.
 */
@Aspect
public class ReFormatAspect {

    @Autowired
    private Environment environment;

    @AfterReturning(pointcut = "@annotation(ch.filecloud.samples.sja.aop.ReFormat)", returning = "response")
    public void formatter(JoinPoint joinPoint, Object response) {
        System.out.println("[@AfterReturning] " + ((String) response).toUpperCase());
        System.out.println(environment.getProperty("java.version"));
    }
}
