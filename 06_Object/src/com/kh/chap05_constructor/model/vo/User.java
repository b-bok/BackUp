package com.kh.chap05_constructor.model.vo;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	
	// �����ں�
	/*
	 * 
	 * *ǥ����
	 * 	public Ŭ������([�Ű�����, �Ű�����, �Ű�����,...]) { // ��ȯ���� ���� �޼ҵ� ����, Ŭ�������� �Ȱ��� ���� ������
	 * 
	 * }
	 * 
	 * 
	 * * ������ �ۼ� ����
	 * 
	 * 	1. ��ü�� �������ֱ� ���� ����
	 * 	2. 
	 * 
	 * 
	 * * ������ �ۼ��� ���ǻ���
	 * 	1. �ݵ�� Ŭ������� �����ؾߵ�!
	 * 	2. ��ȯ���� �������� ����!! (�޼ҵ�� ������ Ư¡ but �򰥸��� ����)
	 * 	3. �Ű������� ��������� �ۼ��ϰ� �Ǹ� JVM�� �⺻������ �ڵ����� �ο�����!
	 * 		��, �⺻ �����ڴ� �׻� �ۼ��ϴ� ������ ������!
	 * 	
	 */
	
	public User() {
		
		// �⺻ ������(�Ű����� ���� ������)
		// ���� ��ü �������� �������� �� �� ���
		// �⺻ �����ڴ� �ۼ� ���� ������ ���� x?
		// => ���� �ȴ�!! => �����ڰ� ���� �ۼ����س����� JVM�� �ڵ��ϼ�
		
	}
	
	
	public User(String userId, String userPwd, String userName) {
		
		// String userId = "user02"
		// String userPwd = "pass02"
		// String userName = "�踻��"

		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		
		
		
		// �ʱ�ȭ�� �ȵ� �ʵ�κ��� JVM�� �ʱⰪ���� ���������!!
	}
	
	// ��� �ʵ尪 �ʱ�ȭ�����ִ� �Ű����� ������
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		this(userId, userPwd, userName); 
		// this() ������ : ���� Ŭ���� �׿��� �ٸ� ������ ȣ�� ����
		//				 �ݵ�� ù�ٿ� �ۼ��ؾ���
		this.age = age;
		this.gender = gender;
		
		
	}
	
	// �޼ҵ��
	// setter �޼ҵ� : ���ް��� �� �ʵ忡 ���Խ�Ű�� ���� (�� ����)
	public void setUserid(String userId) {
		this.userId = userId;
	}
	
	public void setUserpwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	// getter �޼ҵ� : �� �ʵ忡 ��� ���� ��ȯ �����ִ� ����(�� ��ȸ)
	public String getUserid() {
		return userId;
	}
	
	public String getUserpwd() {
		return userPwd;
	}
	
	public String getUsername() {
		return userName;
	}
	
	public int getAge () {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	// inforamtion �޼ҵ� : ��� �ʵ尪�� �ϳ��� ���ڿ��� ���ļ� ��ȯ��Ű���� ����
	
	public String information() {
		return "���̵� : " +userId+ ", ��и�ȣ : " +userPwd + ", �̸� : " 
				+userName + ", ���� : " +age + ", ���� : " + gender; 
	}
}
