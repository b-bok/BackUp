package com.kh.operator;

public class B_InDecrease {

	/*
	 *  *����������(���� ������)
	 *  
	 *  
	 *  ++ : ���� 1���� ��Ű�� ������
	 *  -- : ���� 1���� ��Ű�� ������
	 *  
	 *  (����������) �� : ���� ������  --> ������ �� ó��
	 *  ��(����������) : ���� ������   --> ��ó�� �� ����	
	 */
	
	public void method1() {
		//���� ���� �׽�Ʈ
		
		int num1 = 10;
		System.out.println("���� ���� �������� num1�� �� : " + num1);
		System.out.println("1ȸ ������ ��� : " + ++num1); //num1 = 11 ���
		System.out.println("2ȸ ������ ��� : " + ++num1);
		System.out.println("���� ���� ���� �� num1�� �� : " + num1);
		
		System.out.println("===================================");
		
		int num2 = 10;
		
		System.out.println("���� ���� �������� num2�� �� :" + num2 );
		System.out.println("1ȸ ������ ��� : " + num2++);
		System.out.println("2ȸ ������ ��� : " + num2++);
		System.out.println("���� ���� ���� �� num2�� �� : " + num2);
		
	}
	
	
	public void method2() {
		
		//���� ����
		
		int a = 10;
		int b = ++a; // a = 11 b = 11
		
		System.out.println("a : " + a + ", b : " + b);
		
		//���� ����
		
		int c = 10;
		int d = c++; // c = 10(11) d = 10 --> c�� �ϴ� 10�� d�� �����ϰ� �� �Ŀ� 1�� �����ؼ� 11�̴�. 
		
		System.out.println("c : " + c + ", d : " + d);
		
		int num1 =20;					//��, ��
		int result = num1++ *3; // num1 =20(21) ���� result = 60 �� ���� num1 = 21�� �ȴ�.
		
		System.out.println("num1 : " + num1);
		System.out.println("result : " + result);
		
		
		
		int num2 = 20;
		int result2 = ++num2 * 3; // num2=21 result2 = 63
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
		
	}
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); //a = 10(11)
		System.out.println(++a + b++); // a =12 b= 20(21)  a+b = 32
		System.out.println((a++) + (--b) + (--c)); // a =12(13) b=20 c= 29  a + b + c = 61 
		
		System.out.println("a : " + a); // a = 13 
		System.out.println("b : " + b); // b = 20
		System.out.println("c : " + c); // c = 29
		
		
		
		
	}
	
	public void method5() {
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		
		System.out.println(++a - --b); // a= 11 b = 9 a-b = 2
		System.out.println(--b + c++); // b= 8 c= 20(21) b + c = 28
		System.out.println(a++ + b-- * c++); // a= 11(12) b = 8(7) c=21(22) 179
		
		System.out.println("a : " + a); // a =12
		System.out.println("b : " + b); // b = 7
		System.out.println("c : " + c); // c = 22
		
		
	}
	
	
	
}
