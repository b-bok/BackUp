package com.kh.operator;

public class G_Compound {

	/*
	 *  ���� ��� ���� ������  : ��������ڿ� ���Ի��ڸ� �Բ� ����ϴ� ������
	 * 					 ���� ó�� �ӵ��� �ξ� ����
	 * +=, -= *= /= %=
	 * 
	 * a = a + 3;  a += 3;
	 * a = a - 3;  a -= 3;
	 * a = a * 3;  a *= 3;
	 * a = a / 3;  a /= 3;
	 * a = a % 3;  a %= 3;
	 *  
	 */
	
	public void method() {
		
	int num = 12;
	
	System.out.println("������ num�� : " + num);  //12
	
	// 3���� ��Ű��
	num = num + 3;
	System.out.println("3���� ��Ų num�� : " + num); //15
	
	// num�� �� 3���� ��Ű��
	/*
	num++;
	num++;
	num++;
	*/
	
	num += 3; // �ݵ�� ��������� ���Կ����� ������ ���Ѿ� ���տ������̴�.
	System.out.println("�߰��� 3���� ��Ų num : " +num);
	
	// num�� 5 ���ҽ�Ű��
	
	num -= 5; // num = num - 5; ���������� �� ���� ����ӵ�
	System.out.println("5���� ��Ų num : " + num);
	
	// num 6�� ����
	
	num *= 6;
	
	System.out.println("6�� ���� ��Ų num : " + num);
	
	// num 2�� ����
	
	num /= 2;
	System.out.println("2�谨�ҽ�Ų num : " +num);
	
	// num�� 4�� ������ �� ������
	
	num %= 4;
	System.out.println("4�γ��� ������ : " + num);
	
	
	String str = "Hello";
	
	System.out.println("str : " + str);
	
	str += "world";
	System.out.println("str : " + str);
	
	str += 2;
	System.out.println("str : " + str);
		
	}
	
}
