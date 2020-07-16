package com.kh.chap01_condition.condition;
import java.util.Scanner;
public class A_if {
	
	/*
	 * 1. 단독 if문
	 * 
	 * if(조건식) {
	 * 		.. 실행할 코드..;
	 * 
	 * --> 조건식의 결과가 참(true)일 경우 중괄호의 안의 코드 실행
	 * --> 조건식의 결과가 거짓(false)일 경우 중괄화 안의 코드 실행 하지 않고, 넘어감
	 * }
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : " ); 
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수다.");
		}
		if (num <= 0) {
			System.out.println("양수가 아니다.");
		}

	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다.");
		}
		if(num % 2 == 1) {
			System.out.println("홀수다.");
		}
		
	}
	
	public void method3() {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble(); 
		String result = ""; //지역변수 만들 때 반드시 기본값 초기화 습관을 가지자!
		
		if(gender == 'M'|| gender == 'm' ) {
			result = "남";
		}
		if(gender == 'F'|| gender == 'f') {
			result = "여";
		}
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("잘못입력하였습니다.");
			
			return; //이 메소드를 실행했던 method3(); 빠져 나감.
		}

		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2fd이다.",
							grade, classNum, num, name, result, score);		
	}
	
	
	public void method4() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 단독 if문은 각자가 관련이 없기 때문에 반드시, 명확하게 구분지어줘야한다.
		// if - else가 편하다.
		if(age > 19) {
			System.out.println("어른");
		}
		if(13 < age && age <= 19) {
			System.out.println("청소년");
		}
		if(age <= 13) {
			System.out.println("어린이");
		}
		
	}
	
	
	
	
}
