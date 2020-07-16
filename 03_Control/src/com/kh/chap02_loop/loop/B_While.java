package com.kh.chap02_loop.loop;
import java.util.Scanner;
public class B_While {

	
	
	/*
	 *  *while 문 == 위치만 다를뿐  for문과 실행 순서는 동일
	 *  
	 *  초기식;
	 *  
	 *  while(조건식 (주로 메소드를 기입)) {
	 *  	반복적으로 실행시키고자 하는 구문
	 *  	증감식;
	 *  }
	 *  
	 */
	
	
	public void method1() {
		
		int i =1;
		
		while(i<=5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		i = 1;
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		i = 5;
		while(i>=1) {
			System.out.print(i + " ");
			i--;
			
		}
		
	}
	
	public void method2() {
		// 1에서부터 10까지 호술만 출력
		// 1 3 5 7 9
		
		int i = 1;

			while(i<=10) {
				if(i % 2 != 0) {
					System.out.print(i + " ");
	
				}
				i++;
			}
			
		
			System.out.println();
		
		i = 1;
		
			while(i<=10) {
				System.out.print(i + " ");
				i+=2;
			}
		
	}
	
	public void method3() {
		// 1에서부터 랜덤한 수(1~50)까지의 합계
		
		int i = 1;
		int random = (int)(Math.random()*50 +1);
		int sum = 0;
		
		System.out.println("랜덤값 : " + random);
		
			while(i<=random) {
			
				sum += i;
				
				i++;
				
			}
			System.out.println("\n1부터" +random + "까지의 합계  : " + sum);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요 : ");
		String str = sc.nextLine();
		
		
		int i = 0;
		
		while(i < str.length()) {
			
			System.out.println(i + "번째 문자 : " + str.charAt(i));
			
			i++;
		}


	}
	
	public void method5() {
		//사용자가 입력한 단 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수를 입력해주세요(2~9) : ");
		int dan = sc.nextInt();
		int result = 0;
		int su = 1;
		if(2 <= dan && dan <= 9) {
			
			while(su<=9) {
				
				result = dan*su;
				
				System.out.printf("%d x %d = %d\n",dan,su,result);
				
				su++;
			}
			
			
		}else { System.out.println("2에서 9사이의 숫자를 입력해야 합니다.");
		
		}
		
		
		
		
		
	}
	
	
}
