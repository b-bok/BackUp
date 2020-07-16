package com.kh.first;
								// 패키지 패키지    클래스이다.
public class B_ValuePrinter { // com.kh.first.B_ValuePrinter()

	/*
	 *  **원칙**
	 *  1. 클래스명은 == 대문자로 시작
	 *  2. 패키지 명은 == 소문자로 시작
	 *  3. 메소드명은 == 소문자, 단, 여러 단어 조합할때  대문자 섞어쓰는 낙타기법
	 *  4. 변수명 == 소문자로 시작하라

 	 */
		
	// 다양한 종류의 값들을 출력하는 기능의 메소드
	
	public void printValue() {
		// 1. 숫자 출력
		// 
		System.out.println(123);
		System.out.println(1.23);
		System.out.println("오늘 수업은" + 9+ "시" +43+ "분" + "에 끝났다.");
		
		
		//2. 문자(한글자)
		System.out.println('a'); // 한글자는 홑따옴표 이용
		System.out.println('b');
		
		
		
		//3. 문자열(여러글자)
		System.out.println("abc");
		System.out.println("안녕\n하세요"); //출력문 안에서 줄바꾸고 싶으면 개행문자 \n(\은 원화 키)
		System.out.println("반갑습니다");
		
		
		// 4. 연산한 결과값도 출력가능
		
		System.out.println(2*123);
		System.out.println((float) (1.23 - 0.12)); // 컴퓨터의 실수값 연산은 불완전함
		
		// 5. 문자와 숫자는 연산 가능함
		
		System.out.println('복' + 1);  // 각 문자마다 컴퓨터가 인식하는 고유한 숫자 가지고있음  a == 97
		
		// 6. 문자열("")과 숫자는 연산 가능하다. 단 덧셈 연산만 가능 --> 문자열화 함
		
		System.out.println("파이" + '리'); // 하이a 실질적인 문자열이 되어버렸따!
		System.out.println("안녕하세요" + 123456789);
		System.out.println("반갑다" + "Fuck You");
	}
	
	// 문자와 숫자간의 덧셈의 연산 기능 메소드
	
	public void sumStringNumber() {
		
		System.out.println(9 + 9); // 18
		System.out.println(9 + "9");  //99
		System.out.println("9" + 9); //99
		System.out.println(9 + 9 + "9"); // 순서대로 9+9 = 18 + 9 = 189
		System.out.println(9 + "9" +9 ); // 순서대로 "99" + 9 가 더해지는 
		System.out.println("9" + (9 + 9)); // 괄호로 묶는 순간 우선순위 변경
		
		
		
		
		
		
	}
	
	
	
}
