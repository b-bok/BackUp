package com.kh.chap02_loop.loop;
import java.util.Scanner;
public class A_For {

	
	/*
	 *  * for문
	 *  
	 * for(초기식; 조건식; 증감식) { //반복 횟수를 지정하기 위해 제시하는 것들
	 * 		.. 반복적으로 실행시키고자하는 실행구문..
	 *  
	 * }
	 * 
	 * for문을 만나는 순간
	 * 초기식 -> 조건식 검사 -> true 이면 실행구문 -> 증감식
	 * 		     조건식 검사 -> true 이면 실행구문 -> 증감식
	 * 		     다시 조건식 -> true 이면 실행구문 -> 증감식
	 *        -----------이 내용이 계속 반복 =-------
	 *         다시 조건식 -> false일 경우  실행구문 실행 x 
	 *         반복문 빠져나감
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  - 초기식 : 반복문이 수행될 때 "단 한번만 실행되는 구문"
	 *  		(주로 변수 선언과 동시에 초기화 구문)
	 *  
	 *  - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 *  		조건식이 true일 경우 해당 실행 구문을 실행
	 *  		조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 *  		(주로 초기식에서 사용된 변수를 가지고 조건식을 작성)
	 *  
	 *  - 증감식 : 반복문을 제어하는 변수값을 증감시키는 부분
	 *  		(초기식이 제시한 변수를 가지고 증감연산자(++, --)를 사용)
	 */
	
	
	public void method1() {
		// 안녕하세요 를 5번 반복해서 출력
		
		for(int i = 1; i <= 5; i++) {// i값이 1에서 부터 5일때까지 1씩 증가하는 동안 반복 수행한다.(1,2,3,4,5) 5회 반복
			System.out.println("안녕하세요");
			
			// i = 1 i <=5 true 출력 i++
			// i = 2 i <=5 true 출력 i++
			// i = 3 i <=5 true 출력 i++
			// i = 4 i <=5 true 출력 i++
			// i = 5 i <=5 true 출력 i++
			// i = 6 i <=5 false 종료
		}
		
		for(int i = 0; i <= 4; i++) {// i값이 0에서부터 4까지 1씩 증가하는 동안 반복수행한다.(0,1,2,3,4) 5회 반복
			System.out.println("하하하");
		}
		
		for(int i = 1; i < 6; i++) {// i값이 1에서부터 5까지 1씩 증가하는 동안 반복수행 (1,2,3,4,5) 5회 반복
			System.out.println("헤헤헤");		
		}
		
		
		//초기값부터  해당조건이 true일때가지 1씩 증가하는 동안 반복수행
		
		for(int i = 5; i >= 1; i--) { //i값이 5에서 부터 1까지 1씩 감소하는 동안 반복수행(5,4,3,2,1) 5회반복
			System.out.println("호호호");
		}
		
		
		
		
		for(int i =1; i<=10; i++) { // 1에서 10까지 10번 반복 수행
			System.out.println("그럼그럼");
		}
		
		
		for(int i = 11; i <=20; i++) {
			System.out.println("아니!!!");
			
		}
		
		// 노트나 실행되는 순서대로 계산해보는 것도 좋은 방법이다.
		
		
		
		
		
	}
	
	public void method2() {
		//1부터 5까지 출력
		//1
		//2
		//3
		//4
		//5
		
		for(int i =1 ; i <=5 ; i++) { // 반복문에 제시된 변수값을 이용가능하다!
			System.out.println(i);
		}
		// 1 2 3 4 5
		for(int i = 1; i <=5 ; i++) {
			System.out.print(i);
		}
		
		for(int i = 1; i < 6; i++) { //1,2,3,4,5회 수행
			System.out.print(i + " "); // " "는 띄어쓰기 제공
		}
		
	}
	public void method3() {
		
		for(int i = 5; i>=1; i--) { // 5, 4, 3,2,1 5회 반복수행
			System.out.print(i + " ");
		}
		
		
		
	}
	
	public void method4() {
		// 123...10
		
		for(int i = 0; i <=9; i++) {
			
			System.out.print((i + 1) +" ");
		}
	}
	
	public void method5() {

		
	for(int i =1; i<=10; i+=2 ) {       // i +=2 반복문 자체를 2씩 증가 1 3 5 7 9 5번 수행함
		System.out.print(i + " ");
	
		}
		
		
		
	}
	
	public void method6() {
		
		//1에서 10까지의 정수값들을 합계
		int sum = 0;
		
		for(int i = 1; i<=20; i++) {
			
			sum += i;
			
			System.out.printf("%d + %d = %d\n",i,i,sum );
			
		}
		
		
		
		
		
	}
	
