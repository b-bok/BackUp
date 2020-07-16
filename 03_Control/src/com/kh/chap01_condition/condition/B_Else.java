package com.kh.chap01_condition.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * 2. if-else문
	 * 
	 *  if(조건식) {
	 *  	.. 실행코드1..
	 *  }else {
	 *  	.. 실행코드2..
	 *  }
	 *  
	 *  조건식이 true인 경우 실행코드 1을 수행하고 나서 if-else문을빠져나간다.
	 *  조건식이 false인 경우 실행코드 2를 무조건 수행하고 if-else문을 빠져나간다.
	 *  
	 *  
	 *  3. if-else if문
	 * 
	 * 같은 비교 대상으로 여러개의 조건을 제시할 경우
	 * 
	 * if(조건식1) {
	 * 		..실행코드1 ..
	 * 
	 * }else if(조건식2) {
	 * 		..실행코드2 ..
	 * 
	 * }else if(조건식3) {
	 * 		..실행코드3 ..
	 * 
	 * }[else {
	 * 		..실행코드4 ..
	 * }] []는 생략가능 위의 조건들이 모두다 false일 경우, 반드시 실행할 내용이 있다면 else를 사용한다.
	 * 
	 * 조건식1의 경과가 true라면 실행코드1 수행후 빠져나감
	 * 단, 조건식 1의 결과가 false이면 조건식 2수행후 true이면 실행코드 2수행하고 빠져나감
	 * 
	 * 
	 * 단, else 구문이 제시된 경우 조건 모두가 false이면 무조건 esle구문 실행
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	public void method1 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		/*
		if(num > 0) {
			System.out.println("양수이다.");
		}else {
			System.out.println("양수가 아니다.");
		}
		*/
		
		
		if (num >0 ) {
			System.out.println("양수다.");
			
		}else if(num == 0) {
			System.out.println("0이다.");
			
		}else { 
			System.out.println("음수다.");
		}
				
	}
	
	public void method2 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0이다.");
			
		}else if(num % 2 == 0) {
			System.out.println("짝수다.");
		}else {
			System.out.println("홀수다.");
		}
		
		
	}
	
	public void method3 () {
		
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
		
		String result  = "";
		
		if(gender == 'M' || gender == 'm') {
			result = "남";
		}else if(gender == 'F' || gender == 'f') {
			result = "여";
		}else {
			System.out.println("잘못입력하였습니다.");
			
			return;
		}
		
		
	
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2fd이다.",
				grade, classNum, num, name, result, score);	
	}
	
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		 /*if(age > 19) {
			System.out.println("성인");
		}else if(age > 13) {
			System.out.println("청소년");
			
		}else {
			System.out.println("어린이");
		}
		*/
		
		if(age <=13) {
			System.out.println("어린이");
			
		}else if(age <= 19) {
			System.out.println("청소년");
			
		}else {
			System.out.println("성인");
			
		}
		
	
		
		
		
		
	}
			
			
	public void method5 () {
		//새로운 예시
		// 사용자가 입력한 점수가 90이상이면 A등급
		// 90점 미만 80점 이상이면 B등급
		// 80점 미만 70점 이상이면 C등급
		// 70점 미만 60점 이상이면 D등급
		// 그외 F등급
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String grade = "";
		
		if(score >= 90) {
			grade = "A등급";
		}else if(score >= 80) {
			grade ="B등급";
		}else if(score >= 70) {
			grade ="C등급";
		}else if(score >= 60) {
			grade ="D등급";
		}else {
			grade ="F등급";
			
		}
			
		System.out.printf("당신의 점수는 %d점이고, 등급은 %s입니다.",
						score, grade);	
			
	}
	
	public void method6 () {
		// 위의 문제에 각 등급별 중간 점수 이상의 경우
		// 등급에 + 라는 문자를 추가해서 출력
		// ex) 95점 이상이면 A+ 87 => B+ 77 => C+ 68 => D+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String grade = "F등급";
		
		if(score >= 90) {
			grade = "A등급";
			
			if(score >= 95)
			grade = "A+";  // grade += "+";
			
		}else if(score >= 80) {
			grade ="B등급";
			
			if(score >= 85)
				grade = "B+"; // grade += "+";
			
		}else if(score >= 70) {
			grade ="C등급";
			
			if(score >= 75)
				grade = "C+";// grade += "+";
			
		}else if(score >= 60) {
			grade ="D등급";
			
			if(score >= 65)
				grade = "D+"; // grade += "+";
		}
			
		System.out.printf("당신의 점수는 %d점이고, 등급은 %s입니다.",
						score, grade);	
		
		
	}
	
	
	public void method7 () {
		// 새로운 예시
		
		// 사용자에게 이름을 입력받은후 
		// 사용자가 입력한 이름이 "강보람"과 일치하면  => "본인입니다."
		// 						그게 아닐경우  => "본인이 아닙니다."
		
		// 문자열간의 동등비교는 연산자가 아닌 equals() 메소드를 통해 비교해야만 함.
		
		// 문자열.charAt(인덱스) => '문자'
		// 문자열.equals(문자열) => true / false 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		
		if(name.equals("강보람") ) {
			System.out.println("본인입니다.");
		}else {
			System.out.println("본인이 아닙니다.");
		}
		
		// 기본자료형값(int, char, double, boolean...) => 연산자 사용가능
		// 참조자료형(String) => equals(); 를 써야함
		
		
	}
	
	
	
	
	
	
	
	
	
}