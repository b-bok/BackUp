package homework.com.kh.practice.exemple;
import java.util.Scanner;

//������

import java.util.Scanner;
public class LoopPractice {

	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

			if(num>=1) {
				for(int i = 1; i<=num; i++) {
					
					System.out.print(i + " ");
					
			}
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.�ٽ� �Է����ּ���");
			
			while(true) {
				
				System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
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
		
		System.out.print("1�̻��� ���ڸ� �Է����ּ��� : ");
		int num1 = sc.nextInt();
		
		
		if(num1 >= 1) {
			for(int i = num1; 1<=i;i--) {
				
				System.out.print(i + " ");
			}
			
		}else { 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.�ٽ� �Է����ּ���");
			while(true) {	
				System.out.print("1�̻��� ���ڸ� �Է����ּ��� : ");
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
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		int sum = 0; // 1���� ����ڰ� ���� ���������� ��
		
		// 1���� ����ڿ��� �Է� ���� �������� ��
		// 1 ��� sum 1 ���� 2��� sum 2����
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
		
		System.out.print("ù ��° ����  : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2); // ���� ��
		int max = Math.max(num1, num2); // ū �� ���� �Ϸ�
		
		if(min > 0 && max > 0) { // ������ ū�� ��� 0���� Ŭ ��쿡��
			
			for(int i = min ; i<=max ; i++) { // ���������� ū������ ���� ���� �Ѵ�.
				
				System.out.print(i + " ");
				
			}
			

		}else {// ���ڰ� 0�� ���Եǰų�, 0���� ���� ��� �ٽ� �����. , 0���� ū ���� �� ������ �ݺ��ؼ� �����.
				
			while(true) {
				System.out.println("1�̻��� ���ڸ� �Է��� �ּ���");

				System.out.print("ù ��° ����  : ");
				num1 = sc.nextInt();
				
				System.out.print("�� ��° ���� : ");
				num2 = sc.nextInt();
				
				min = Math.min(num1, num2); // ���� ��
				max = Math.max(num1, num2); // ū �� ���� �Ϸ�
				
				if(min > 0 && max > 0) { // ������ ū�� ��� 0���� Ŭ ��쿡��
					
					for(int i = min ; i<=max ; i++) { // ���������� ū������ ���� ���� �Ѵ�.
						
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
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
			
		System.out.println("====" + dan + "��====");
			
			for(int su =1; su<=9; su++ ) {
				
				int result = dan*su;
				
				System.out.printf("%d x %d = %d\n",dan,su,result);
				
				
			}
			
	}
		
		public void method9 () {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� : ");
			int dan = sc.nextInt();

			if(2<=dan && dan<=9) {
				
				for(int i = dan; dan<=9; dan++) {
					
					System.out.println("====" + dan + "��====");
											
					for(int su = 1; su<=9; su++) {

						int result = dan*su;
						
						System.out.printf("%d x %d = %d\n",dan,su,result);
					
					
					}
				}
				
				
			}else {
				while(true) {
					System.out.println("2~9������ ���ڸ� �Է����ּ���.");
					
					System.out.print("���� : ");
					dan = sc.nextInt();
					
					if(2 <= dan && dan <= 9) {
						for(int i = dan; dan<=9; dan++) {
							System.out.println("====" + dan + "��====");
							
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
		
		System.out.print("���� ���� : ");
		int first = sc.nextInt();
		
		System.out.print("����  : ");
		int diff = sc.nextInt();
		
		int sum = 0; // ���� ���ڿ��� ������ 9�� ���� ��
		
		for(int i = 0; i<10; i++ ) {

			sum = first + (diff*i);
			
			
			System.out.printf("%d ",sum);
		}
	}
	
	/*
	 * ���� �����ϴ� �� �������� ��Ȱ� ���� ������
	 * ���� i�� Ȱ������ �ʾƵ� �ȴٴ� ���� ���!!
	 * 
	 * public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		
		System.out.print("���� : ");
		int com = sc.nextInt();
		
		int result = start;
		
		//���� ���ڸ� ������ش�.
		System.out.print(start + " ");
			
		for(int i = 1; i<10; i++) //��� ���ڴ� 10����. start ���� �� �� ��������Ƿ� 9�� �� ����ϸ��
		{							// i�� ���� Ƚ���� ��
				result += com;
				System.out.print(result+" ");
		}
		
	}

	 * 
	 * 
	 * public static void nember6()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���۰��� �Է��Ͻÿ�:");
		int num1 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�:");
		int num2 = sc.nextInt();
		
		for (int i = 1 ; i<=10; i++) {
			
			System.out.print((num1 += num2)-num2+" ");
			
				
			}
			
		
			
		}
	 * 
	 * 
	 * 
	 * ������ �߰� ����
	 * 
	 * 
	 * �Է°� :  start
	 * 
	 * 
	 * int count = 0; // �ݺ��Ǵ� Ƚ���� ���� ���� ����
	 * 
	 * for(int i = start;; i+=num) { // i���� ���� start ������ ��� ���� �� ���̴�. // ���ǽ� ���� ���� // �ݺ����� �������� ������ ���� ���������� �ȴ�.
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

		System.out.print("������(+, -, *, /, %) : ");
		String str = sc.nextLine();

		if (str.equals("exit")) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
		
		
		
		else {
			
		
			
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
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
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��� �ּ���.");
			}
			
		}else {
			System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���");
			
		}

		}
		
	}	
		
	}
	

}	