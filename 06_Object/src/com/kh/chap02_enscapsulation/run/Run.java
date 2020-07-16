package com.kh.chap02_enscapsulation.run;
import com.kh.chap02_enscapsulation.model.vo.*;
public class Run {

	
	/*
	 * 
	 * 7. 캡슐화 과정 => 완벽한 클래스 형태의 완성!
	 * 
	 * 		1) 정보은닉 : private
	 * 			 각 필드에 직접적으로 접근이 불가하게끔 처리
	 * 		2) setter/getter/ 메소드 : public
	 * 			직접적으로 접근이 불가해졌기 때문에 간접적으로 접근해서 값을 초기화하거나 값 조회하는 메소드 
	 * 		
	 * 			setter메소드의 역할 : 전달값 받아서 해당 필드에 초기화(값을 변경)
	 * 			getter메소드의 역할 : 해당 필드에 담긴 값 반환(값을 조회)
	 * 
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		
		//홍길동 객체
		Student hong = new Student();
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 162.3;
		*/
		
		// 직접접근 불가... 그렇다면?
		// 직접적근을 막았다면, 간접적으로 접근 할 수 있게 만들어야함!
		
		// 간접적으로 접근 가능한 setter 메소드를 이용해서 값 초기화
		
		hong.setName("홍길동");
		hong.setAge(18);
		hong.setHeight(162.3);
		
		// 간접적으로 값을 반환해주는 getter메소드를 이요해 값 반환
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.2fcm입니다.",hong.getName(),hong.getAge(),hong.getHeight());
		
	}

}
