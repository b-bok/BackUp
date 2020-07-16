package com.kh.run;

import com.kh.first.A_MethodPrinter; // 선언문 추가


public class RunA {
	
	public static void main(String [] args) {
		
		System.out.println("프로그램 실행!!");
		
		//다른 클래스에 있는 메소드를 실행(호출)하는 방법?
		// 1) 실행할 메소드가 있는 클래스를 생성
		// [표현법] = 클래스명 사용할 이름 = new 클래스명(); 
 		// 2) 메소드 실행(호출)
		// [표현법] = 사용할 이름.실행할메소드명();
		
		
		
		// 코드 기술 중인 RunA 클래스가 속해앴는 패키지에 해당 클래스가 없음
		// 같은 패키지 내에 해당 클래스 찾을 수 없어
		// 해결 방법 1. 어떤 패키지에 속해있는지 풀 클래스명 제시
		//    패키지 패키지 패키지 클래스
		// 1) com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		
		// 해결 방법 2. 그냥 클래스명만 가지고 생성 하되 어느 패키지에 속해있는지 단 한번 선언해주기
		// import com.kh.first.A_MethodPrinter;
		A_MethodPrinter a = new A_MethodPrinter();

		a.methodA();
		//a.methodB();
		//a.methodC();
		

		
		
	}
	
	
}
