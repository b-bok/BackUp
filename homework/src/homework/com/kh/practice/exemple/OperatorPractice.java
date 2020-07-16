package homework.com.kh.practice.exemple;
import java.util.Scanner;

public class OperatorPractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println( num1 > 0 ? "양수다." : "양수가 아니다.");
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println( num2>0 ? "양수다." : (num2 == 0) ? "0이다." : "음수다.");
		
		
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num3 = sc.nextInt();
		
		System.out.println( num3 % 2 == 0 ? "짝수다." : "홀수다." );
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int result1 = (num2 / num1) ;
		int result2 = (num2 % num1) ;
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);

	}
	
	public void method5 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만)");
		int class1 = sc.nextInt();
		
		System.out.print("반(숫자만)");
		int ban = sc.nextInt();
		
		System.out.print("번호(숫자만)");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F)");
		char gender = sc.nextLine().charAt(0);
		String gender1 =  (gender == 'M' ? "남학생" : "여학생");
		
		System.out.print("성적(소수점 아래 둘째짜리까지)");
		double grade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",
							class1,ban,number,name,gender1,grade);
		//System.out.println(Math.round(grade*100)/100f); Math.round()를 사용하면 반올림 가능
		
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println(age > 19 ? "성인" : (age > 13) ? "청소년" : "어린이");
		
		
	}
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		int avg = (sum/3);
		
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + avg );
		
		System.out.println((kor >= 40 && eng >= 40 &&math >= 40) && avg >= 60 ? 
							" 합격 " : "불합격");

	}
	
	public void method8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) :" );
		char ch = sc.nextLine().charAt(7);
		System.out.println(ch);
		System.out.println(ch == '1'|| ch == '3' ? "남자" : 
							ch == '2' || ch == '4' ?  "여자" : "잘못된 값입니다.");
	
	}
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		System.out.println((num1 < num2) && (input <= num1 || input > num2) ?
							"true" : "false");

	}
	
	public void method10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		// 1번 방법
		//boolean result1 = ((num1 == num2) ? true : false);
		//boolean result2 = ((num2 == num3) ? true : false);
	
 		//System.out.println((result1 = result2) ? "true" : "false");
		
		
		
		// 2번 방법
		//boolean isTrue = (num1 == num2) && (num2 == num3);
		//System.out.println(isTrue);
		
		// 3번 방법
		System.out.println((num1 == num2 && num2 == num3) ? "true" : "false");
	}
	
	
	
	
	
	// 리뷰 결과 출력문은 최대한 간소화 시켰으며, 조건문을 따로 만들어 놓았다!
	
}
