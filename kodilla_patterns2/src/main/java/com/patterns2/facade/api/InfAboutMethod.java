package com.patterns2.facade.api;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InfAboutMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfAboutMethod.class);

    @Before("execution(* com.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEventStart() {
        LOGGER.info("Start method" );
    }

    @After("execution(* com.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEventStop() {
        LOGGER.info("Stop method");
    }

}
