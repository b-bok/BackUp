package com.kh.first; // 해당 클래스가 어떤 패키지에 속해있는지 보여줌


public class A_MethodPrinter {

	// 기능 단위 == 메소드
	// 클래스마다 무조건 메인 메소드 포함 할 필요는 없다.
	// 일반 메소드를 만들 것이다.
	
	public void methodA() {//메소드명은 소문자로 작성하는 것이 권장사항								
		System.out.println("methodA 호출 되었습니다.");	
		methodB();
		 // 같은 클래스 내 메소드 호출시 바로 그냥 메소드();
		}

	public void methodB() {
		
		System.out.println("methodB 호출 되었습니다.");
		methodC();
	}
	
	public void methodC() {
		
		System.out.println("methodC 호출 되었습니다.");
	
	}
	
	
}

