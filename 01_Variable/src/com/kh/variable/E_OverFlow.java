package com.kh.variable;

public class E_OverFlow {

	public void overflow() {
		// byte �ڷ����� ���� ������ ������ = -128 ~ 127
		
		byte bNum = 127;
		
		bNum++; // bNum ���� 1 ���� ��Ų��.
		bNum++;
		
		// ���� �� �� ���� ������ ���� ������ ����� ���� ���� �÷ο�
		// ������ �߻����� ������, �����Ұ� ���� ��� �� ����
		
		System.out.println("bNum : " + bNum);
		
		
		
		
	}
	
	
	
	
	
	
}
