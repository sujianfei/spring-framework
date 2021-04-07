package org.feixiang3cache;

import org.feixiang3cache.service.OrderService;
import org.feixiang3cache.service.UserService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("org.feixiang3cache")
@Configuration
@EnableAspectJAutoProxy
public class MyApplication3Cache {
	public static void main(String[] args){
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "d:\\test");
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyApplication3Cache.class);

		UserService userService= (UserService) applicationContext.getBean("userService");
		System.out.println(userService.getName(1));
		System.out.println("=============================");

		OrderService orderService= (OrderService) applicationContext.getBean("orderService");
		System.out.println(orderService.getOrderName(2));
	}
}
