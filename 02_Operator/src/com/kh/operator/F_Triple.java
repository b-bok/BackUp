package com.kh.operator;
import java.util.Scanner;
public class F_Triple {
	
	
	/* 
	 * *삼항연산자  : 항목이 3개인 연산자
	 *	
	 *
	 * [표현법]  조건식  ? 조건식이 true일 경우 결과값 1 : 조건식이 false일 경우 결과값 2
	 * 
	 * 조건식은 반드시 true 또는 false가 나오게끔 작성해야함
	 * 주로 조건식에 비교/논리 연산자 사용됨
	 * 
	 */
	public void method1() {
		// 사용자가 입력한 값이 양수인지 아닌지 판별 후 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		//조건식 ? 참일때 값 : 거짓일때 값
		
		//System.out.println(num > 0 ? "양수" : "양수가 아님");
		String result = (num > 0 ? "양수" : "양수가 아님");
		System.out.println("사용자가 입력한" + num +"은(는)" + result);
		
		
	}
	
	
	public void method2() {
		
		/*
		 * 사용자가 두개의 정수값을 입력받아서
		 * 두정수 값의 곱셈 결과가 100보다 큰 경우 "결과가 100이상입니다."
		 * 						아닌경우 "결과가 100보다 작습니다."
		 * 
		 * 
		 *
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 정수값 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수값 : ");
		int num2 = sc.nextInt();
		
	
		
		String result =  ((num1 * num2)>= 100 ? "결과가 100이상입니다." : "결과가 100보다 작습니다.");
		System.out.println((num1 * num2) + "은(는)" + result);
		
	}
	
	
	public void method3() {
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		//String result = (num % 2  == 0 ? "짝수이다" : "홀수이다");
		String result = (num % 2 != 1 ? "짝수이다." : "홀수이다.");
		
		
		System.out.println(num + "은(는)" + result);
		
	
	}
	
	public void method4 () {
		//사용자에게 입력 받은 영문자가 대문자인지 소문자인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		// ch >= 'A' && ch <= 'Z'
		String result = ('A' <= ch && ch <= 'Z' ? "대문자입니다." : "대문자가 아니다.	");
		
		System.out.println(ch + "은(는)" + result);
		
	}
	
	
	public void method5 () {
		// 사용자가 입력한 정수값이 양수인지 음수인지 0인지 정확히 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		//String result = (num > 0 ? "양수" : (num == 0 ? "0" : "음수"));
		String result = (num > 0 ? "양수이다." : (num < 0 ? "음수" : "0"));
		
		
		System.out.println(num + "은(는)" + result + "입니다.");
		
		
		
		
		
	}
	
	
	public void method6 () {
		
		// 두개의 정수값을 입력받고
		// + 또는 - 를 입력 받아 그에 해당하는 연산 결과 출력
		
		
		// + 입력했을 경우 덧셈 연산 결과를 출력
		// - 입력했을 경우 뺄셈 연산 결과를 출력
		// 그 외의 문자를 입력했을 경우 "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수값 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수값 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // 남아있는 엔터 없에기
		
		System.out.print("+/-기호를 입력해주세요 ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == '+' ? (num1 + num2) + "" : (ch == '-' ? (num1 - num2) + "" : "잘못입력하셨습니다."));
		// int 계산값 더하기 ""으로 문자열로만들어줌
		System.out.println("결과는 " + result );
		

		
	}
	
	

}
