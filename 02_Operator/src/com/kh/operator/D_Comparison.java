package com.kh.operator;

public class D_Comparison {

	/*
	 *  * �� ������(���� ������, ���� ������)
	 *  - �� ���� ���ϴ� ������
	 *  - �� �� ���� ���̸� true, �����̸� false
	 *  ��, �񱳿����� ������ ������� ����
	 *  
	 *  a < b : a�� b���� �۳�?
	 *  a > b : a�� b���� ũ��?
	 *  a <= b : a�� b���� �۰ų� ����?
	 *  a >= b : a�� b���� ũ�ų� ����? (��ȣ ������� �б�)
	 *   
	 *  a == b : a�� b�� ����?
	 *  a != b : a�� b�� �ٸ���? == !(a==b)
	 *  
	 *  
	 */
			
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		
		System.out.println("a != b : " + (a != b));
		System.out.println("a == b : " + (a == b));
		
		
		boolean result = (a >= b);
		System.out.println("result : " + result);
		
		
		// ������� + �񱳿���
		// a�� ¦�� �Դϱ�?
		
		System.out.println("a�� ¦�� �Դϱ�? : " + (a % 2 == 0));
		System.out.println("b�� ¦�� �ΰ�? : " + (b % 2  == 0));
		
		System.out.println("a�� Ȧ���ΰ�? : " + (a % 2 == 1));
		System.out.println("b�� Ȧ���ΰ�? : " + (b % 2 == 1));
		
		System.out.println(a + b > 30);
		
		
		
		// �� % 2 == 0  -> ¦��
		// �� % 2 == 1  -> Ȧ��

		
		
		
		
		
	}
	
	
	
	
}
