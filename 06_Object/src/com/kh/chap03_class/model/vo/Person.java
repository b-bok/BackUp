package com.kh.chap03_class.model.vo;

public class Person {

	
	//�ʵ��
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	
	// �����ں�
	
	// �޼ҵ��
	// ���� ������ [�����] ��ȯ��([�Ű�����, �Ű�����,...) {���� ����}
	
	// * setter �޼ҵ�(�� ����)
	// ���޵Ǵ� ���� �޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ(����)���� ������ ���� �޼ҵ�
	// ��ȯ�� : void(��ȯ ���� ����!)
	// �޼ҵ�� : setXXX (�ʵ���� �����ؼ� �޼ҵ�� ������) 
	// �Ű������� : �ʵ���� ��ġ������
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// * getter �޼ҵ� : �� �ʵ忡 ��䰪�� ��ȯ�ϴ� ����
	// 		�޼ҵ�� : getXXX
	//		�Ű����� : �ʿ����
			
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		 if(gender == 'M') {
			gender = '��';
			return gender;
		}else {
			gender = '��';
			return gender;
		}
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	// ��� �ʵ忡 ��� ���� �ϳ��� ���ڿ��� ���ļ�
	// ��ȯ���ִ� �޼ҵ�
	
	public String information() {
		/*
		String str = "id : " + id + ", pwd : " + pwd + ", name : " + name
					+ ", age : " + age + ", gender : " + gender 
					+ ", phone : " + phone + ", email : " + email;
		
		return str;
		*/
		
		return "id : " + id + ", pwd : " + pwd + ", name : " + name
				+ ", age : " + age + ", gender : " + gender 
				+ ", phone : " + phone + ", email : " + email;
	}
}
