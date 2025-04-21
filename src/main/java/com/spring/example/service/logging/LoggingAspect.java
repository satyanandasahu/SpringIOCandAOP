package com.spring.example.service.logging;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
	
	/**
	  * Declaring after advice 
	  * @param jointPoint
	  * @throws Throwable
	  */
	 public void afterAdviceForAllMethods(JoinPoint jointPoint) throws Throwable {
	        System.out.println("\nLoggingAspect.afterAdviceForAllMethods() " +jointPoint.getThis().getClass().getName());
	    }
	 
	 /**
	  * Declaring after advice for all transfer methods whose taking three arguments of any type 
	  * of all classes in the package com.doj.aopapp.service
	  * @param jointPoint
	  * @throws Throwable
	  */
	 public void beforeAdviceForMethods(JoinPoint jointPoint) throws Throwable {
	        System.out.println("\nLoggingAspect.beforeAdviceForAllMethods() " + jointPoint.getThis().getClass().getName() + "\n");
	    }

}
