package org.feixiang;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogExecuteTime {

	@Pointcut("execution(* org.feixiang.service.*.*(..))")
	public void pointCut() {

	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = point.proceed();
		long end = System.currentTimeMillis();
        System.out.println("一共执行了"+(end-start));
		System.out.println("大家好");
		System.out.println("两年前的3月18日，习近平主持召开学校思想政治理论课教师座谈会，强调“要理直气壮开好思政课”。由党的总书记亲自围绕思政课这一主题主持召开座谈会，在党的历史是第一次，在新中国教育史上具有里程碑意义。");
		return result;
	}


}
