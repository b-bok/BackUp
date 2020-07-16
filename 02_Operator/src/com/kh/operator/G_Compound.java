package com.kh.operator;

public class G_Compound {

	/*
	 *  복합 산술 대입 연산자  : 산술연산자와 대입산자를 함께 사용하는 연산자
	 * 					 연산 처리 속도가 훨씬 빠름
	 * +=, -= *= /= %=
	 * 
	 * a = a + 3;  a += 3;
	 * a = a - 3;  a -= 3;
	 * a = a * 3;  a *= 3;
	 * a = a / 3;  a /= 3;
	 * a = a % 3;  a %= 3;
	 *  
	 */
	
	public void method() {
		
	int num = 12;
	
	System.out.println("기존의 num값 : " + num);  //12
	
	// 3증가 시키기
	num = num + 3;
	System.out.println("3증가 시킨 num값 : " + num); //15
	
	// num을 또 3증가 시키기
	/*
	num++;
	num++;
	num++;
	*/
	
	num += 3; // 반드시 산술연산자 대입연산자 순서를 지켜야 복합연산자이다.
	System.out.println("추가로 3증가 시킨 num : " +num);
	
	// num을 5 감소시키기
	
	num -= 5; // num = num - 5; 동일하지만 더 빠른 연산속도
	System.out.println("5감소 시킨 num : " + num);
	
	// num 6배 증가
	
	num *= 6;
	
	System.out.println("6배 증가 시킨 num : " + num);
	
	// num 2배 감소
	
	num /= 2;
	System.out.println("2배감소시킨 num : " +num);
	
	// num을 4로 나눴을 때 나머지
	
	num %= 4;
	System.out.println("4로나눈 나머지 : " + num);
	
	
	String str = "Hello";
	
	System.out.println("str : " + str);
	
	str += "world";
	System.out.println("str : " + str);
	
	str += 2;
	System.out.println("str : " + str);
		
	}
	
}
