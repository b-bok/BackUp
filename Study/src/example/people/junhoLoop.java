
import java.util.*;

//��ȣ
/*
public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("�߸� �Է��߽��ϴ�. �����մϴ�.");
			return;
		}
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println("");
	
		while(num < 1) {
			System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			System.out.println("");
		}
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for (int i = num; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		while(num < 1) {
			System.out.println("");
			System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
		}
		
		for (int i = num; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		while(num1 < 1 || num2 < 1) //�� ���� �ϳ��� 1 �̸��̸� ��� �ٽ� �Է¹޴´�.
		{
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			System.out.print("ù ��° ���� : ");
			num1 = sc.nextInt();
			
			System.out.print("�� ��° ���� : ");
			num2 = sc.nextInt();
		}
		
		// ū ���� ���� ���� Math�Լ��� ���� �Ǻ��ϰ�, �ش� ������ �������ش�.
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		for(int i = min; i<=max; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		System.out.println("===== "+ dan+"��" + " =====");
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		//2~9���� ���� �Է� ������ �� �ȳ� �� ����.
		if(dan < 2 || dan > 9) {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���");
			return;
		}
		

		for(int i = dan; i<=9; i++) {
			System.out.println("===== "+ i+"��" + " =====");
			for(int j = 1; j<=9; j++)
				System.out.printf("%d * %d = %d\n",i,j,i*j);
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		//2~9���� ���� �Է� ������ �� �ٽ��Է¹���
		while(dan < 2 || dan > 9) {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���");
			System.out.print("���� : ");
			dan = sc.nextInt();
		}
		

		for(int i = dan; i<=9; i++) {
			System.out.println("===== "+ i+"��" + " =====");
			for(int j = 1; j<=9; j++)
				System.out.printf("%d * %d = %d\n",i,j,i*j);
		}
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		
		System.out.print("���� : ");
		int com = sc.nextInt();
		
		int result = start;
		
		//���� ���ڸ� ������ش�.
		System.out.print(start + " ");
			
		for(int i = 1; i<10; i++) //��� ���ڴ� 10����. start ���� �� �� ��������Ƿ� 9�� �� ����ϸ��
		{
				result += com;
				System.out.print(result+" ");
		}
	
		
		
		
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("������(+, -, *, /, %) : ");
		String operator = sc.nextLine();
		
		if(operator.equals("exit")) {
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
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
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}else {
					result = num1/num2; 
					System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
					break;
				}
			case "%": result = num1%num2;
						System.out.printf("%d % %d = %d\n",num1,num2,num1%num2);
						break;
						
			default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				  continue;
		
			}
			
		
		}
		
		
		
	}
	

}
*/