package com.kh.chap04_field.run;
import com.kh.chap04_field.model.vo.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//---------------1. FieldTest1 ----------------
		/*
		FieldTest1 f1 = new FieldTest1(); // ��ü ����
		
		f1.test(5); // �޼ҵ� ����
		*/
		
		// --------------2. FieldTest2 -----------------
		
		//FieldTest2 f2 = new FieldTest2();
		
		// �� �ʵ忡 ���� ���� �غ���!
		
		//public --> ��𼭵� ���� ����
		//System.out.println(f2.pub);
		
		//protected --> ���� ��Ű�� �� + �ٸ� ��Ű�� �ϰ�� ��ӱ��� �϶���
		//System.out.println(f2.pro);
		
		//default --> ���� ��Ű�� �� ���ٰ���
		//System.out.println(f2.def);
		
		//private --> ���� Ŭ������
		//System.out.println(f2.pri);
		
		// --------------3. FieldTest3 -----------------
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		
		"apple".charAt(0);
		System.out.println(Math.random());
		//Math.min(10, 5);
		
	}

}
