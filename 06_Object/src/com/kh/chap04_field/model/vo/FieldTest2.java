package com.kh.chap04_field.model.vo;



// 필드들의 접근제한자를 테스트 해보기 위한 클래스

public class FieldTest2 {

	/*
	 * 
	 *  * 필드에 사용가능한 접근제한자(4가지 다쓸 수 있음)
	 *  
	 *  (+) public			-> 어디서든(같은 패키지, 다른 패키지) 접근 가능
	 *  (#) protected		-> 같은 패키지 접근 가능 + 다른 패키지일 경우 상속구조간에서 접근 가능
	 *  (~) default			-> 오직 같은 패키지만 접근 가능
	 *  (-) private			-> 오직 해당 클래스에서만 접근 간으
	 *  
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private"; 
	
	
	public static String sta = "FieldTest2";
	
	
}
