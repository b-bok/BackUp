package com.kh.variable;

import java.util.Scanner;

public class C_keybordInput {
// Ű���� �Է°� ������ ���
	
	public void inputScanner1() {
		// ����ڿ��� ������ ��������(�̸�, ����, Ű) �Է� 	(Scanner Ŭ������ �޼ҵ带 ����Ұ�)
		
		Scanner sc = new Scanner(System.in);
		// �Է� �ް��� �ϴ� ���� ���� ����ؼ� �Է� ����
		System.out.print("����� �̸��� �����Դϱ� : ");
		// ����ڰ� �Է��� ���ڿ� �̾ƿ��� �޼ҵ� : next(), nextLine()
		String name = sc.nextLine(); // �����δ� �����ϰ� nextLine����
		
		// next() : ����ڰ� �Է��� ���� ���� ���� ���� �ҷ���
		// next() : ����ڰ� �Է��� �� �� ��ü�� �ҷ���
		
		System.out.print("����� ���̴� ����Դϱ�  : ");
		// ����ڰ� �Է��� �������� �̾ƿ��� �޼ҵ� :  nextInt();
		
		int age = sc.nextInt();
		
		
		System.out.print("����� Ű�� ��cm�Դϱ� : ");
		// ����ڰ� �Է��� �Ǽ����� �̾ƿ�����? : nextDouble();
		
		double height = sc.nextDouble();
		
		// �� ����ִ��� ����غ���
		
		System.out.print(name + "���� " + age + "���̸�, Ű�� " + height + "�Դϴ�.");
		
		
	}
	
	
	public void inputScanner2 () {
		// �̸�, ���� ,�ּ�, Ű
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		/*
		 *  sc.nextLine() : ����ڰ� �Է��� ���ۿ��� "�����ϴ� ��"�� ��� �о�� 
		 * 	sc.nextLine()�̿ܿ��� "����" �о���� ���� 
		 */
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		// ���� ���ۿ� ���Ͱ� �������� ��������!
		
		sc.nextLine();
		
		//nexLine�� �������� ���� ���� ��������!
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű(cm����) : ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("���� : ");
		String gender = sc.nextLine();
		
		
		System.out.println(name + "���� " + gender + "�̸� "+ age + "���̸�, ��� ���� "
						+ address + "�̰�, Ű�� " + height + "cm�Դϴ�.");
		
		System.out.printf("%s���� %s�̸� %d���̸�, ��� ���� %s�̰�, Ű�� %.2fcm�Դϴ�.\n",name,gender,age,address,height);
		
	
			
		}
		
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� �Է´� sc.nextLine(); �������� sc.nextInt(); �Ǽ����� sc.nextDouble(); ���ڴ� sc.next.?
		// �̸�, ����(M/F), ����, Ű
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : "); // Male Female
		char gender = sc.nextLine().charAt(1);
		// 					Male.charAt(���°(0,1,2,3 �� �ϳ�)); 
		
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		// xxx���� ��������
		//
		
		
		System.out.println( name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
		
		
		
		
		
		
		
	}
	
	
	public void inputScanner4() {
		// ����ڿ��� �ΰ��� ������ �Է� ���� ��  ���� ���� ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù�� ° ���� : " );
		int num1 = sc.nextInt();
		
		System.out.print("�ι� ° ���� : " );
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		
		System.out.println("ù��°�� �ι�° ������ �� : " + result);
		
		// (+ - / *) /(��) %(������)

		
		
		
	}
	
	/*
	 * 
	 *  �ܼ�â���� �Է��� ����
	 *  Scanner sc = new Scanner(System.in)
	 *  int x = sc.next~~ �� ����� �Դ� Line���ڿ� Int ���� Double �Ǽ� ���
	 *  
	 *  ���� ����
	 *  nextLine ���� ��쿡�� ���� ���� ���� �����´�(�� �� next*�� �ƴ�), �׷��� nextLine �������� ���ۿ� ���� ���͸�  ������ sc.nextLine(); �ѹ� �Է�������
	 * 
	 * 
	 * ���� ���� �Է¹ޱ� ���ؼ� sc.nextLine() �޼ҵ带 ���� ���ڿ��� ���� �޾���
	 * System.out.println("����(M/F) : ");
	 * char gender = sc.nextLine().charAt(0);
	 * 
	 */
	
	
	
	
	
}
