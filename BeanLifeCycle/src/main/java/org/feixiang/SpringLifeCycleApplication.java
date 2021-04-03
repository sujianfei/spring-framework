package org.feixiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//       现在开始初始化容器！！！
//		调用【BeanFactoryPostProcessor】的【postProcessBeanFactory】方法
//		调用【InstantiationAwareBeanPostProcessor】的【postProcessBeforeInstantiation】方法
//		Person 实例化
//		调用【InstantiationAwareBeanPostProcessor】的【postProcessAfterInstantiation】方法
//		调用【InstantiationAwareBeanPostProcessor】的【postProcessProperties】方法
//		Person 注入{name}属性
//		Person 注入{sex}属性
//
//		【BeanNameAware接口】调用BeanNameAware.setBeanName()
//		【BeanFactoryAware】调用BeanFactoryAware.setBeanFactory()
//		【ApplicationContextAware】调用ApplicationContextAware.setApplicationContext()
//		调用【BeanPostProcessor】的【postProcessBeforeInitialization】方法
//		【InitializingBean】调用InitializingBean.afterPropertiesSet()
//		Person 的初始化myInit()方法
//		调用【BeanPostProcessor】的【postProcessAfterInitialization】方法
//		容器初始化成功！！！
//		现在开始关闭容器！！！
//		【DisposableBean】调用DisposableBean.destroy()
//		Person 的初始化myDestory()方法

public class SpringLifeCycleApplication {
	public static void main(String[] args) {
		System.out.println("现在开始初始化容器！！！");

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println("容器初始化成功！！！");

		System.out.println("现在开始关闭容器！！！");
		((ClassPathXmlApplicationContext)context).registerShutdownHook();

	}
}
