package com.kh.run;

import com.kh.first.A_MethodPrinter; // ���� �߰�


public class RunA {
	
	public static void main(String [] args) {
		
		System.out.println("���α׷� ����!!");
		
		//�ٸ� Ŭ������ �ִ� �޼ҵ带 ����(ȣ��)�ϴ� ���?
		// 1) ������ �޼ҵ尡 �ִ� Ŭ������ ����
		// [ǥ����] = Ŭ������ ����� �̸� = new Ŭ������(); 
 		// 2) �޼ҵ� ����(ȣ��)
		// [ǥ����] = ����� �̸�.�����Ҹ޼ҵ��();
		
		
		
		// �ڵ� ��� ���� RunA Ŭ������ ���ؾݴ� ��Ű���� �ش� Ŭ������ ����
		// ���� ��Ű�� ���� �ش� Ŭ���� ã�� �� ����
		// �ذ� ��� 1. � ��Ű���� �����ִ��� Ǯ Ŭ������ ����
		//    ��Ű�� ��Ű�� ��Ű�� Ŭ����
		// 1) com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		
		// �ذ� ��� 2. �׳� Ŭ������ ������ ���� �ϵ� ��� ��Ű���� �����ִ��� �� �ѹ� �������ֱ�
		// import com.kh.first.A_MethodPrinter;
		A_MethodPrinter a = new A_MethodPrinter();

		a.methodA();
		//a.methodB();
		//a.methodC();
		

		
		
	}
	
	
}
