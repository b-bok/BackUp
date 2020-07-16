package com.kh.chap03_branch.branch;

public class B_Continue {

	/*
	 * 
	 *  continue : continue;를 만나게 되면 그 뒤에 구문을 실행하지 않고
	 *  			가장 가까운 반복문 위로 올라가라는 의미
	 * 
	 */
	
	public void method1() {
		
		// 1부터 10까지의 홀수 출력
		// 1 3 5 7 9 
		
		
		for(int i = 1; i<=10; i++) {	
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		
		for(int i=1;i<=10;i++) {
			
			if(i%2 == 0) {// 짝수 일경우 => 뒤의 내용 수행하지 않고, 다시 반복문 위로 올라가라!
				
				continue;
			}
			
			System.out.print(i + " ");
			
		}
		
	}
	public void method2 () {
		// 1에서 100까지 정수들의 합계 구하기
		// 단, 6의 배수값은 빼고 덧셈 연산하라
		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			
			if(i%6 == 0) { // 6의 배수일 경우 뒤의 내용을 수행하지 않고, 다시 반복문 위로 올라가!
				
				continue;
			}
			
			
			sum += i;
			

		}
		
		System.out.println("1부터 100까지 총합(6의배수 제외) : "  + sum);
		
	}
	public void method3 () {
		// 2~9단 까지의 구구단 출력
		// 단 4의 배수단은 빼고 출력하세요(4단, 8단 제외)
		
		int result = 0;
		
		for(int i =2; i<=9; i++) {
			
			
		
			if(i%4 == 0) { // 4의 배수일 경우
				
				continue; //continue만나는 순간 뒤에 내용은 실행 안하고 위로 올라가!
				
			}
			
			System.out.println("==" + i + "단 ==");
			
			for(int j = 1; j<=9; j++) {
				
				if(j % 2 == 0) {
					
					continue; // 2의 배수 곱하기도 실행 하지마라!
				}
				
				result = i*j;
				System.out.printf("%d x %d = %d\n",i,j,result);
	
			}
			
			
			
			
			
		}
		
		
		
		
		
	}
}
