package com.eec.util;

import com.eec.entity.Student;

public class StuFactory {

	/* ��̬��������ע�� */
	public static Student getStu() {
		return new Student("��С�", 16, "���ս�ְͨҵ����ѧԺ");
	}

	/* �����Ǿ�̬����ע�� */
	public Student getStuOne() {
		return new Student("����ϼ", 14, "�ߺ�ְҵ����ѧԺ");
	}
}
