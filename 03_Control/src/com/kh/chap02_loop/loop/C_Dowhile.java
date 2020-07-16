package com.kh.chap02_loop.loop;

public class C_Dowhile {

	
	/*
	 *  * do-while문
	 *  
	 *  
	 *  
	 *  초기식;
	 *  
	 *  do {
	 *  		반복적으로 실행할 코드(어떤 조건 없이 한번은 실행)
	 *  		증감식;
	 *  
	 *  }while(조건식);
	 * 
	 * 초기식 -> 무조건 실행 -> 증감식 -> 조건식 true면 실행 -> 증감식
	 * 							
	 * 
	 * 
	 * 
	 */
	
	public void method1 () {
		
		int num = 1;
		
		
		do {
			System.out.println(num);
			
			
		}while(num==0);
		
		
		
		
	}
	public void method2 () {
		// 1 2 3 4 5
		
		int num = 1;
		
		do {
			System.out.print(num++ + " "); // 후위연산자 기록해주면 출력은 기존값 나중에는 더해준다. 더 간결한 코딩
			
			
		}while(num<=5);
		
		
	}
	
	public void method3 () {
		// 1부터 랜덤값(11~ 20)까지의 합계
		
		int i = 1;
		
		int random = (int) (Math.random()*10 +11);
		int sum = 0;
		
		do {
			
			sum += i++;
		
		}while(i<=random);
		
		System.out.printf("1부터 %d까지의 합계 : %d ",random,sum);
		System.out.println();
	
		
	}
	
	
	
}
