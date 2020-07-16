package com.kh.variable;

public class E_OverFlow {

	public void overflow() {
		// byte 자료형에 저장 가능한 범위는 = -128 ~ 127
		
		byte bNum = 127;
		
		bNum++; // bNum 값을 1 증가 시킨다.
		bNum++;
		
		// 연산 할 때 저장 가능한 값의 범위를 벗어나는 것을 오버 플로우
		// 문제가 발생하지 않지만, 예측불가 값이 담길 수 있음
		
		System.out.println("bNum : " + bNum);
		
		
		
		
	}
	
	
	
	
	
	
}
