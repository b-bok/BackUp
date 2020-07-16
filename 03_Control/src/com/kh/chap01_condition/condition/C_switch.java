package com.kh.chap01_condition.condition;
import java.util.Scanner;
public class C_switch {
	/*
	 * switch���� if���� ������
	 * 
	 * if���� ���ǽĿ��� �������� ����(��Һ� ������) + ����� + && ||(��������)
	 * switch�� Ȯ���� ���� ����! only ����񱳸� ����
	 * switch���� if�� �ٸ��Ƿ� break�� �ɾ ���������� ���������Ѵ�.
	 * default = else�� ���, ���� ������ �������� ���� ��� �ݵ�� ������ �ڵ� , ���� ����
	 * 
	 * switch(������� �����) { // ���� ���� ������� ��� �ݵ�� int��, char��, String���� �����ϴ�.//double�� �Ұ���
	 * case ��1 : ������ �ڵ�1; break;
	 * case ��2 : ������ �ڵ�2; break;
	 * case ��3 : ������ �ڵ�3; break;
	 * ... 
	 * [default : ���� ������ �������� ���� �� �ݵ�� ������ �ڵ�] = �������� , break ���� �ʿ� ����
	 *}
	 * 
	 * ���� ����� == �� 1�� ������ true �� ��� �����ڵ� 1������ break ���� ��������
	 * ��, false �ϰ�� ��2�� �ٽ� ����� ����...
	 * 
	 * case ������ ��� ����� ��ġ���� ������� default�� ���õǾ��ִ� ������ �ݵ�� ����!! == else ���� ����
	 * 
	 * * ������ ��
	 * if - else if���� �ٸ��� �����ڵ带 �����ϰ� �ڵ����� ���������� ���ؼ� break�� �ɾ������.
	 * 
	 * 
	 */
	
	public void method1 () {
		//����ڿ��� 1~3������ ������ �Է¹޾�
		// 1�� ��� "�������Դϴ�." ���
		// 2�� ���  "�Ķ����Դϴ�." ���
		// 3�� ���  "�ʷϻ��Դϴ�." ���
		// �߸� �Է����� ��� "�߸��Է��Ͽ����ϴ�." ��� 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3������ ������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		/*if(num == 1) {
			System.out.println("�������Դϴ�.");
			
		}else if(num == 2) {
			System.out.println("�Ķ����Դϴ�.");
			
		}else if(num == 3) {
			System.out.println("�ʷϻ��Դϴ�.");
			
		}else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		*/
		
		switch(num) {
		case 1 : System.out.print("�������Դϴ�."); break;
			
		case 2 : System.out.print("�Ķ����Դϴ�."); break;
			
		case 3 : System.out.println("�ʷϻ��Դϴ�."); break;
			
		default : System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		
		
		
		
	}
	
	public void method2() {
		
		//����ڿ��� �����̸�(���, �ٳ���, ������, Ű��)
		//����� ��� = > 1000
		//�ٳ��� => 2000
		//������ => 5000
		// Ű��  => 4000
		// �߸��Է��ϸ� => �߸��Է��Ͽ����ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �̸��� �˷��ּ���(���, �ٳ���, ������, Ű��) : ");
		String fruit = sc.nextLine();
		int price = 0;
		
		switch(fruit) {
			case "���" : price = 1000; break;
			case "�ٳ���" : price = 2000; break;
			case "������" : price = 5000; break;
			case "Ű��" : price = 4000;; break;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�."); return;
		}
		
		System.out.printf("%s�� ������ %d���Դϴ�.",fruit,price);
		
	}
	
	
	public void method3() {
		
		//break�� ���� switch�� ���
		
		// ����ڿ��� ���(1, 2, 3)�� �Է� ���� ��
		// 3����� ��� ��������, �۾��� ����, �б� ����
		// 2����� ��� �۾��� ����, �б� ����
		// 1����� ��� �б� ����
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է����ּ���(1, 2, 3) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 3 : System.out.println("�� ���� ���� �־�");
		case 2 : System.out.println("�۾��� ���� �־�");
		case 1 : System.out.println("�б� ���� �־�"); break;
		default : System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		
		
		
	}
	
	public void method4 () {
		
		// �ش� ���� ������ ���� ����� ���̴�.
		// 1, 3,5,7,8,10,12 => �Է��Ͻ� ���� 31�� �����Դϴ�.
		// 4,6,9,11 => �Է��Ͻ� ���� 30�ϱ����Դϴ�.
		// 2�� => �Է��Ͻ� ���� 28�ϱ����Դϴ�.
		// �߸� �Է����� ���  => �ݵ�� 1~12������ �Է��ؾ��u�ϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1������ 12�� ������ �ش� �ϴ� ���� �Է����ּ��� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: 
		case 3:
		case 5:	
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�."); break;
		case 2: System.out.println("�Է��Ͻ� ���� 28�� �Ǵ� 29�ϱ��� �Դϴ�."); break;
		default : System.out.println("�߸��Է��Ͽ����ϴ�."); break;
		
		}
		
		
		
		
		
		
		
	}
	
	
	
}
