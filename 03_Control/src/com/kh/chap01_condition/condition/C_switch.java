package com.kh.chap01_condition.condition;
import java.util.Scanner;
public class C_switch {
	/*
	 * switch문과 if문의 차이점
	 * 
	 * if문은 조건식에서 범위지정 가능(대소비교 연산자) + 동등비교 + && ||(논리연산자)
	 * switch문 확실한 값의 조건! only 동등비교만 가능
	 * switch문은 if랑 다르므로 break를 걸어서 빠져나가게 만들어줘야한다.
	 * default = else와 비슷, 위의 조건이 만족하지 않을 경우 반드시 실행할 코드 , 생략 가능
	 * 
	 * switch(동등비교할 대상자) { // 동등 비교할 대상자의 경우 반드시 int값, char값, String값만 가능하다.//double형 불가능
	 * case 값1 : 실행할 코드1; break;
	 * case 값2 : 실행할 코드2; break;
	 * case 값3 : 실행할 코드3; break;
	 * ... 
	 * [default : 위의 조건이 만족하지 않을 때 반드시 실행할 코드] = 생략가능 , break 걸을 필요 없음
	 *}
	 * 
	 * 비교할 대상자 == 값 1의 조건이 true 일 경우 실행코드 1수행후 break 만나 빠져나감
	 * 단, false 일경우 값2와 다시 동등비교 수행...
	 * 
	 * case 제시한 모든 값들과 일치하지 않을경우 default에 제시되어있는 구문이 반드시 실행!! == else 문과 유사
	 * 
	 * * 주의할 점
	 * if - else if문과 다르게 실행코드를 실행하고 자동으로 빠져나가지 못해서 break를 걸어줘야함.
	 * 
	 * 
	 */
	
	public void method1 () {
		//사용자에게 1~3사이의 정수를 입력받아
		// 1인 경우 "빨간색입니다." 출력
		// 2인 경우  "파란색입니다." 출력
		// 3인 경우  "초록색입니다." 출력
		// 잘못 입력했을 경우 "잘못입력하였습니다." 출력 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3사이의 정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		/*if(num == 1) {
			System.out.println("빨간색입니다.");
			
		}else if(num == 2) {
			System.out.println("파란색입니다.");
			
		}else if(num == 3) {
			System.out.println("초록색입니다.");
			
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		*/
		
		switch(num) {
		case 1 : System.out.print("빨간색입니다."); break;
			
		case 2 : System.out.print("파란색입니다."); break;
			
		case 3 : System.out.println("초록색입니다."); break;
			
		default : System.out.println("잘못입력하였습니다.");
		}
		
		
		
		
	}
	
	public void method2() {
		
		//사용자에게 과일이름(사과, 바나나, 복숭아, 키위)
		//사과일 경우 = > 1000
		//바나나 => 2000
		//복숭아 => 5000
		// 키위  => 4000
		// 잘못입력하면 => 잘못입력하였습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 이름을 알려주세요(사과, 바나나, 복숭아, 키위) : ");
		String fruit = sc.nextLine();
		int price = 0;
		
		switch(fruit) {
			case "사과" : price = 1000; break;
			case "바나나" : price = 2000; break;
			case "복숭아" : price = 5000; break;
			case "키위" : price = 4000;; break;
			default : System.out.println("잘못 입력하였습니다."); return;
		}
		
		System.out.printf("%s의 가격은 %d원입니다.",fruit,price);
		
	}
	
	
	public void method3() {
		
		//break가 없는 switch문 사용
		
		// 사용자에게 등급(1, 2, 3)을 입력 받은 후
		// 3등급일 경우 관리권한, 글쓰기 권한, 읽기 권한
		// 2등급일 경우 글쓰기 권한, 읽기 권한
		// 1등급일 경우 읽기 권한
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력해주세요(1, 2, 3) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 3 : System.out.println("나 관리 권한 있어");
		case 2 : System.out.println("글쓰기 권한 있어");
		case 1 : System.out.println("읽기 권한 있어"); break;
		default : System.out.println("잘못입력하였습니다.");
		}
		
		
		
	}
	
	public void method4 () {
		
		// 해당 월의 마지막 날을 출력할 것이다.
		// 1, 3,5,7,8,10,12 => 입력하신 월은 31일 까지입니다.
		// 4,6,9,11 => 입력하신 월은 30일까지입니다.
		// 2월 => 입력하신 월은 28일까지입니다.
		// 잘못 입력했을 경우  => 반드시 1~12월까지 입력해야햡니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월에서 12월 사이의 해당 하는 달을 입력해주세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: 
		case 3:
		case 5:	
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("입력하신 월은 31일까지 입니다."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("입력하신 월은 30일까지 입니다."); break;
		case 2: System.out.println("입력하신 월은 28일 또는 29일까지 입니다."); break;
		default : System.out.println("잘못입력하였습니다."); break;
		
		}
		
		
		
		
		
		
		
	}
	
	
	
}
