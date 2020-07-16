package com.kh.chap02_enscapsulation.model.vo;

public class Student {
	
	// 필드부
	
	/*
	 * 
	 * 필드 == 멤버 변수 == 인스턴스 변수
	 * 
	 * <표현법>
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 * 필드부에 접근제한자는 private으로 해서 직접적으로 접근이 불가하게끔 "정보은닉"
	 * 객체지향설계원칙 중 하나
	 * 
	 */
	private String name;
	private int age;
	private double height;
	
	
	
	//생성자부
	
	
	
	
	// 메소드부
	/*
	 * <표현법>
	 * 접근제한자 반환형 메소드명([매개변수(생략가능)]) {
	 * 			//기능 구현
	 * }
	 * 
	 * 매개변수 : 해당 메소드 호출 시 전달되는 값을 받아주기위한 변수
	 * 
	 * 
	 */
	
	// 간접적으로 접근해서 호출가능한 메소드 만들기!
	// * 담고자하는 데이터를 전달받아서 해당 필드에 초기화 시켜주는 기능의 메소드 
	//	== setter 메소드
	// 주로 setter메소드명을 지어줄때 setXXX으로 낙타표기법을 지킨채로 지어주는 관례(ex, setName, setAge, setHeight)
	/*
	public void setName(String newName) { // String newName = "홍길동;
		
		name = newName;// private는 같은 클래스 내에서 접근가능하다.
	}
	*/
	
	public void setName(String name) {
		// 매개변수 name = 매개변수 name;
		//	name = name;
		
		// 필드 name = 매개변수 name;
			this.name = name;
		
	}
	
	// 전달 받은 나이값을 age 필드에 대입시켜주는 setter메소드
	public void setAge(int age){ // int age = 20;
		
		this.age = age;
	}
	
	// 전달 받은 키 값을 height 필드에 대입시켜주는 setter메소드
	public void setHeight(double height) {
		
		this.height = height;
	}
	
	
	
	// * 각 필드에 담긴값을 반환해주는 기능을 하는 메소드 (getter 메소드)
	// 통상 getXXX() 메소드명으로 지어줌
	// getter메소드는 단지 필드에 값을 반환만 시켜줄꺼기 때문에 
	// 별도로 전달되는 값이 필요 없음
	
	// name 필드에 담긴 값을 반환해줄 목적을 가진 getter 메소드
	public String getName() {
		
		return name;
		
	}
	// age 필드에 담긴 값을 반환해줄 목적을 가진 getter 메소드
	public int getAge() {
		
		return age;
		
	}
	// height 필드에 담긴 값을 반환해줄 목적을 가진 getter 메소드
	public double getHeight() {
		
		return height;
	}
}
