package com.kh.variable;

public class B_constant {

	public void finalConstant() {
		// 상수의 이름은 다 대문자로 권장
		// 변수는 변경가능하지만, 상수는 불가
		// The final local variable age cannot be assigned. 
		//It must be blank and not using a compound assignment
		final int AGE = 27;
		
		System.out.println("AGE : " + AGE);
		
		int age = 21;
		
		System.out.println("age : " + age);
		
	
	}
	
	
}
