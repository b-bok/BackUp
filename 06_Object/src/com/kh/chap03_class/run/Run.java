package com.kh.chap03_class.run;
import java.util.Scanner;

import com.kh.chap03_class.model.vo.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��ü������ ���� Heap ������ ������ ���� Ȯ���ص־ߵ�(�Ҵ�)		
		Person p = new Person();
		
		p.setId("user");
		p.setPwd("pass01");
		p.setName("ȫ�浿");
		p.setAge(20);
		p.setGender('M');
		p.setPhone("010-1111-2222");
		p.setEmail("hong@naver.com");
		
		//String id = p.getId();
		//System.out.println(id);
		
		//System.out.println(p.getId());
		//System.out.printf("%s�� ��й�ȣ�� %s�̸� �̸��� %s�Դϴ�.\n���̴� %d���̸� %c���Դϴ�.\n��ȭ��ȣ�� %s�̰�, �̸����� %s�Դϴ�."
						//,p.getId(),p.getPwd(),p.getName(),p.getAge(),p.getGender(),p.getPhone(),p.getEmail());
		/*
		System.out.println("id : " + p.getId() + " pwd : " + p.getPwd() + " name : " + p.getName() + " age : " + p.getAge()
							+ " gender :" + p.getGender() + " phone : " + p.getPhone() + " email : "  + p.getEmail());
	
		//p.setPhone("010-2222-3333");
		
		//System.out.println(p.getPhone());
		*/
		
		//System.out.println(p.information());
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("������ �̸� : ");
		//String name = sc.nextLine();
		
		//p.setName(name); // ���� ��û
		
		//System.out.println(p.information());
		
		
		
	}
}	
	
