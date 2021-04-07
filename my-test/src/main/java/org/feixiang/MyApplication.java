package org.feixiang;

import org.feixiang.service.UserService;
import org.feixiang.service.UserServiceImpl;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("org.feixiang")
@Configuration
@EnableAspectJAutoProxy
public class MyApplication {
	public static void main(String[] args){
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "d:\\test");
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyApplication.class);
		UserService userService= (UserService) applicationContext.getBean("userServiceImpl");
		//UserServiceImpl 继承 UserService 接口 用的jdk 动态代理，如果不继承，是用的 CGLib的代理
		System.out.println(userService.getName(1));
	}
}
