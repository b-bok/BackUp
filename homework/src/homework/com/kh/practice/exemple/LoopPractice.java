package homework.com.kh.practice.exemple;
import java.util.Scanner;

//정찬복

import java.util.Scanner;
public class LoopPractice {

	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

			if(num>=1) {
				for(int i = 1; i<=num; i++) {
					
					System.out.print(i + " ");
					
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.다시 입력해주세요");
			
			while(true) {
				
				System.out.print("1이상의 숫자를 입력하세요 : ");
				int num2 = sc.nextInt();
				
				for(int i = 1; i<=num2; i++) {
					
					System.out.print(i + " ");
				}
					System.out.println();
					
					break;
			}
		
		}
	
	
	
}

	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		
		if(num1 >= 1) {
			for(int i = num1; 1<=i;i--) {
				
				System.out.print(i + " ");
			}
			
		}else { 
			System.out.println("잘못 입력하셨습니다.다시 입력해주세요");
			while(true) {	
				System.out.print("1이상의 숫자를 입력해주세요 : ");
				int num2 = sc.nextInt();
				if(num2 > 1) {
					for(int i = num2; 1<=i;i--) {
						
						System.out.print(i + " ");
					}
						System.out.println();
						
						break;
				}

			}

		}
	
}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();
		
		int sum = 0; // 1에서 사용자가 정한 정수까지의 합
		
		// 1부터 사용자에게 입력 받은 수까지의 합
		// 1 출력 sum 1 더함 2출력 sum 2더함
		//
		for(int i =1; i<=num1; i++) {
			
			System.out.print(i + " ");
			
			sum += i;
			
			if(i<num1){
				System.out.print( " + ");
			}

		}
			System.out.print(" = " + sum);
			
	}
			
			
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자  : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2); // 작은 값
		int max = Math.max(num1, num2); // 큰 값 구별 완료
		
		if(min > 0 && max > 0) { // 작은값 큰값 모두 0보다 클 경우에만
			
			for(int i = min ; i<=max ; i++) { // 작은값에서 큰값까지 수를 나열 한다.
				
				System.out.print(i + " ");
				
			}
			

		}else {// 숫자가 0이 포함되거나, 0보다 작은 경우 다시 물어본다. , 0보다 큰 수를 쓸 때까지 반복해서 물어본다.
				
			while(true) {
				System.out.println("1이상의 숫자를 입력해 주세요");

				System.out.print("첫 번째 숫자  : ");
				num1 = sc.nextInt();
				
				System.out.print("두 번째 숫자 : ");
				num2 = sc.nextInt();
				
				min = Math.min(num1, num2); // 작은 값
				max = Math.max(num1, num2); // 큰 값 구별 완료
				
				if(min > 0 && max > 0) { // 작은값 큰값 모두 0보다 클 경우에만
					
					for(int i = min ; i<=max ; i++) { // 작은값에서 큰값까지 수를 나열 한다.
						
						System.out.print(i + " ");
						
					}
						System.out.println();
						break;
				} 
			
			}	
		
	}
	
	}	
	
	public void method8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
			
		System.out.println("====" + dan + "단====");
			
			for(int su =1; su<=9; su++ ) {
				
				int result = dan*su;
				
				System.out.printf("%d x %d = %d\n",dan,su,result);
				
				
			}
			
	}
		
		public void method9 () {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if(2<=dan && dan<=9) {
				
				for(int i = dan; dan<=9; dan++) {
					
					System.out.println("====" + dan + "단====");
											
					for(int su = 1; su<=9; su++) {

						int result = dan*su;
						
						System.out.printf("%d x %d = %d\n",dan,su,result);
					
					
					}
				}
				
				
			}else {
				while(true) {
					System.out.println("2~9사이의 숫자만 입력해주세요.");
					
					System.out.print("숫자 : ");
					dan = sc.nextInt();
					
					if(2 <= dan && dan <= 9) {
						for(int i = dan; dan<=9; dan++) {
							System.out.println("====" + dan + "단====");
							
							for(int su = 1; su<=9; su++) {
								
								int result = dan*su;
								
								System.out.printf("%d x %d = %d\n",dan,su,result);			
							}
						}

					}
					break;
				}
			}
	}
		
	public void method11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int first = sc.nextInt();
		
		System.out.print("공차  : ");
		int diff = sc.nextInt();
		
		int sum = 0; // 시작 숫자에서 공차를 9번 더한 값
		
		for(int i = 0; i<10; i++ ) {

			sum = first + (diff*i);
			
			
			System.out.printf("%d ",sum);
		}
	}
	
	/*
	 * 내가 생각하는 및 선생님의 답안과 가장 근접한
	 * 굳이 i를 활용하지 않아도 된다는 것을 기억!!
	 * 
	 * public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int com = sc.nextInt();
		
		int result = start;
		
		//시작 숫자를 출력해준다.
		System.out.print(start + " ");
			
		for(int i = 1; i<10; i++) //출력 숫자는 10개다. start 수를 한 개 출력했으므로 9개 더 출력하면됨
		{							// i는 그저 횟수일 뿐
				result += com;
				System.out.print(result+" ");
		}
		
	}

	 * 
	 * 
	 * public static void nember6()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값을 입력하시오:");
		int num1 = sc.nextInt();
		System.out.print("공차를 입력하시오:");
		int num2 = sc.nextInt();
		
		for (int i = 1 ; i<=10; i++) {
			
			System.out.print((num1 += num2)-num2+" ");
			
				
			}
			
		
			
		}
	 * 
	 * 
	 * 
	 * 선생님 추가 예시
	 * 
	 * 
	 * 입력값 :  start
	 * 
	 * 
	 * int count = 0; // 반복되는 횟수를 세기 위한 변수
	 * 
	 * for(int i = start;; i+=num) { // i변수 값은 start 값에서 계속 증가 할 것이다. // 조건식 생략 가능 // 반복문을 빠져나갈 조건을 따로 만들어놓으면 된다.
	 * 
	 * 		System.out.print("i + " ");
	 * 		count++;	
	 * 
	 * 		if(count == 10) {
	 * 			break;
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	public void method12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {

		System.out.print("연산자(+, -, *, /, %) : ");
		String str = sc.nextLine();

		if (str.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		
		
		else {
			
		
			
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		//int max = Math.max(num1, num2);
		//int min = Math.min(num1, num2);
		
		sc.nextLine();
		
		if(str.charAt(0) == '+') {
			result = num1 + num2;
			System.out.printf("%d %c %d = %d\n", num1,str.charAt(0),num2,result);
			
		}else if(str.charAt(0) == '-') {
			result = num1 - num2;
			System.out.printf("%d %c %d = %d\n", num1,str.charAt(0),num2,result);
			
		}else if(str.charAt(0) == '*') {
			result = num1 * num2;
			System.out.printf("%d %c %d = %d\n", num1,str.charAt(0),num2,result);
			
		}else if(str.charAt(0) == '/' ) {
			if(num2 != 0) {
				result = num1 / num2;
				System.out.printf("%d %c %d = %d\n", num1,str.charAt(0),num2,result);
				
			}else {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요.");
			}
			
		}else {
			System.out.println("없는 연산자 입니다. 다시 입력해주세요");
			
		}

		}
		
	}	
		
	}
	

}	