package com.mvc.view;

import java.util.Scanner;
import com.mvc.controller.MemberController;
import com.mvc.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void mainMenu() {
		
		/* �޴� ��� >> �ݺ� ���� ó����
		====== ȸ�� ���� �޴� ======
		1. �ű� ȸ�� ��� >> insertMember() ����
		2. ȸ�� ���� �˻� >> searchMember() ����
		3. ȸ�� ���� ���� >> updateMember() ����
		4. ȸ�� ���� ���� >> deleteMember() ����
		5. ȸ�� ���� ��� >> printAllMember() ����
		9. ���α׷� ����
		*/
		while(true) {
			
			System.out.println("\n====== ȸ�� ���� �޴� ======");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ���α׷�  ����");
			System.out.print("�޴� ���� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAllMember(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("��ȣ�� �ٽ� �Է����ּ���."); break;	
			}
		}
		
		
		
		
	}

	public void insertMember() {
		// 1. ���� ȸ�� ��(memberCount)�� �ִ� ȸ�� ��(SIZE)�� �Ѿ ��� return ó��
		// MemberController�� getMemberCount() �޼ҵ带 ���� ���� ȸ�� �� �˾ƿ���
		//�ִ� ȸ�� ���� ����ʵ忩�� Ŭ������. ���� ���� ���� ����
		
		System.out.println("\n == �ű� ȸ�� ��� ==");
		
		
		int count = mc.getMemberCount();
		
		if(count > MemberController.SIZE) {
			return;
		}
		
		// 2. ���̵� �Է� �޾� MemberController�� checkId() �޼ҵ�� ���� >> ��� �� �ޱ�
		sc.nextLine();
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		
		
		if(m != null) {
			System.out.println("������ ���̵� �����մϴ�. ȸ����� ���� ");
		}else {
			System.out.print("��� ��ȣ : ");
			String userPwd = sc.nextLine();
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("����  : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			
			m = new Member(userId, userPwd, name, age, gender, email);
			
			mc.insertMember(m);
			
			System.out.println("���������� ȸ�� ����� �Ǿ����ϴ�.");
		}
		
	
	}
	
	public void searchMember() {
		while(true) {
			System.out.println("====== ȸ�� ���� �˻� ======");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���� �޴��� ");
			
			sc.nextLine();
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			if(menu == 9) { // �� �޼ҵ� Ż��!
				return;
			}
			
			sc.nextLine();
			System.out.print("�˻� ���� : ");
			String search = sc.nextLine();
			// 1. MemberController�� searchMember() �޼ҵ�� menu�� search ���ڿ� ���� >> ��� ��
			Member searchMember = mc.searchMember(menu, search);
			// 1_1. ��� ���� null�� ��� ��, �˻� ����� ���� ��� >> ���˻��� ����� �����ϴ�.�� ���
			if(searchMember == null) {
				System.out.println("�˻��� ����� �����ϴ�.");
			// 1_2. ��� ���� null�� �ƴ� ��� ��, �˻� ����� �����ϴ� ��� >> ȸ�� ���� ���	
			}else {
				System.out.println(searchMember.information());
			}
			
		}
	}
	
	public void updateMember() {
		while(true) {
			System.out.println("====== ȸ�� ���� ���� ======");
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("9. ���� �޴���");
			
			sc.nextLine();
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			if(menu == 9) { // �� �޼ҵ� Ż��!
				return;
			}
			
			sc.nextLine();
			System.out.print("������ ȸ�� ���̵� : ");
			String userId = sc.nextLine();
			
			Member m = mc.checkId(userId);
			
			if(m == null) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}else {
				
				System.out.print("���� ���� : ");
				String update = sc.nextLine();
				
				mc.updateMember(m,menu,update);
				
				System.out.println("ȸ�� ������ ����Ǿ����ϴ�.");
			}
			
		}
	}
	
	public void deleteMember() {
		sc.nextLine();
		System.out.print("������ ȸ�� ���̵� : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		
		if(m == null) {
			sc.nextLine();
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		}else {
			
			System.out.print("���� ���� �Ͻðڽ��ϱ�?(y/n) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				mc.deleteMember(userId);
				System.out.println("ȸ�� ������ �����Ǿ����ϴ�.");
			}else {
				return;
			}
			
		}
		
	}
	
	public void printAllMember() {
		
		Member[] mem = mc.getMem();
		
		for(int i = 0; i<mc.getMemberCount();i++) {
		
			System.out.println(mem[i].information());
			
		}
		
		System.out.println(mc.getMemberCount());
	}
	
}
