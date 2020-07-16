package com.kh.chap03_branch.branch;
import java.util.Scanner;
public class A_break {

	/*
	 *  * break문 : break문이 기술되어 있는 "가장 가까운 반복문"을 빠져나가는 문구
	 * 
	 */
	
	
	public void method1 () {
		
		// 사용자가 문자열 입력받은 후 그 입력받은 문자열 출력(이 내용을 계속 반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복을 종료하게끔
		
		Scanner sc = new Scanner(System.in);
		
		
		/*for(;;) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			
			System.out.println(str);
			
			if(str == "exit") {
				
				break;
				
			}
		}*/
		
		while(true) {
			
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			
			System.out.println(str);
			
			if(str.equals("exit")) { //*** 문자열 동등 비교는 변수.equals(비교할 문자열) ***
				
				break;//반복문을 강제로 빠져나가게 하는 구문
			}
			
		}
				
				
		
			System.out.println("프로그램을 종료합니다.");
		
		
		
	}
			
	public void method2() {
		
		//매번 랜덤값을 발생(1~10)발생 시킨후 출력
		//단, 그 랜덤값이 홀수 일 경우 반복문을 빠져나가
		
		
		
		while(true) {
			int random = (int) (Math.random()*10 +1);
			
				
			
			
			System.out.println(random);
			
			if(random % 2 == 1) {
				
				break;
				
				}
			
			
		}
			
			
		System.out.println("출력을 종료합니다.");
		
		
	}
			
	public void method3() {
		
		//사용자에게 정수 두개 입력 받고, 연산자를 입력받고
		// 연산자를 잘못 입력했을 경우에는 빠져나가 도록
		//단, 연산기호 잘못 입력하면 반복문 빠져나가도록
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			int result = 0;
			
			System.out.print("정수 1 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수 2 입력 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("연산기호(+,-) 입력 : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == '+') {
				result = num1 + num2;
			
			}else if(ch == '-') {
				result = num1 - num2;
			}else {
				
				System.out.println("연산자를 잘못 입력하였습니다. 프로그램을 종료합니다.");
				break;
			}
			
			 System.out.println("result 값 : " + result); 
			
			
			
			
		}
		
		
		
		
		
	}
	
	
}
