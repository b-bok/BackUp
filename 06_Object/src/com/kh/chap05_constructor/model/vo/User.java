package com.kh.chap05_constructor.model.vo;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	
	// 생성자부
	/*
	 * 
	 * *표현법
	 * 	public 클래스명([매개변수, 매개변수, 매개변수,...]) { // 반환형을 쓰면 메소드 없고, 클래스명을 똑같이 쓰면 생성자
	 * 
	 * }
	 * 
	 * 
	 * * 생성자 작성 목적
	 * 
	 * 	1. 객체를 생성해주기 위한 목적
	 * 	2. 
	 * 
	 * 
	 * * 생성자 작성시 주의사항
	 * 	1. 반드시 클래스명과 동일해야됨!
	 * 	2. 반환형이 존재하지 않음!! (메소드와 유사한 특징 but 헷갈리지 마라)
	 * 	3. 매개변수를 명시적으로 작성하게 되면 JVM이 기본생성자 자동으로 부여안함!
	 * 		즉, 기본 생성자는 항상 작성하는 습관을 가지자!
	 * 	
	 */
	
	public User() {
		
		// 기본 생성자(매개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 기술
		// 기본 생성자는 작성 안해 놓으면 생성 x?
		// => 생성 된다!! => 개발자가 직접 작성안해놓으면 JVM이 자동완성
		
	}
	
	
	public User(String userId, String userPwd, String userName) {
		
		// String userId = "user02"
		// String userPwd = "pass02"
		// String userName = "김말똥"

		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		
		
		
		// 초기화가 안된 필드부분은 JVM의 초기값으로 담겨있을것!!
	}
	
	// 모든 필드값 초기화시켜주는 매개변수 생성자
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		this(userId, userPwd, userName); 
		// this() 생성자 : 같은 클래스 네에서 다른 생성자 호출 가능
		//				 반드시 첫줄에 작성해야함
		this.age = age;
		this.gender = gender;
		
		
	}
	
	// 메소드부
	// setter 메소드 : 전달값을 각 필드에 대입시키는 역할 (값 변경)
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
	// getter 메소드 : 각 필드에 담긴 값을 반환 시켜주는 역할(값 조회)
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
	// inforamtion 메소드 : 모든 필드값을 하나의 문자열로 합쳐서 반환시키져눈 역할
	
	public String information() {
		return "아이디 : " +userId+ ", 비밀먼호 : " +userPwd + ", 이름 : " 
				+userName + ", 나이 : " +age + ", 성별 : " + gender; 
	}
}
