package com.eec.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eec.entity.Student;

public class TestSpring {
	
	public static void main(String[] args) {
		//���������ļ�applicationContext.xml
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//setter����ע��
		/*Student student=(Student) appContext.getBean("testStudent");
		student.show();*/
		
		
		//������ע��
		/*Student student1=(Student) appContext.getBean("testStudent1");
		student1.show();*/
		
		//������̬����ע��
		/*Student student2=(Student) appContext.getBean("testStudent2");
		student2.show();*/
		
		//�����Ǿ�̬����ע��
		Student student3=(Student) appContext.getBean("jiafeng");
		student3.show();
		
	}

}