	public void method7() {
		// 1에서 부터 사용자가 입력한 수까지의 총 합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수  : ");
		int num = sc.nextInt();
		
		int sum = 0;
		//사용자가 입력한 정수값이 양수인지 아닌지(유효성 검사)
		
		if(num>0) {
			for(int i = 1; i <= num; i++) { // 1에서부터 num까지 1씩 증가하는 동안 반복(num회 반복)
				
				sum += i;

			}
			
			System.out.println("1에서부터" +num + "까지의 총 합계 : " + sum);
			
		}else {
			System.out.println("양수를 입력해주세요.");
		}
		
		

	}
	
	public void method8() {
		
		// 1에서부터 어떤 랜덤 값(1~10사이의 랜덤값)의 합계 구하기
		
		// Math클래스에서 제공하는 random() 메소드 호출시 랜덤값 발생
		// java.lang.Math 에 있는 메소드 호출시 생성 할 필요 없음 -> 클래스명.메소드();
		// 0.0~0.99999999999 사이의 랜덤값을 발생!
		//0.0 <= 랜덤실수값 < 1.0
															
		//int random = Math.random(); //double 값을 int형에 담을라 그래서 발생한 문제
		// 					0.0 ~1.0 사이의 랜덤값 
		
		//int random = Math.random() * 10;
		//					0 ~10.0 사이의 랜덤값
		
		//int random = Math.random() * 10 + 1;
		//					1 ~ 11.0 사이의 랜덤값
				
		int random = (int)(Math.random() * 10 +1);
		//				1 <= <11		1~ 10 곱하는 것은 갯수, 1은 시작수
		// +2 이면 2에서부터 10개 즉 2~11
		System.out.println(random);
				
		int sum = 0;
		for(int i = 1; i <= random; i++) { //1에서부터 random회수까지 반복			
			sum += i;
		}
		
		System.out.println("1에서부터" +random + "값까지 더한값 : " + sum);
		
	}
	
