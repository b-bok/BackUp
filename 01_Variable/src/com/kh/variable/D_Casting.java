package com.kh.variable;

public class D_Casting {

	//����ȯ �����! = �ڷ��� �� �ٲٱ�
	
	/*
	 *  ��ǻ���� ��ó�� ��Ģ�� ����(��, ����ȯ�� �ʿ��� ������?)
	 *  1. ���� �ڷ��� ���� ���� ��!
	 *  ex) �ڷ��� ������ = (�ٲ� �ڷ���) ��; �ٸ� �ڷ��� ���� �����ϰ� �ʹٸ�!
	 *  
	 *  2. ����� ���� �ڷ��� ������(�� ��� �� ���� ���� �ڷ�������!)
	 *  
	 *  
	 *  *����ȯ ����*
	 *  1. �ڵ� ����ȯ : �ڵ����� ����ȯ �Ǿ� ����� �ʿ� ����
	 *  2. ���� ����ȯ : ���� ����ȯ ! = ����� ����ȯ
	 *  [ǥ����] (�ٲ��ڷ���)��;
	 *  
	 *  *���ǻ���*
	 *  boolean ����ȯ �Ұ� ������ true/false ���� ����
	 *  
	 *  
	 * 
	 */
	
	//1. �ڵ� ����ȯ
	
	public void casting1() {
		// ���� �ڷ����� �ڵ����� ū �ڷ������� ��ȯ (�۰� ū ���� ����Ʈ ���� ����)
		
		// 1. int(4byte) --> double(8byte)
		
		int i1 = 12;
		// ���� ����
		double d1 = i1; // (double) i1;
		
		System.out.println("d1 : " + d1);
		
		// ��� ����
		
		int i2 = 12;
		double d2 = 3.3;
		double result2 = i2 + d2; 
		// (double) i2 + d2 12 + 3.3 => 12.0 + 3.3 => 15.3  
		
		System.out.println("result2 : " + result2 );
		System.out.println("================");
		
		
		//2. float(4byte) --> double(8byte)
		float f3 = 14.5f;
		double d3 = 11.444;
		
		double result3 = f3 + d3;
		
		System.out.println("f3 : " + f3);
		System.out.println("d3 :" + d3);
		
		
		System.out.println("result3 : " + result3);
		
		// 3. int(4byte) --> long(8byte)
		
		int i4 = 144444444;
		long l4 = i4; // = (long) i4;
		
		System.out.println("i4 + l4 :" +(i4 + l4)); // int���� long�� �ڷ������� ��ȯ �Ȱ�
		
		
		
		// 4. long(8byte) --> float(4byte)
		//		������			�Ǽ��� 
		// �Ǽ����� ��� ���������� �ξ� �� ū ���� �� ���� ����
		long l5 = 1_000_000_000L;
		float f5 = l5;
		// byte short int long float double
		// 	1	 2     4    8    4     8
		
		System.out.println("f5 : " + f5);
		
		// *Ư�����̽�*
		// char(2byte) <--> int(4byte) �ֹ���
		// 'a' '!' '��' 'A' �� ������ ���ڰ��� �ִ�.
		
		char ch = 65; //char 65 == A  66 == B 67 == C
		
		System.out.println("ch : " + ch);
		
		int i6 = 12;
		
		System.out.println("c6 + i6 : " + (ch + i6));
		
		
		
		
		// byte , short���� ������ ��� int�� ���
		
		byte b1 = 1;
		byte b2 = 10;
		
		byte result = (byte) (b1 + b2);
		
		System.out.println("b1 + b2 : " + result);
		
		
		
	}
	
	
	public void casting2() {
		// ���� ����ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� ��ȯ ����
		
		// double(8) --> float(4)
		
		double d = 4.0;
		float f = (float) d;
		
		// double(8) --> int(4)
		
		double d2 = 162.23;
		int i2 = (int) d2; //�Ǽ����� ���������� ��ȯ���� �� ������ �ս� �߻� ����
		
		System.out.println("i2 : " + i2);
		
		
		int iNum = 10;
		double dNum = 5.11;
		
		int iSum = (int) (iNum + dNum);
		
		System.out.println("iSum : " + iSum);
		// ���� ����ȯ �ϸ� �Ҽ��� �Ʒ��κ��� ��������(������ �ս�)
		// (double) 10 + 5.11 -> 15.11(double) -> 15 (int)
		// �ذ��� 1. ����������  int�����ΰ��� ����ȯ
		// �ذ��� 2. double���� int������ ���� ����ȯ �� �������� 
		
		int iSum2 = iNum + (int) dNum;
		// 10 + (int)5.11 -> 10 + 5 => 15 (������ �ս� �߻�)
		System.out.println("iSum2 : " + iSum2);
		
		// �ذ��� 3. ���� ����� double�� ������ ����ϱ�
		
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
