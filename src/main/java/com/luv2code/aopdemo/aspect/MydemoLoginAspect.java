package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MydemoLoginAspect {
	
	@Pointcut("execution(public void add*(..))")
	private void AopAspect() {}
	
//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDao.addAccount(..))")
//	@Before("execution(public void add*(..))")
	
	@Before("AopAspect()")
	public void beforeaddAccount() {
		System.out.println("in my loggingaspect: before addacount");
	}
	
	@After("AopAspect()")
	public void beforeSillyAccount() {
		System.out.println("After silly account in class");
	}
}
