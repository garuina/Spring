package kr.co.ch03.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {
	
	@Pointcut("execution(* kr.co.ch03.AOPService.delete*(..))")
	public void deletPointcut() {}

	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))")
	public void insertPointcut() {}
	
	@Around("deletPointcut()")
	public void around1(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("횡단관심 - aroud1 before");
		pjp.proceed();
		System.out.println("횡단관심 - aroud1 after");
	
	}
	
	@Around("insertPointcut()")
	public void around2(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("횡단관심 - aroud2 before");
		pjp.proceed();
		System.out.println("횡단관심 - aroud2 after");
	
	}
	
}
