package com.kh.chap06_method.controller;

public class OverloadingTest3 {

	// �����ε� : �� Ŭ���� ���� ���� �޼ҵ������ ������ �� �ִ� ���
	
	
	public void test() { // x.test();
		
	}
	
	// �ĺ� ����
	
	
	public void test(int a) { // x.test(1);
		
	}
	
	public void test(int a, String s) { // x.test(1,"S");
		
	}
	
	public void test(int a, int b) { // x.test(1,2)
		
	}
	
	// ���� �߻� --> �Ű��������̶��� ������� �ڷ��� ������ ������ �޶����
	
	public void test(int a, int b, String str) { // x.test(10,20,"")
		
	}
	
	/*public int test(int a, int b, String str) {
		
		return 0;
	}
	*/
	
	// ���� �߻� --> ��ȯ���� �ٸ��ٰ� �����ε� ������� ����!! (�Ű������� ������ �޶�߸���!!)
	/*
	private void test(int a, int b, String str) {
		
	}
	*/
	
	// �����߻� --> ���������� �ٸ��ٰ� �����ε� ����� ����!! (�Ű� ������ ������ �޶����!)
	
	/*
	 * 
	 * * ���
	 * �����ε� : ������ �޼ҵ���� ����ϴ� ��
	 * 			��, ���� ������, ��ȯ���� ������ �Ű������� ������ �޶����!
	 * 
	 * 
	 */
}
