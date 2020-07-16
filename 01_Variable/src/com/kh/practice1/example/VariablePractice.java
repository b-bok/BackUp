package com.kh.practice1.example;
import java.util.Scanner;

/**
 * alt + shif + j를 누르면 주석이 생성되어 설명 가능하다./ 만든 개발자 이름 써놓는 편;
 *
 */
public class VariablePractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키" + height +"인 " + age + "살" + gender + "자" + name + "님 반갑습니다^^");
		
		
	}
	
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int plus = num1 + num2;
		int subtract = num1 - num2;
		int multifly = num1 * num2;
		int division = num1/num2;
		
		System.out.println("더하기 결과 : " + plus);
		System.out.println("빼기 결과 :" + subtract);
		System.out.println("곱하기 결과  : " + multifly);
		System.out.println("나누기 몫 결과 : " + division);
		
		
		
		
	}
	
	
	public void method3() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double h = sc.nextDouble();
		
		System.out.print("세로 : ");
		double v = sc.nextDouble();
		
		double area = h*v;
		double round = ((h+v) * 2);
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
		
	
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		
		/* 1번 방법
		char word0 = word.charAt(0); //문자열.charAt(); 가능
		char word1 = word.charAt(1);
		char word2 = word.charAt(2);
		*/
		// 2번 방법
		System.out.println("첫 번째 문자 : " + word.charAt(0));
		System.out.println("두 번째 문자 : " + word.charAt(1));
		System.out.println("세 번째 문자 : " + word.charAt(2));
		
		
		
		
		
	
		
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
