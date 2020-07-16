package com.kh.chap06_method.controller;

public class OverloadingTest3 {

	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 방법
	
	
	public void test() { // x.test();
		
	}
	
	// 식별 가능
	
	
	public void test(int a) { // x.test(1);
		
	}
	
	public void test(int a, String s) { // x.test(1,"S");
		
	}
	
	public void test(int a, int b) { // x.test(1,2)
		
	}
	
	// 에러 발생 --> 매개변수명이랑은 상관없이 자료형 갯수와 순서가 달라야함
	
	public void test(int a, int b, String str) { // x.test(10,20,"")
		
	}
	
	/*public int test(int a, int b, String str) {
		
		return 0;
	}
	*/
	
	// 에러 발생 --> 반환형이 다르다고 오버로딩 적용되지 않음!! (매개변수가 무조건 달라야만함!!)
	/*
	private void test(int a, int b, String str) {
		
	}
	*/
	
	// 에러발생 --> 접근제한자 다르다고 오버로딩 적용됮 않음!! (매개 변수가 무조건 달라야함!)
	
	/*
	 * 
	 * * 결론
	 * 오버로딩 : 동일한 메소드명을 사용하는 것
	 * 			단, 접근 제한자, 반환형을 떠나서 매개변수가 무조건 달라야함!
	 * 
	 * 
	 */
}
