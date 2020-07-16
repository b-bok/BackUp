package com.kh.variable;

import java.util.Scanner;

public class C_keybordInput {
// 키보드 입력값 변수에 기록
	
	public void inputScanner1() {
		// 사용자에게 간단한 인적사항(이름, 나이, 키) 입력 	(Scanner 클래스의 메소드를 사용할걸)
		
		Scanner sc = new Scanner(System.in);
		// 입력 받고자 하는 내용 먼저 출력해서 입력 유도
		System.out.print("당신의 이름은 무엇입니까 : ");
		// 사용자가 입력한 문자열 뽑아오는 메소드 : next(), nextLine()
		String name = sc.nextLine(); // 앞으로는 안전하게 nextLine쓸것
		
		// next() : 사용자가 입력한 값중 공백 이전 값만 불러옴
		// next() : 사용자가 입력한 한 줄 전체를 불러옴
		
		System.out.print("당신의 나이는 몇살입니까  : ");
		// 사용자가 입력한 정수값은 뽑아오는 메소드 :  nextInt();
		
		int age = sc.nextInt();
		
		
		System.out.print("당신의 키는 몇cm입니까 : ");
		// 사용자가 입력한 실수값을 뽑아오려면? : nextDouble();
		
		double height = sc.nextDouble();
		
		// 잘 담겨있는지 출력해보자
		
		System.out.print(name + "님은 " + age + "세이며, 키는 " + height + "입니다.");
		
		
	}
	
	
	public void inputScanner2 () {
		// 이름, 나이 ,주소, 키
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		/*
		 *  sc.nextLine() : 사용자가 입력한 버퍼에서 "엔터하는 값"도 모두 읽어옴 
		 * 	sc.nextLine()이외에는 "엔터" 읽어오지 않음 
		 */
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 현재 버퍼에 엔터가 남아있음 지워주자!
		
		sc.nextLine();
		
		//nexLine이 오기전에 엔터 값을 지워주자!
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키(cm단위) : ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		
		
		System.out.println(name + "님은 " + gender + "이며 "+ age + "살이며, 사는 곳은 "
						+ address + "이고, 키는 " + height + "cm입니다.");
		
		System.out.printf("%s님은 %s이며 %d살이며, 사는 곳은 %s이고, 키는 %.2fcm입니다.\n",name,gender,age,address,height);
		
	
			
		}
		
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력는 sc.nextLine(); 정수형은 sc.nextInt(); 실수형은 sc.nextDouble(); 문자는 sc.next.?
		// 이름, 성별(M/F), 나이, 키
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : "); // Male Female
		char gender = sc.nextLine().charAt(1);
		// 					Male.charAt(몇번째(0,1,2,3 중 하나)); 
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님의 개인정보
		//
		
		
		System.out.println( name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		
		
		
		
		
		
	}
	
	
	public void inputScanner4() {
		// 사용자에게 두개의 정수값 입력 받은 후  덧셈 연산 결과값 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번 째 정수 : " );
		int num1 = sc.nextInt();
		
		System.out.print("두번 째 정수 : " );
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		
		System.out.println("첫번째와 두번째 정수의 합 : " + result);
		
		// (+ - / *) /(몫) %(나머지)

		
		
		
	}
	
	/*
	 * 
	 *  콘솔창으로 입력할 려면
	 *  Scanner sc = new Scanner(System.in)
	 *  int x = sc.next~~ 를 사용해 왔다 Line문자열 Int 정수 Double 실수 등등
	 *  
	 *  주의 할점
	 *  nextLine 같은 경우에는 엔터 까지 같이 가져온다(그 외 next*는 아님), 그래서 nextLine 오기전에 버퍼에 남은 엔터를  없에줄 sc.nextLine(); 한번 입력해주자
	 * 
	 * 
	 * 문자 값을 입력받기 위해서 sc.nextLine() 메소드를 통해 문자열로 먼저 받아줌
	 * System.out.println("성별(M/F) : ");
	 * char gender = sc.nextLine().charAt(0);
	 * 
	 */
	
	
	
	
	
}
