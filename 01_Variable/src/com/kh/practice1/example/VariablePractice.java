package com.kh.practice1.example;
import java.util.Scanner;

/**
 * alt + shif + j�� ������ �ּ��� �����Ǿ� ���� �����ϴ�./ ���� ������ �̸� ����� ��;
 *
 */
public class VariablePractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű" + height +"�� " + age + "��" + gender + "��" + name + "�� �ݰ����ϴ�^^");
		
		
	}
	
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int plus = num1 + num2;
		int subtract = num1 - num2;
		int multifly = num1 * num2;
		int division = num1/num2;
		
		System.out.println("���ϱ� ��� : " + plus);
		System.out.println("���� ��� :" + subtract);
		System.out.println("���ϱ� ���  : " + multifly);
		System.out.println("������ �� ��� : " + division);
		
		
		
		
	}
	
	
	public void method3() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double h = sc.nextDouble();
		
		System.out.print("���� : ");
		double v = sc.nextDouble();
		
		double area = h*v;
		double round = ((h+v) * 2);
		
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + round);
		
	
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String word = sc.nextLine();
		
		/* 1�� ���
		char word0 = word.charAt(0); //���ڿ�.charAt(); ����
		char word1 = word.charAt(1);
		char word2 = word.charAt(2);
		*/
		// 2�� ���
		System.out.println("ù ��° ���� : " + word.charAt(0));
		System.out.println("�� ��° ���� : " + word.charAt(1));
		System.out.println("�� ��° ���� : " + word.charAt(2));
		
		
		
		
		
	
		
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
