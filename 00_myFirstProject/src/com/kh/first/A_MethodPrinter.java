package com.kh.first; // �ش� Ŭ������ � ��Ű���� �����ִ��� ������


public class A_MethodPrinter {

	// ��� ���� == �޼ҵ�
	// Ŭ�������� ������ ���� �޼ҵ� ���� �� �ʿ�� ����.
	// �Ϲ� �޼ҵ带 ���� ���̴�.
	
	public void methodA() {//�޼ҵ���� �ҹ��ڷ� �ۼ��ϴ� ���� �������								
		System.out.println("methodA ȣ�� �Ǿ����ϴ�.");	
		methodB();
		 // ���� Ŭ���� �� �޼ҵ� ȣ��� �ٷ� �׳� �޼ҵ�();
		}

	public void methodB() {
		
		System.out.println("methodB ȣ�� �Ǿ����ϴ�.");
		methodC();
	}
	
	public void methodC() {
		
		System.out.println("methodC ȣ�� �Ǿ����ϴ�.");
	
	}
	
	
}

