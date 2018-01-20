package com.eec.util;

import com.eec.entity.Student;

public class StuFactory {

	/* 静态工厂方法注入 */
	public static Student getStu() {
		return new Student("王小姗", 16, "安徽交通职业技术学院");
	}

	/* 工厂非静态方法注入 */
	public Student getStuOne() {
		return new Student("余竹霞", 14, "芜湖职业技术学院");
	}
}
