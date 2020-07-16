package com.kh.operator;
import java.util.Scanner;
public class E_Logical {
	
	/*
	 *  *논리 연산자!(이항 연산자)
	 *  - 두 논리값을 가지고 연산한다!
	 *  
	 *  
	 *  논리값 &&(and) 논리값 : 두 논리값 모두 true여야 결과도 true
	 *  논리값 ||(or)  논리값 : 두 논리값 중 하나만 true여도 결과가 true
	 *  
	 *  
	 * 
	 */
	
	
	public void method1() {
		//사용자가 입력한 정수가 1 이상 100 이하의 수인지 확인하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println(num1 >= 1 && num1 <= 100 );
		//System.out.println(!(num1 <=1 || num1 >= 100));
		// &&(and 연산자)의 의미 : ~하고, 그리고, ~하면서, ~이고 
		// 두개 조건이 모두 true여야만 결과값 true
		// && 하나만 false 면 결과값은 false

	}

	public void method2() {
		// 사용자가 입력한 영문자가 대문자 인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 영문자가 대문자 인가요?");
		char ch = sc.nextLine().charAt(0);
		// 영문자 'A' ~ 'Z' (65 ~ 90까지의 숫자로 연달아 나열되어있음)
		System.out.println(ch >= 'A' && ch <= 'Z');
		// 아스키코드표(0~127 : 영문자, 숫자, 특수문자)
		// 유니코드표(0~65535 : 한글포함)
		
		//boolean result  = (ch >= 'A' && ch <= 'Z');
		boolean result  = ('A' <= ch && ch <= 'Z');
		
		System.out.println("사용자가 입력한 값이 대문자 인가요? : " + result);
		
	}
	
	public void method3() {
		
		// (종료하시겠습니까? y 또는 Y를 입력해주세요)
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 값이 y 또는 Y인지 확인하기
		System.out.print("종료하시려면 y또는 Y입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = ('y' == ch || ch == 'Y');
		// ||(or) : ~이거나, ~또는 
		// 두개의 조건 중 하나만 만족한다면 true 모두 false 이면 결과갑도 false
		
		
		
		System.out.println("사용자가 입력한 값이 소문자 y 또는 Y인가요? : " + result);
		
		
		/*
		 *  && : 두개의 조건이 모두 만족해야만 true(And)
		 *  !! true && true = true !!
		 *  true && false = false
		 *  false && true = false
		 *  false & false = false
		 *
		 *  --> && 앞의 결과가 false이면 뒤의 조건은 실행하지 않음(어차피 false이기 때문에)
		 *  
		 *  || : 두개의 조건이 하나라도 true이면 결과값은 true이다.
		 *  true || true = true
		 *  true || false = true
		 *  false || true = true
		 *  false || false = false
		 *  
		 *  --> || 앞의 결과가 true이면 뒤의 조건은 실행하지 않음(어차피 true이기 때문에)
		 *  
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}
	
	public void method4() {
		
		boolean result  = true || false; // Dead code = 굳이?
		
		int num = 10;
		System.out.println("&& 연산 전의 num값 :" + num);
		
		//num이 5보다 작고 0보다 크나요?
		boolean result1 = (5 > num && ++num > 0); // false && true -> 즉 뒷 조건은 실행이 안될 것이다.
		System.out.println("result1 : " + result1);
		
		System.out.println(num); // num = 10 ++num이 시행되지 않았음
		
		
		boolean result2 = (num < 20 || ++num > 0);
		System.out.println("||연산 후의 num값 : " + num);
	}
	

	
	
	
	
	
	
	
	
	
}
