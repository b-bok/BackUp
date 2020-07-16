package homework.com.kh.practice.exemple;
import java.util.Scanner;
public class TeacherExemple {

	
	
	public void practice12() {
		// 사용자가 잘 입력했다는 가정하에, 진행되는 프로그래밍 해보고
		// 차후에 수정할 수 있는 부분을 고쳐본다.
		// 차후 숙련 후에는 바로 바로 가능 할 수 있다.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			//(내가 해야할 코딩 적어보기)
			
			//1. 연산자 입력받기
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			// >> 조건처리 : 사용자가 입력한 연산자가 exit일경우 종료구문 출력후 빠져나가기
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.\n");
				break;
			}
			
			
			//2. 두개의 정수값 입력받기
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); // 하나씩 실행 테스트 해결, 테스트 해결 순이 좋다.
			
			// >> 조건 처리 : 연산자가 /이면서(그리고) num2가 0일 경우 오류문구 출력 후 반복문 위로 올라가라!
			if(op.equals("/") || op.equals("%") && num2 ==0) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요. \n");
				continue;
			}
			
			
			//3. 연산결과 출력하기
			int result = 0;
			switch(op) {
			
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			case "%" : result = num1 % num2; break;
			// >> 조건처리 : 연산자를 잘못 입력했을 경우 오류문구 출력 후 반복문 위로 올라가는!
			//  by zero : 0으로 나눴을 경우에 오류 즉, 예외 발생	
			default : System.out.println("없는 연산자 입니다. 다시 입력해주세요.\n"); continue; // continue 만나는 순간  뒤에 있는 printf구문은 실행 안된다.
																					//가까운 반복문으로 올라간다.
			}
			
			
			//(코딩하기전 대략적인 개괄을 노트에 적어보는 것도 좋다)
			
			
			System.out.printf("%d %s %d = %d\n",num1, op, num2,result);
		}
		
		
		
	}
	
	
	
	
	
	
	
}
