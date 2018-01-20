package com.eec.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eec.entity.Student;

public class TestSpring {
	
	public static void main(String[] args) {
		//加载配置文件applicationContext.xml
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//setter方法注入
		/*Student student=(Student) appContext.getBean("testStudent");
		student.show();*/
		
		
		//构造器注入
		/*Student student1=(Student) appContext.getBean("testStudent1");
		student1.show();*/
		
		//工厂静态方法注入
		/*Student student2=(Student) appContext.getBean("testStudent2");
		student2.show();*/
		
		//工厂非静态方法注入
		Student student3=(Student) appContext.getBean("jiafeng");
		student3.show();
		
	}

}
