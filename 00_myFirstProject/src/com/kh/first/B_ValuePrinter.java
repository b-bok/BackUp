package com.kh.first;
								// ��Ű�� ��Ű��    Ŭ�����̴�.
public class B_ValuePrinter { // com.kh.first.B_ValuePrinter()

	/*
	 *  **��Ģ**
	 *  1. Ŭ�������� == �빮�ڷ� ����
	 *  2. ��Ű�� ���� == �ҹ��ڷ� ����
	 *  3. �޼ҵ���� == �ҹ���, ��, ���� �ܾ� �����Ҷ�  �빮�� ����� ��Ÿ���
	 *  4. ������ == �ҹ��ڷ� �����϶�

 	 */
		
	// �پ��� ������ ������ ����ϴ� ����� �޼ҵ�
	
	public void printValue() {
		// 1. ���� ���
		// 
		System.out.println(123);
		System.out.println(1.23);
		System.out.println("���� ������" + 9+ "��" +43+ "��" + "�� ������.");
		
		
		//2. ����(�ѱ���)
		System.out.println('a'); // �ѱ��ڴ� Ȭ����ǥ �̿�
		System.out.println('b');
		
		
		
		//3. ���ڿ�(��������)
		System.out.println("abc");
		System.out.println("�ȳ�\n�ϼ���"); //��¹� �ȿ��� �ٹٲٰ� ������ ���๮�� \n(\�� ��ȭ Ű)
		System.out.println("�ݰ����ϴ�");
		
		
		// 4. ������ ������� ��°���
		
		System.out.println(2*123);
		System.out.println((float) (1.23 - 0.12)); // ��ǻ���� �Ǽ��� ������ �ҿ�����
		
		// 5. ���ڿ� ���ڴ� ���� ������
		
		System.out.println('��' + 1);  // �� ���ڸ��� ��ǻ�Ͱ� �ν��ϴ� ������ ���� ����������  a == 97
		
		// 6. ���ڿ�("")�� ���ڴ� ���� �����ϴ�. �� ���� ���길 ���� --> ���ڿ�ȭ ��
		
		System.out.println("����" + '��'); // ����a �������� ���ڿ��� �Ǿ���ȵ�!
		System.out.println("�ȳ��ϼ���" + 123456789);
		System.out.println("�ݰ���" + "Fuck You");
	}
	
	// ���ڿ� ���ڰ��� ������ ���� ��� �޼ҵ�
	
	public void sumStringNumber() {
		
		System.out.println(9 + 9); // 18
		System.out.println(9 + "9");  //99
		System.out.println("9" + 9); //99
		System.out.println(9 + 9 + "9"); // ������� 9+9 = 18 + 9 = 189
		System.out.println(9 + "9" +9 ); // ������� "99" + 9 �� �������� 
		System.out.println("9" + (9 + 9)); // ��ȣ�� ���� ���� �켱���� ����
		
		
		
		
		
		
	}
	
	
	
}
