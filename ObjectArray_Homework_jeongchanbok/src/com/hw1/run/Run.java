package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// ��ü�迭�� ũ�� 3���� �Ҵ� �� ��
		// 0�� �ε������� �⺻�����ڸ� ���ؼ� ��ü ����
		// 1�� �ε������� �Ű����� 6��¥�� �����ڸ� �̿��Ͽ� ��ü ����
		// 2�� �ε������� �Ű����� 10��¥�� �����ڸ� �̿��Ͽ� ��ü ���� �� ���
		Employee[] emp = new Employee[3];
		emp[0] = new Employee();
		emp[1] = new Employee(1,"ȫ�浿",19,'M',"01022223333", "���� ���");
		emp[2] = new Employee(2,"������","������","����",20,'F',1000000,0.01, "01011112222","���� ����");
		
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		System.out.println("emp[2] : " + emp[2].information());
		// 3���� ��ü �� ���� ���� �ʵ忡 ���� ���� ���� �� �ٽ� ���
		System.out.println("=================================================================");
		emp[0] = new Employee(0, "�踻��", "������", "����", 30, 'M', 3000000,0.2,"01055559999","���� ����");
		emp[1].setDept("��ȹ��");
		emp[1].setJob("����");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		System.out.println(emp[0].information());
		System.out.println(emp[1].information());
		System.out.println("=================================================================");
		
		// ���� ������ ���ʽ��� ����� 1�� ������ ����Ͽ� ���
		// ���ʽ��� ����� ���� = (�޿� + (�޿� * ���ʽ�����Ʈ)) * 12
		// 3�� ������ ���� ����� ���Ͽ� ��� 
		for(Employee n : emp) {
			System.out.println(n.getEmpName() + "�� ���� : " + n.nSalary(n.getSalary(), n.getBonusPoint()) + "��");
			
		}
		System.out.println("=================================================================");
		
		// 3�� ������ ���� ����� ���Ͽ� ��� 
		int sum = 0;
		
		for(Employee n : emp) {
			
			sum += n.nSalary(n.getSalary(), n.getBonusPoint());
			
		}
		
		
		int avs = (sum) / 3;
		
		System.out.println("������ ������ ��� : " + avs + "��");
		
	}

}
