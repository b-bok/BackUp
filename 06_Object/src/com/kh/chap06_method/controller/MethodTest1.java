package com.kh.chap06_method.controller;

public class MethodTest1 {

	//�޼ҵ� == ���
	
	/*
	 * ���������� ��ȯ��
	 * 
	 * 
	 * ���������� [�����]��ȯ�� ���� �ڷ��� ([�Ű�����, �Ű�����,...) {
	 * 
	 * 		������ �ڵ�;
	 * 		������ �ڵ�;
	 * 		������ �ڵ�;
	 * 
	 * 		[return ��ȯ��;]
	 * }
	 * 
	 */

	
	// �Ű����� ������ ��ȯ�� ������ ���� ����
	
	// 1. �Ű� ���� ���� ��ȯ���� ���� �޼ҵ�
	
	public void method1() {
		
		System.out.println("�Ű������� ��ȯ�� ���� �޼ҵ�");
		
		//return; ��ǻ� ��� �޼ҵ�� return�� �ִ�!
		
	}
	
	//2. �Ű� ������ ������ ��ȯ���� �ִ� �޼ҵ�
	
	public double method2() {
		
		System.out.println("�Ű����� ������ ��ȯ���� �ִ� �޼ҵ�");
		
		return Math.random();
		
	}
	
	
	//3. �Ű� ������ ������ ��ȯ���� ���� �޼ҵ�
	
	public void method3(int num1, int num2) {
		
		System.out.println("�Ű������� ������ ��ȯ���� ���� �޼ҵ��Դϴ�.");
		
		System.out.println(num1 + num2);
		
	}
	
	//4. �Ű������� �ְ�, ��ȯ���� �ִ� �޼ҵ�
	
	public int method4(int num1, int num2) {
		
		
		System.out.println("�Ű������� �ְ�, ��ȯ���� �ִ�!");
		
		return  num1 - num2;
		
	}
}
