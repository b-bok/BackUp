package com.kh.chap04_field.model.vo;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//---------------1. FieldTest1 ----------------
		/*
		FieldTest1 f1 = new FieldTest1(); // 객체 생성
		
		f1.test(5); // 메소드 실행
		*/
		
		// --------------2. FieldTest2 -----------------
		
		FieldTest2 f2 = new FieldTest2();
		
				//public --> 어디서든 접근 가능
				System.out.println(f2.pub);
				
				//protected --> 같은 패키지 내 + 다른 패키지 일경우 상속구조 일때만
				System.out.println(f2.pro);
				
				
				//default --> 같은 패키지 내 접근가능
				System.out.println(f2.def);
				
				//private --> 같은 클래스만
				//System.out.println(f2.pri);
		
	}

}
