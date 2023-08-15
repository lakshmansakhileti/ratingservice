package com.lnd.ratingservice.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

@Aspect
@Component
@Order(1)
public class ServerHeaderAspect {
    @Autowired
    Environment environment;
    @Pointcut("execution(public * com.lnd.ratingservice.controller.*.*(..))") // Adjust package and method expression
    public void controllerMethods() {
    }
    @AfterReturning("controllerMethods()")
    public void addServerHeader() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getResponse();
        if (response != null) {
            response.setHeader("Server", environment.getProperty("local.server.port"));
        }
    }

}
