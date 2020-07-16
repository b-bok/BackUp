
import java.util.*;

//준호
/*
public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("잘못 입력했습니다. 종료합니다.");
			return;
		}
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("");
	
		while(num < 1) {
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			System.out.println("");
		}
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for (int i = num; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		while(num < 1) {
			System.out.println("");
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}
		
		for (int i = num; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			
			if(i!=num) {
			System.out.print(i+" + ");
			}
			else System.out.print(i);
			
			sum+=i;
		}
		
		System.out.print(" = "+sum);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자만 입력해주세요.");
			return;
		}
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		for(int i = min; i<=max; i++) {
			System.out.print(i + " ");
		}
		
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		while(num1 < 1 || num2 < 1) //두 수중 하나라도 1 미만이면 계속 다시 입력받는다.
		{
			System.out.println("1 이상의 숫자만 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
		}
		
		// 큰 값과 작은 값을 Math함수를 통해 판별하고, 해당 변수에 대입해준다.
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		for(int i = min; i<=max; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== "+ dan+"단" + " =====");
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		//2~9사이 숫자 입력 안했을 시 안내 후 종료.
		if(dan < 2 || dan > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요");
			return;
		}
		

		for(int i = dan; i<=9; i++) {
			System.out.println("===== "+ i+"단" + " =====");
			for(int j = 1; j<=9; j++)
				System.out.printf("%d * %d = %d\n",i,j,i*j);
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		//2~9사이 숫자 입력 안했을 시 다시입력받음
		while(dan < 2 || dan > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요");
			System.out.print("숫자 : ");
			dan = sc.nextInt();
		}
		

		for(int i = dan; i<=9; i++) {
			System.out.println("===== "+ i+"단" + " =====");
			for(int j = 1; j<=9; j++)
				System.out.printf("%d * %d = %d\n",i,j,i*j);
		}
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int com = sc.nextInt();
		
		int result = start;
		
		//시작 숫자를 출력해준다.
		System.out.print(start + " ");
			
		for(int i = 1; i<10; i++) //출력 숫자는 10개다. start 수를 한 개 출력했으므로 9개 더 출력하면됨
		{
				result += com;
				System.out.print(result+" ");
		}
	
		
		
		
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("연산자(+, -, *, /, %) : ");
		String operator = sc.nextLine();
		
		if(operator.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		int result = 0;
		
		
			switch(operator) {
		
			case "+": result = num1+num2; 
						System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
						break;
			case "-": result = num1-num2; 
						System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
						break;
			case "*": result = num1*num2; 
						System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
						break;
			case "/": 
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}else {
					result = num1/num2; 
					System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
					break;
				}
			case "%": result = num1%num2;
						System.out.printf("%d % %d = %d\n",num1,num2,num1%num2);
						break;
						
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				  continue;
		
			}
			
		
		}
		
		
		
	}
	

}
*/