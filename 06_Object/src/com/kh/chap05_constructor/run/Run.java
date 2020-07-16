package com.kh.chap05_constructor.run;
import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �⺻ ��ü ����
		User u1 = new User();
		
		System.out.println(u1.information()); // JVM�� �ʱⰪ �������
		
		// setter�� ���� �� �ʱ�ȭ
		
		u1.setUserid("user01");
		u1.setUserpwd("pass01");
		u1.setUsername("ȫ�浿");
		
		System.out.println(u1.information());
		
		// ������ ���ÿ� �ʱ�ȭ
		// 2. �Ű����� 3��¥�� �����ڸ� ���� ��ü ����
		
		User u2 = new User("user02","pass02","�踻��");
		
		System.out.println(u2.information());
		
		
		//3. �Ű����� 5��¥�� �����ڸ� ���� ��ü ����
		
		User u3 = new User("user03", "pass03","ȫ���",20,'��');
		System.out.println(u3.information());
		
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		System.out.println("=======================");
		
		Scanner sc = new Scanner(System.in); // Scanner Ŭ������ �⺻ �����ڰ� ���� ������ �ݵ�� �Ű����� �ִ� �����ڸ� ������ �����ϴ�.
		
		// �⺻ ������ ���
		
		User u4 = new User();
		
		System.out.print("���̵� : ");
		u4.setUserid(sc.nextLine());
		
		System.out.print("��й�ȣ : ");
		u4.setUserpwd(sc.nextLine());
		
		System.out.print("�̸� : ");
		u4.setUsername(sc.nextLine());
		
		System.out.print("���� �Ǵ� ������ �߰������� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		
	
		if(ch == 'Y'|| ch == 'y') {
			
			System.out.print("���� : ");
			u4.setAge(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("����(��/��) : ");
			u4.setGender(sc.nextLine().charAt(0));
			
			//u4 = new User(userId,userPwd,userName,age,gender);
			
		}
		
		System.out.println(u4.information());
		
	}

		
		
		
		
		
		
		
}

	
