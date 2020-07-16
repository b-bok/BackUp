package homework.com.kh.practice.exemple;
import java.util.Scanner;
public class ConditonPractice {

public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		String str = "";
		if(num == 1) {
			str = "입력";
		}else if(num == 2) {
			str = "수정";
		}else if(num == 3) {
			str = "조회";
		}else if (num == 4) {
			str = "삭제";
		}else {
			System.out.println("프로그램이 종료됩니다.");
			
			return;			
		}
		
		System.out.printf("%s 메뉴입니다.",str);
		

	}
	
	public void practice2 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개  입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
			
		}else if (num % 2 != 0) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3 ; 
		
		if( kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice7 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double h = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double g = sc.nextDouble();
		
		double bmi = g / (h*h);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		
		
		
	}
	

	
	/*if(month == 1 || month == 2 || month == 12) {
		season = "겨울";
		} else if(month >= 3 && month <= 5) {
		season = "봄";
		} else if(month >= 6 && month <= 8) {
		season = "여름";
		} else if(month >= 9 && month <= 11) {
		season = "가을";
		} else {
		season = "해당하는 계절이 없습니다.";
		}
	*/
	
	public void practice4 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		switch(month) {
		case 1 :
		case 2 :
		case 12 : season = "겨울"; break;
		case 3 : 
		case 4 :
		case 5 : season = "봄"; break;
		case 6 :
		case 7 : 
		case 8 : season = "여름"; break;
		case 9 : 
		case 10 :
		case 11 : season = "가을"; break;	
		default : season = "잘못 입력된 달"; break;
		}
		
		System.out.printf("%d월은 %s입니다.",month,season);

	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		int pw = sc.nextInt();
	
		if(id.equals("boram")) {
			if(pw == 1234) {
				 System.out.println("로그인 성공");
			}
		}else if(pw != 1234) {
				System.out.println("비밀번호가 틀렸습니다.");
				
		}else { System.out.println("아이디가 틀렸습니다.");
		
		}
		

	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String id = sc.nextLine();
		
		
		switch(id) {
		case "관리자" : System.out.println("회원관리, 게시글 관리");
		case "회원"  : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break;
		default : System.out.println("잘못입력하였습니다."); 
		}
		
		
		
	}
	
	public void practice8 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력  : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		int result = 0;
		
		/* if(num1 > 0 && num2 > 0) {
			if(ch == '+') {
				result = num1 + num2;
			}else if (ch == '-') {
				result = num1 - num2;
			}else if (ch == '*') {
				result = num1 * num2;
			}else if (ch == '/') {
				result = num1 / num2;
			}else if (ch == '%') {
				result = num1 % num2;
			}else {
				System.out.println("연산자를 잘못입력 하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		
		}else {
			System.out.println("양수를 입력해주세요. 프로그램을 종료합니다.");
			return;
			} */
		
		if(num1>0 && num2>0) {
			switch(ch) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("연산자를 잘못입력했습니다. 프로그램을 종료합니다.");
			return;
			}
		
		}else {
			System.out.println("양수를 입력해주세요. 프로그램을 종료합니다."); return;
		}
		

		System.out.printf("%d %S %d = %d", num1, ch, num2, result);
		

		
	}
	
	public void practice9 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();
			
		System.out.print("출석 회수 : ");
		int score4 = sc.nextInt();
		
		double result1 = score1*0.2;
		double result2 = score2*0.3;
		double result3 = score3*0.3;
		double result4 = score4;
		double cut = 20*0.7;
	
		
		
		double sum = (result1 + result2 + result3 + result4);
		
		System.out.println("===========결과==========");
		
		if(sum > 70 && score4 >= cut) {
			System.out.println("중간 고사 점수(20) : " + result1);
			System.out.println("기말 고사 점수(30) : " + result2);
			System.out.println("과제 점수	 (30) : " + result3);
			System.out.println("출석 점수	 (20) : " + result4);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}else {
			if(score4 < cut) {
				System.out.println("FAIL [출석 횟수 부족] (" + score4 + '/' + "20)");
		}
				
			if(sum < 70) {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
		}
		// if는 무조건 실행 되므로 첫번째 if 실행후, else는 70점 미만일수도, 출석 미달일수도, 둘다일수도
		// 그래서 if를 각각 별개로 해야, 둘다 일때 둘다 실행할 수 있음
		//if else if를 묶는 이유는 비교대상이 동일할 때 묶는 것이다.
			
			
	}
		
	}
	
	public void practice10 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택 : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
