package com.kh.operator;
import java.util.Scanner;
public class F_Triple {
	
	
	/* 
	 * *���׿�����  : �׸��� 3���� ������
	 *	
	 *
	 * [ǥ����]  ���ǽ�  ? ���ǽ��� true�� ��� ����� 1 : ���ǽ��� false�� ��� ����� 2
	 * 
	 * ���ǽ��� �ݵ�� true �Ǵ� false�� �����Բ� �ۼ��ؾ���
	 * �ַ� ���ǽĿ� ��/�� ������ ����
	 * 
	 */
	public void method1() {
		// ����ڰ� �Է��� ���� ������� �ƴ��� �Ǻ� �� ���
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		//���ǽ� ? ���϶� �� : �����϶� ��
		
		//System.out.println(num > 0 ? "���" : "����� �ƴ�");
		String result = (num > 0 ? "���" : "����� �ƴ�");
		System.out.println("����ڰ� �Է���" + num +"��(��)" + result);
		
		
	}
	
	
	public void method2() {
		
		/*
		 * ����ڰ� �ΰ��� �������� �Է¹޾Ƽ�
		 * ������ ���� ���� ����� 100���� ū ��� "����� 100�̻��Դϴ�."
		 * 						�ƴѰ�� "����� 100���� �۽��ϴ�."
		 * 
		 * 
		 *
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ù��° ������ : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ������ : ");
		int num2 = sc.nextInt();
		
	
		
		String result =  ((num1 * num2)>= 100 ? "����� 100�̻��Դϴ�." : "����� 100���� �۽��ϴ�.");
		System.out.println((num1 * num2) + "��(��)" + result);
		
	}
	
	
	public void method3() {
		// ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		//String result = (num % 2  == 0 ? "¦���̴�" : "Ȧ���̴�");
		String result = (num % 2 != 1 ? "¦���̴�." : "Ȧ���̴�.");
		
		
		System.out.println(num + "��(��)" + result);
		
	
	}
	
	public void method4 () {
		//����ڿ��� �Է� ���� �����ڰ� �빮������ �ҹ�����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ڸ� �Է����ּ��� : ");
		char ch = sc.nextLine().charAt(0);
		// ch >= 'A' && ch <= 'Z'
		String result = ('A' <= ch && ch <= 'Z' ? "�빮���Դϴ�." : "�빮�ڰ� �ƴϴ�.	");
		
		System.out.println(ch + "��(��)" + result);
		
	}
	
	
	public void method5 () {
		// ����ڰ� �Է��� �������� ������� �������� 0���� ��Ȯ�� �Ǻ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		//String result = (num > 0 ? "���" : (num == 0 ? "0" : "����"));
		String result = (num > 0 ? "����̴�." : (num < 0 ? "����" : "0"));
		
		
		System.out.println(num + "��(��)" + result + "�Դϴ�.");
		
		
		
		
		
	}
	
	
	public void method6 () {
		
		// �ΰ��� �������� �Է¹ް�
		// + �Ǵ� - �� �Է� �޾� �׿� �ش��ϴ� ���� ��� ���
		
		
		// + �Է����� ��� ���� ���� ����� ���
		// - �Է����� ��� ���� ���� ����� ���
		// �� ���� ���ڸ� �Է����� ��� "�߸� �Է��ϼ̽��ϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ������ : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // �����ִ� ���� ������
		
		System.out.print("+/-��ȣ�� �Է����ּ��� ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == '+' ? (num1 + num2) + "" : (ch == '-' ? (num1 - num2) + "" : "�߸��Է��ϼ̽��ϴ�."));
		// int ��갪 ���ϱ� ""���� ���ڿ��θ������
		System.out.println("����� " + result );
		

		
	}
	
	

}
