package com.kh.chap02_enscapsulation.model.vo;

public class Student {
	
	// �ʵ��
	
	/*
	 * 
	 * �ʵ� == ��� ���� == �ν��Ͻ� ����
	 * 
	 * <ǥ����>
	 * ���������� [�����] �ڷ��� ������;
	 * 
	 * �ʵ�ο� ���������ڴ� private���� �ؼ� ���������� ������ �Ұ��ϰԲ� "��������"
	 * ��ü���⼳���Ģ �� �ϳ�
	 * 
	 */
	private String name;
	private int age;
	private double height;
	
	
	
	//�����ں�
	
	
	
	
	// �޼ҵ��
	/*
	 * <ǥ����>
	 * ���������� ��ȯ�� �޼ҵ��([�Ű�����(��������)]) {
	 * 			//��� ����
	 * }
	 * 
	 * �Ű����� : �ش� �޼ҵ� ȣ�� �� ���޵Ǵ� ���� �޾��ֱ����� ����
	 * 
	 * 
	 */
	
	// ���������� �����ؼ� ȣ�Ⱑ���� �޼ҵ� �����!
	// * ������ϴ� �����͸� ���޹޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ �����ִ� ����� �޼ҵ� 
	//	== setter �޼ҵ�
	// �ַ� setter�޼ҵ���� �����ٶ� setXXX���� ��Ÿǥ����� ��Ųä�� �����ִ� ����(ex, setName, setAge, setHeight)
	/*
	public void setName(String newName) { // String newName = "ȫ�浿;
		
		name = newName;// private�� ���� Ŭ���� ������ ���ٰ����ϴ�.
	}
	*/
	
	public void setName(String name) {
		// �Ű����� name = �Ű����� name;
		//	name = name;
		
		// �ʵ� name = �Ű����� name;
			this.name = name;
		
	}
	
	// ���� ���� ���̰��� age �ʵ忡 ���Խ����ִ� setter�޼ҵ�
	public void setAge(int age){ // int age = 20;
		
		this.age = age;
	}
	
	// ���� ���� Ű ���� height �ʵ忡 ���Խ����ִ� setter�޼ҵ�
	public void setHeight(double height) {
		
		this.height = height;
	}
	
	
	
	// * �� �ʵ忡 ��䰪�� ��ȯ���ִ� ����� �ϴ� �޼ҵ� (getter �޼ҵ�)
	// ��� getXXX() �޼ҵ������ ������
	// getter�޼ҵ�� ���� �ʵ忡 ���� ��ȯ�� �����ٲ��� ������ 
	// ������ ���޵Ǵ� ���� �ʿ� ����
	
	// name �ʵ忡 ��� ���� ��ȯ���� ������ ���� getter �޼ҵ�
	public String getName() {
		
		return name;
		
	}
	// age �ʵ忡 ��� ���� ��ȯ���� ������ ���� getter �޼ҵ�
	public int getAge() {
		
		return age;
		
	}
	// height �ʵ忡 ��� ���� ��ȯ���� ������ ���� getter �޼ҵ�
	public double getHeight() {
		
		return height;
	}
}
