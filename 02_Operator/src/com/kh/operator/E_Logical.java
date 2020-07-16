package com.kh.operator;
import java.util.Scanner;
public class E_Logical {
	
	/*
	 *  *�� ������!(���� ������)
	 *  - �� ������ ������ �����Ѵ�!
	 *  
	 *  
	 *  ���� &&(and) ���� : �� ���� ��� true���� ����� true
	 *  ���� ||(or)  ���� : �� ���� �� �ϳ��� true���� ����� true
	 *  
	 *  
	 * 
	 */
	
	
	public void method1() {
		//����ڰ� �Է��� ������ 1 �̻� 100 ������ ������ Ȯ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է����ּ��� : ");
		int num1 = sc.nextInt();
		
		System.out.println(num1 >= 1 && num1 <= 100 );
		//System.out.println(!(num1 <=1 || num1 >= 100));
		// &&(and ������)�� �ǹ� : ~�ϰ�, �׸���, ~�ϸ鼭, ~�̰� 
		// �ΰ� ������ ��� true���߸� ����� true
		// && �ϳ��� false �� ������� false

	}

	public void method2() {
		// ����ڰ� �Է��� �����ڰ� �빮�� ���� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��� �����ڰ� �빮�� �ΰ���?");
		char ch = sc.nextLine().charAt(0);
		// ������ 'A' ~ 'Z' (65 ~ 90������ ���ڷ� ���޾� �����Ǿ�����)
		System.out.println(ch >= 'A' && ch <= 'Z');
		// �ƽ�Ű�ڵ�ǥ(0~127 : ������, ����, Ư������)
		// �����ڵ�ǥ(0~65535 : �ѱ�����)
		
		//boolean result  = (ch >= 'A' && ch <= 'Z');
		boolean result  = ('A' <= ch && ch <= 'Z');
		
		System.out.println("����ڰ� �Է��� ���� �빮�� �ΰ���? : " + result);
		
	}
	
	public void method3() {
		
		// (�����Ͻðڽ��ϱ�? y �Ǵ� Y�� �Է����ּ���)
		
		Scanner sc = new Scanner(System.in);
		
		// ����ڰ� �Է��� ���� y �Ǵ� Y���� Ȯ���ϱ�
		System.out.print("�����Ͻ÷��� y�Ǵ� Y�Է����ּ��� : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = ('y' == ch || ch == 'Y');
		// ||(or) : ~�̰ų�, ~�Ǵ� 
		// �ΰ��� ���� �� �ϳ��� �����Ѵٸ� true ��� false �̸� ������� false
		
		
		
		System.out.println("����ڰ� �Է��� ���� �ҹ��� y �Ǵ� Y�ΰ���? : " + result);
		
		
		/*
		 *  && : �ΰ��� ������ ��� �����ؾ߸� true(And)
		 *  !! true && true = true !!
		 *  true && false = false
		 *  false && true = false
		 *  false & false = false
		 *
		 *  --> && ���� ����� false�̸� ���� ������ �������� ����(������ false�̱� ������)
		 *  
		 *  || : �ΰ��� ������ �ϳ��� true�̸� ������� true�̴�.
		 *  true || true = true
		 *  true || false = true
		 *  false || true = true
		 *  false || false = false
		 *  
		 *  --> || ���� ����� true�̸� ���� ������ �������� ����(������ true�̱� ������)
		 *  
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}
	
	public void method4() {
		
		boolean result  = true || false; // Dead code = ����?
		
		int num = 10;
		System.out.println("&& ���� ���� num�� :" + num);
		
		//num�� 5���� �۰� 0���� ũ����?
		boolean result1 = (5 > num && ++num > 0); // false && true -> �� �� ������ ������ �ȵ� ���̴�.
		System.out.println("result1 : " + result1);
		
		System.out.println(num); // num = 10 ++num�� ������� �ʾ���
		
		
		boolean result2 = (num < 20 || ++num > 0);
		System.out.println("||���� ���� num�� : " + num);
	}
	

	
	
	
	
	
	
	
	
	
}
