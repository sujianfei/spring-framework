package org.feixiang3cache;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogExecuteTime {

	@Pointcut("execution(* org.feixiang3cache.service.*.*(..))")
	public void pointCut() {

	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = point.proceed();
		long end = System.currentTimeMillis();
        System.out.println("一共执行了"+(end-start));
		System.out.println("大家好");
		System.out.println("历史意义");
		return result;
	}


}
