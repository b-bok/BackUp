package com.kh.variable;

public class B_constant {

	public void finalConstant() {
		// ����� �̸��� �� �빮�ڷ� ����
		// ������ ���氡��������, ����� �Ұ�
		// The final local variable age cannot be assigned. 
		//It must be blank and not using a compound assignment
		final int AGE = 27;
		
		System.out.println("AGE : " + AGE);
		
		int age = 21;
		
		System.out.println("age : " + age);
		
	
	}
	
	
}
