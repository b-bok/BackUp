package com.kh.chap05_constructor.run;
import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본 객체 생성
		User u1 = new User();
		
		System.out.println(u1.information()); // JVM의 초기값 담겨있음
		
		// setter를 통해 값 초기화
		
		u1.setUserid("user01");
		u1.setUserpwd("pass01");
		u1.setUsername("홍길동");
		
		System.out.println(u1.information());
		
		// 생성과 동시에 초기화
		// 2. 매개변수 3개짜리 생성자를 통해 객체 생성
		
		User u2 = new User("user02","pass02","김말똥");
		
		System.out.println(u2.information());
		
		
		//3. 매개변수 5개짜리 생성자를 통해 객체 생성
		
		User u3 = new User("user03", "pass03","홍길녀",20,'여');
		System.out.println(u3.information());
		
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		System.out.println("=======================");
		
		Scanner sc = new Scanner(System.in); // Scanner 클래스는 기본 생성자가 없기 때문에 반드시 매개변수 있는 생성자만 생성이 가능하다.
		
		// 기본 생성자 방법
		
		User u4 = new User();
		
		System.out.print("아이디 : ");
		u4.setUserid(sc.nextLine());
		
		System.out.print("비밀번호 : ");
		u4.setUserpwd(sc.nextLine());
		
		System.out.print("이름 : ");
		u4.setUsername(sc.nextLine());
		
		System.out.print("나이 또는 성별을 추가적으로 입력하시겠습니까?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		
	
		if(ch == 'Y'|| ch == 'y') {
			
			System.out.print("나이 : ");
			u4.setAge(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("성별(남/여) : ");
			u4.setGender(sc.nextLine().charAt(0));
			
			//u4 = new User(userId,userPwd,userName,age,gender);
			
		}
		
		System.out.println(u4.information());
		
	}

		
		
		
		
		
		
		
}

	
