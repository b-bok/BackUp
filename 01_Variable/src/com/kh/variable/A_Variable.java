package com.kh.variable;
// �ٸ� ��Ű����� ���� Ŭ���������� ��� ����!
public class A_Variable {

	
	
	/*
 * 1. ����?
 * 2. �� ���?
 * 3. ��� ��? 
 * 4. ����Ģ?
 * 
 */
	public void printValue() {
		
		System.out.println("======= ���� ��� �� ==========");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		// ����� ������ but �ǹ� �ľ� �����
		
		int point = 100;		// ����Ʈ
		int bonus = 10;			// ���ʽ�
		int personCount = 10;	// �����
		int fees = 10;			// ������
		
		System.out.println("===========���� ��� ��=========");
		// ����? --> �޸� ��� �ڽ� ���� ����
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
		
		/*
		 *  2. ������ ����ϴ� ������ �˾Ҵ�! --> �ǹ̰� �ο��Ǿ� �ľ��� ����
		 *  - ������ ���� �ǹ̸� �ο��ϱ� ���� ��� == �������� ����
		 *  - ������ �ѹ� �� ����, ��� ��� �� �������� �̿� == ���������� ����
		 */
	
	}
	
	
	public void declareVariable() {
		
		
		
		System.out.println();
		
		//3. ������ ��� �����, ��� ���� ������ ?
		/*
		 * 3_1. ������ ����(������ ���� ����ϱ� ���� ������ �޸� ���� Ȯ���ϴ� ����)
		 * [ǥ����] �ڷ��� ������;
		 * �ڷ��� : � ����, � ũ���� ���� ���� �ڽ� ����
		 * ������ : ���� �ǹ� �ο�
		 * (����! 
		 * -�ݵ�� ù���ڴ� �ҹ���,
		 * - ��Ÿ��� ��Ű��,-
		 * - ������ ���� ���� ���� �Ұ�
		 * - �ش� ������ ������ ���������� �ش翵�������� ��밡��
		 * 
		 * 
		 * 
		 */
		// ------�ڷ���( 8��) ------
		// 1. ����
		boolean isTrue; //1byte
		// 2. ������
		// 2_1. ������
		byte bNum; // 1byte(-128~127)
		short sNum; // 2byte
		int iNum; // 4byte --> �⺻��
		long lNum; // 8byte --> ��¥ ���� �ڷ� �ۼ� ��
		
		// 2_2. �Ǽ���(2��)
		float fNum; //4byte
		double dNum; // 8byte �Ǽ������� �⺻��, �� ��Ȯ�� �� ����
		
		// 3. ����
		
		char ch; // 2byte 
		
		// ���� �ڷ���, ���ڿ�(�������� ����)
		
		String str;
		
		
		/*
		 *  3_2. ������  �� ����(�ʱ�ȭ)
		 *  
		 *  [ǥ����] �ڷ��� ������ = ��;
		 *  
		 * 
		 */
		
		isTrue = true; // ���� ������ true, false�� ���� ����
		bNum = 1;
		sNum = 2;
		iNum = 3;
		lNum = 1_000_000_000L; // long�� �������� L�� ���� �ٿ��� ǥ��������
		
		fNum = 4.0f; // float�� �������� ���� f�� ���� �ٿ�����
		dNum = 4.12;
		
		ch = 'A'; // Ȭ ����ǥ�� �̿��Ͽ� �����ϸ� ��
		str = "abcdedfhijkl";
		
		// ������ ���� �� ��島?
		
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch + str);
		System.out.println(5_000_000*30);
		
	}
	
	public void initVariable() {
		// ���� �����̶�, ���� �����ϴ� ���� ���ÿ� �Ұ�
		// [ǥ����] �ڷ��� ������ = ��;
		
		boolean isTrue = true;
		byte bNum = 1;
		short sNum = 12;
		int iNum =123;
		long lNum = 1234L;
		float fNum = 1234.12f;
		double dNum = 123.45; //�� ��Ȯ�� �� ���� �����ؼ� �⺻��
		char ch = 'c';
		
		
		String str = "charbok";
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch + str:" +ch + str);
		
		int result = iNum * 2;
		
		System.out.println("result : " + result);
		
		//
		int etc = 100_999_999;
		System.out.println("etc : " + etc);
		
		
		
	}
	
	
	
	public void namingRule() {
		
		int number;
		//double number; ���� �ߺ� �Ұ�
		// ��ҹ��� ���а���
		int Number;
		
		//true, public, class, void, abstract ����
		// �̹� �ڹٿ��� ���ǰ� �ִ� ������.
		// �����̸��� ���� ���� �����ϳ�, ���ڷ� �����ؼ� �ȵȴ�!
		// _�� $ Ư������ �����ϰ�� ��� �Ұ�
		
		int number_1;
		int number$;
		
		int age1;
		int age12;
		int age123;
		// �������ʹ� �������
		// �̰��� �ٷ� ��Ÿǥ����̴�! / ������ �ҹ��ڷ� �Ұ�!
		int toFindSumProject;
		int whenWeGoHome;
		int whatIsTheProblem;
		
		/*
		 * ����!
		 * ������ ��(���ͷ�)�� ����ϱ� ���� �����̴�.
		 * ������ ����Ѵٸ�, �ǹ��ľ��� ����, ���������� ����
		 * ���� ����� �������� ���ÿ�
		 * [ǥ����] �ڷ��� ������  = ��; ��� ���� ����
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}
	
	
}
