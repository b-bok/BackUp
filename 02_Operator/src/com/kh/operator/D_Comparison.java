package com.kh.operator;

public class D_Comparison {

	/*
	 *  * 비교 연산자(관계 연산자, 이항 연산자)
	 *  - 두 값을 비교하는 연산자
	 *  - 비교 한 값이 참이면 true, 거짓이면 false
	 *  즉, 비교연산을 수행한 결과값은 논리값
	 *  
	 *  a < b : a가 b보다 작냐?
	 *  a > b : a가 b보다 크냐?
	 *  a <= b : a가 b보다 작거나 같냐?
	 *  a >= b : a가 b보다 크거나 같냐? (기호 순서대로 읽기)
	 *   
	 *  a == b : a와 b가 같냐?
	 *  a != b : a와 b가 다르냐? == !(a==b)
	 *  
	 *  
	 */
			
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		
		System.out.println("a != b : " + (a != b));
		System.out.println("a == b : " + (a == b));
		
		
		boolean result = (a >= b);
		System.out.println("result : " + result);
		
		
		// 산술연산 + 비교연산
		// a가 짝수 입니까?
		
		System.out.println("a가 짝수 입니까? : " + (a % 2 == 0));
		System.out.println("b는 짝수 인가? : " + (b % 2  == 0));
		
		System.out.println("a가 홀수인가? : " + (a % 2 == 1));
		System.out.println("b가 홀수인가? : " + (b % 2 == 1));
		
		System.out.println(a + b > 30);
		
		
		
		// 값 % 2 == 0  -> 짝수
		// 값 % 2 == 1  -> 홀수

		
		
		
		
		
	}
	
	
	
	
}
