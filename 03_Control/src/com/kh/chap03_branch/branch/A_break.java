package com.kh.chap03_branch.branch;
import java.util.Scanner;
public class A_break {

	/*
	 *  * break�� : break���� ����Ǿ� �ִ� "���� ����� �ݺ���"�� ���������� ����
	 * 
	 */
	
	
	public void method1 () {
		
		// ����ڰ� ���ڿ� �Է¹��� �� �� �Է¹��� ���ڿ� ���(�� ������ ��� �ݺ�)
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ��� �ݺ��� �����ϰԲ�
		
		Scanner sc = new Scanner(System.in);
		
		
		/*for(;;) {
			System.out.print("���ڿ��� �Է����ּ��� : ");
			String str = sc.nextLine();
			
			System.out.println(str);
			
			if(str == "exit") {
				
				break;
				
			}
		}*/
		
		while(true) {
			
			System.out.print("���ڿ��� �Է����ּ��� : ");
			String str = sc.nextLine();
			
			System.out.println(str);
			
			if(str.equals("exit")) { //*** ���ڿ� ���� �񱳴� ����.equals(���� ���ڿ�) ***
				
				break;//�ݺ����� ������ ���������� �ϴ� ����
			}
			
		}
				
				
		
			System.out.println("���α׷��� �����մϴ�.");
		
		
		
	}
			
	public void method2() {
		
		//�Ź� �������� �߻�(1~10)�߻� ��Ų�� ���
		//��, �� �������� Ȧ�� �� ��� �ݺ����� ��������
		
		
		
		while(true) {
			int random = (int) (Math.random()*10 +1);
			
				
			
			
			System.out.println(random);
			
			if(random % 2 == 1) {
				
				break;
				
				}
			
			
		}
			
			
		System.out.println("����� �����մϴ�.");
		
		
	}
			
	public void method3() {
		
		//����ڿ��� ���� �ΰ� �Է� �ް�, �����ڸ� �Է¹ް�
		// �����ڸ� �߸� �Է����� ��쿡�� �������� ����
		//��, �����ȣ �߸� �Է��ϸ� �ݺ��� ������������
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			int result = 0;
			
			System.out.print("���� 1 �Է� : ");
			int num1 = sc.nextInt();
			
			System.out.print("���� 2 �Է� : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("�����ȣ(+,-) �Է� : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == '+') {
				result = num1 + num2;
			
			}else if(ch == '-') {
				result = num1 - num2;
			}else {
				
				System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
				break;
			}
			
			 System.out.println("result �� : " + result); 
			
			
			
			
		}
		
		
		
		
		
	}
	
	
}