	public void method9() {
		
		// 사용자에게 문자열 입력받은 후 
		// 각 인덱스별 문자를 추출 후 출력
		
		// 예를 들어 apple 입력하면 => str에 입력
		// a				=> 출력문(str.charAt(0);
		// p				=> 출력문(str.charAt(1);
		// p				=> 출력문(str.charAt(2);
		// l				=> 출력문(str.charAt(3);
		// e				=> 출력문(str.charAt(4);
		
		// 길이 5			4			10
		//	apple		kiwi	strawberry
		//	01234		0123	0123456789
		// 마지막 인데스는  == (항상 문자열 길이 -1)!
		// 추출하고자 하는 인덱스 값이 0~마지막인덱스(문자열의 길이 -1)까지 1씩 증가함!
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해 주세요 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i = 0; i < str.length(); i++) { // 0에서부터 str.length() -1씩 증가하는 동안 반복(횟수는 문자열의 길의 만큼)
												// <= str.length() -1 ==  < str.length()
			
			System.out.println(str.charAt(i));
			
		}
		

		
	}
	
	public void method10() {
		// 구구단 출력하기
		// 2단 출력하기
		
		// 2 *1 2*2 ... 2*9
		
		for(int i = 1;i<10;i++){
			
			int multi = 2;
			
			multi *= i;
			
			System.out.println("2 x " + i + "=" + multi);
			
		}
		

	}
	public void method11() {
		// 사용자가 입력한 단을 출력하기
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단(2~9)를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		*/
		
		// 2에서부터 9사이의 랜덤한 단 출력
		
		int dan = (int) (Math.random()*8 +2);
		
		
		if(2 <= dan && dan <= 9 ) {
			for(int i = 1; i<10; i++) {
				
				//int result = 0;
				
				//result = (dan*i);
				
				//System.out.println(dan + "X" + i + "=" + result);
				
				System.out.println(dan + " x " + i + " = " + dan * i);
				
			}
		}else {
			System.out.println("단 수를 다시 입력해주세요");
		}
		
		
		
		
	}
	
	public void method12() {
		
		// 사용자에게 두개의 정수값을 입력받아서
		// 두개의 정수값 중 작은 값 부터 큰 값까지의 정수 출력
		// 총 합계 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		// 새로 배운 Math.min Math.max
		int min = Math.min(num1, num2); // 두 수 중 작은 값을 저장할 변수
		int max = Math.max(num1, num2); // 두 수 중 큰 값을 저정할 변수
		
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			
			sum += i;
			
			
		}
	
		System.out.println(min + "에서 " + max + "까지의 합 : " + sum);
		
	}
	
	
	/*
	 * 중첩 for문
	 * 
	 * for(초기식;조건식;증감식) {
	 * 
	 * 	수행할 문장1;
	 * 
	 * 	for(초기식2; 조건식2; 증감식2) {
	 * 
	 * 
	 * }
	 * 	수행할 문장3;
	 * 		
	 * }
	 * 
	 */
	
	
	
	
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// 첫번째 행으로 고정일 때 1 2 3 4 5
		// 두번째 행으로 고정일 때 1 2 3 4 5
		// 세번째 행으로 고정일 때 1 2 3 4 5
		// 바깥쪽 for문으로 행을 지정
		// 
		
		for(int i =1; i<=3; i++) { // 행으로 생각하면 쉽고
			
			for(int j =1; j<=5; j++) {  // 열으로 생각하면 쉽다.
			
			System.out.print(j + " ");
			
		}
		
			System.out.println();
		}	
		
		
		/* i = 1
		 * 초기식으로 i =1 1은 3보다 작아서 중괄호 안으로 들어감
		 * 그리고 또 for문을 만남 j = 1 1은 5보다 작아서 1 출력 j++
		 * 그리고 또 j=2 2출력 j++
		 * ... j= 5 5출력 j++
		 * j = 6 false가 됨 안쪽 for문을 빠져나와서 
		 * 개행 문 실행
		 * 
		 * i =2 true 다시 안쪽 for문 실행
		 * 초기식으로 i =1 1은 3보다 작아서 중괄호 안으로 들어감
		 * 그리고 또 for문을 만남 j = 1 1은 5보다 작아서 1 출력 j++
		 * 그리고 또 j=2 2출력 j++
		 * ... j= 5 5출력 j++
		 * j = 6 false가 됨 안쪽 for문을 빠져나와서 
		 * 개행 문 실행
		 * 
		 * i =3 true 다시 안쪽 for문 실행
		 * 초기식으로 i =1 1은 3보다 작아서 중괄호 안으로 들어감
		 * 그리고 또 for문을 만남 j = 1 1은 5보다 작아서 1 출력 j++
		 * 그리고 또 j=2 2출력 j++
		 * ... j= 5 5출력 j++
		 * j = 6 false가 됨 안쪽 for문을 빠져나와서 
		 * 개행 문 실행
		 * 
		 * i =4 가되면 끝! 
		 * 
		 */
		
		
		
	}
	
	public void method14() {
		// 0시 0분 ~ 23시 59분
		
		
		// 0시0분 출력
		// 0시 1분 출력
		// ....
		// 0시 59분 출력
		
		// 1시 0분 출력
		// 1시 59분 출력
		
		
		for(int hour =0; hour<=23; hour++) {
		
			
			System.out.println("=" + hour + "시=");
			
			for(int min = 0; min<=59; min++) {
				
				System.out.println(hour + "시" + min + "분");
				
			}
			System.out.println();
				
			
		}
		
		
		
		
		
	}
	
	public void method15() {
		//2단부터 9단까지 모두 출력
		
		// == 2단 == 
		// 2 x 1 = 2
		//.... 2x9 = 18
		
		
		// 단(행) 2~9까지 1씩 증가 -> 바깥
		// 수(열) 매단 마다 1~9까지 1씩 증가 -> 안쪽
		
		
		for(int i=1; i<=9 ; i++) {
			
			if(i%3 ==0) {
				System.out.println("=== " + i + "단 ===");
				
				for(int j=1; j<=9; j++) {
					
					int result = 0;
					
					result = i*j;
					
					//System.out.println(i + " x " + j + "=" + result);
					System.out.printf("%d x %d = %d\n", i, j, result);
				}
				 
					System.out.println();
			}
			
			
			
		}
		

	}
	
	public void method16() {
		
		//*****
		//*****
		//*****
		
		// 행은 1~3까지 반복(3회) => 바깥쪽 for문
		// 열은 매 행마다 1~5까지 반복(5회) => 안쪽 for문
		
		
		for(int i=1;i<=3;i++) {
			
			for(int j = 1; j<=5; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
	
	}
	
	public void method17() {
		//1*** i =1  j=1
		//*2** i =2 j = 2
		//**3* i =3 j = 3
		//***4 i =4 j = 4
		
		
		
		
		
		for(int i = 1; i<=4; i++) {
			
			for(int j = 1; j<=4; j++) {
				
				if(i == j) { // i == j가 일치할 경우 숫자로 출력
					
					System.out.print(i);
				}else { //  i != j 일경우는 별을 출력
					
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
