package com.kh.chap02_enscapsulation.run;
import com.kh.chap02_enscapsulation.model.vo.*;
public class Run {

	
	/*
	 * 
	 * 7. ĸ��ȭ ���� => �Ϻ��� Ŭ���� ������ �ϼ�!
	 * 
	 * 		1) �������� : private
	 * 			 �� �ʵ忡 ���������� ������ �Ұ��ϰԲ� ó��
	 * 		2) setter/getter/ �޼ҵ� : public
	 * 			���������� ������ �Ұ������� ������ ���������� �����ؼ� ���� �ʱ�ȭ�ϰų� �� ��ȸ�ϴ� �޼ҵ� 
	 * 		
	 * 			setter�޼ҵ��� ���� : ���ް� �޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ(���� ����)
	 * 			getter�޼ҵ��� ���� : �ش� �ʵ忡 ��� �� ��ȯ(���� ��ȸ)
	 * 
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		
		//ȫ�浿 ��ü
		Student hong = new Student();
		/*
		hong.name = "ȫ�浿";
		hong.age = 20;
		hong.height = 162.3;
		*/
		
		// �������� �Ұ�... �׷��ٸ�?
		// ���������� ���Ҵٸ�, ���������� ���� �� �� �ְ� ��������!
		
		// ���������� ���� ������ setter �޼ҵ带 �̿��ؼ� �� �ʱ�ȭ
		
		hong.setName("ȫ�浿");
		hong.setAge(18);
		hong.setHeight(162.3);
		
		// ���������� ���� ��ȯ���ִ� getter�޼ҵ带 �̿��� �� ��ȯ
		System.out.printf("%s���� ���̴� %d���̰�, Ű�� %.2fcm�Դϴ�.",hong.getName(),hong.getAge(),hong.getHeight());
		
	}

}
