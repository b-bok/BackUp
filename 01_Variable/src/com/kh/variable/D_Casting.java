package com.kh.variable;

public class D_Casting {

	//형변환 가즈아! = 자료형 값 바꾸기
	
	/*
	 *  컴퓨터의 값처리 규칙에 따라(즉, 형변환이 필요한 시점은?)
	 *  1. 같은 자료형 값만 대입 됨!
	 *  ex) 자료형 변수명 = (바꿀 자료형) 값; 다른 자료형 값을 대입하고 싶다면!
	 *  
	 *  2. 계산은 같은 자료형 끼리만(그 결과 도 역시 같은 자료형으로!)
	 *  
	 *  
	 *  *형변환 종류*
	 *  1. 자동 형변환 : 자동으로 형변환 되어 명시할 필요 없음
	 *  2. 강제 형변환 : 직접 형변환 ! = 명시적 형변환
	 *  [표현법] (바꿀자료형)값;
	 *  
	 *  *주의사항*
	 *  boolean 형변환 불가 오로지 true/false 값만 가짐
	 *  
	 *  
	 * 
	 */
	
	//1. 자동 형변환
	
	public void casting1() {
		// 작은 자료형이 자동으로 큰 자료형으로 변환 (작고 큰 것은 바이트 수에 따라)
		
		// 1. int(4byte) --> double(8byte)
		
		int i1 = 12;
		// 대입 연산
		double d1 = i1; // (double) i1;
		
		System.out.println("d1 : " + d1);
		
		// 산술 연산
		
		int i2 = 12;
		double d2 = 3.3;
		double result2 = i2 + d2; 
		// (double) i2 + d2 12 + 3.3 => 12.0 + 3.3 => 15.3  
		
		System.out.println("result2 : " + result2 );
		System.out.println("================");
		
		
		//2. float(4byte) --> double(8byte)
		float f3 = 14.5f;
		double d3 = 11.444;
		
		double result3 = f3 + d3;
		
		System.out.println("f3 : " + f3);
		System.out.println("d3 :" + d3);
		
		
		System.out.println("result3 : " + result3);
		
		// 3. int(4byte) --> long(8byte)
		
		int i4 = 144444444;
		long l4 = i4; // = (long) i4;
		
		System.out.println("i4 + l4 :" +(i4 + l4)); // int형이 long형 자료형으로 변환 된것
		
		
		
		// 4. long(8byte) --> float(4byte)
		//		정수형			실수형 
		// 실수형은 어떠한 정수형보다 훨씬 더 큰 범위 값 저장 가능
		long l5 = 1_000_000_000L;
		float f5 = l5;
		// byte short int long float double
		// 	1	 2     4    8    4     8
		
		System.out.println("f5 : " + f5);
		
		// *특이케이스*
		// char(2byte) <--> int(4byte) 쌍방향
		// 'a' '!' '강' 'A' 은 고유한 숫자값이 있다.
		
		char ch = 65; //char 65 == A  66 == B 67 == C
		
		System.out.println("ch : " + ch);
		
		int i6 = 12;
		
		System.out.println("c6 + i6 : " + (ch + i6));
		
		
		
		
		// byte , short간의 연산은 모두 int로 취급
		
		byte b1 = 1;
		byte b2 = 10;
		
		byte result = (byte) (b1 + b2);
		
		System.out.println("b1 + b2 : " + result);
		
		
		
	}
	
	
	public void casting2() {
		// 강제 형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 변환 과정
		
		// double(8) --> float(4)
		
		double d = 4.0;
		float f = (float) d;
		
		// double(8) --> int(4)
		
		double d2 = 162.23;
		int i2 = (int) d2; //실수형을 정수형으로 변환했을 때 데이터 손실 발생 가능
		
		System.out.println("i2 : " + i2);
		
		
		int iNum = 10;
		double dNum = 5.11;
		
		int iSum = (int) (iNum + dNum);
		
		System.out.println("iSum : " + iSum);
		// 강제 형변환 하면 소수점 아래부분은 버려버림(데이터 손실)
		// (double) 10 + 5.11 -> 15.11(double) -> 15 (int)
		// 해결방법 1. 연산결과값을  int형으로강제 형변환
		// 해결방법 2. double형을 int형으로 강제 형변환 후 덧셈연산 
		
		int iSum2 = iNum + (int) dNum;
		// 10 + (int)5.11 -> 10 + 5 => 15 (데이터 손실 발생)
		System.out.println("iSum2 : " + iSum2);
		
		// 해결방법 3. 연산 결과를 double형 변수에 기록하기
		
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
