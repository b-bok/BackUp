package com.kh.chap02_loop.loop;
import java.util.Scanner;
public class A_For {

	
	/*
	 *  * for��
	 *  
	 * for(�ʱ��; ���ǽ�; ������) { //�ݺ� Ƚ���� �����ϱ� ���� �����ϴ� �͵�
	 * 		.. �ݺ������� �����Ű�����ϴ� ���౸��..
	 *  
	 * }
	 * 
	 * for���� ������ ����
	 * �ʱ�� -> ���ǽ� �˻� -> true �̸� ���౸�� -> ������
	 * 		     ���ǽ� �˻� -> true �̸� ���౸�� -> ������
	 * 		     �ٽ� ���ǽ� -> true �̸� ���౸�� -> ������
	 *        -----------�� ������ ��� �ݺ� =-------
	 *         �ٽ� ���ǽ� -> false�� ���  ���౸�� ���� x 
	 *         �ݺ��� ��������
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  - �ʱ�� : �ݺ����� ����� �� "�� �ѹ��� ����Ǵ� ����"
	 *  		(�ַ� ���� ����� ���ÿ� �ʱ�ȭ ����)
	 *  
	 *  - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 *  		���ǽ��� true�� ��� �ش� ���� ������ ����
	 *  		���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ��������
	 *  		(�ַ� �ʱ�Ŀ��� ���� ������ ������ ���ǽ��� �ۼ�)
	 *  
	 *  - ������ : �ݺ����� �����ϴ� �������� ������Ű�� �κ�
	 *  		(�ʱ���� ������ ������ ������ ����������(++, --)�� ���)
	 */
	
	
	public void method1() {
		// �ȳ��ϼ��� �� 5�� �ݺ��ؼ� ���
		
		for(int i = 1; i <= 5; i++) {// i���� 1���� ���� 5�϶����� 1�� �����ϴ� ���� �ݺ� �����Ѵ�.(1,2,3,4,5) 5ȸ �ݺ�
			System.out.println("�ȳ��ϼ���");
			
			// i = 1 i <=5 true ��� i++
			// i = 2 i <=5 true ��� i++
			// i = 3 i <=5 true ��� i++
			// i = 4 i <=5 true ��� i++
			// i = 5 i <=5 true ��� i++
			// i = 6 i <=5 false ����
		}
		
		for(int i = 0; i <= 4; i++) {// i���� 0�������� 4���� 1�� �����ϴ� ���� �ݺ������Ѵ�.(0,1,2,3,4) 5ȸ �ݺ�
			System.out.println("������");
		}
		
		for(int i = 1; i < 6; i++) {// i���� 1�������� 5���� 1�� �����ϴ� ���� �ݺ����� (1,2,3,4,5) 5ȸ �ݺ�
			System.out.println("������");		
		}
		
		
		//�ʱⰪ����  �ش������� true�϶����� 1�� �����ϴ� ���� �ݺ�����
		
		for(int i = 5; i >= 1; i--) { //i���� 5���� ���� 1���� 1�� �����ϴ� ���� �ݺ�����(5,4,3,2,1) 5ȸ�ݺ�
			System.out.println("ȣȣȣ");
		}
		
		
		
		
		for(int i =1; i<=10; i++) { // 1���� 10���� 10�� �ݺ� ����
			System.out.println("�׷��׷�");
		}
		
		
		for(int i = 11; i <=20; i++) {
			System.out.println("�ƴ�!!!");
			
		}
		
		// ��Ʈ�� ����Ǵ� ������� ����غ��� �͵� ���� ����̴�.
		
		
		
		
		
	}
	
	public void method2() {
		//1���� 5���� ���
		//1
		//2
		//3
		//4
		//5
		
		for(int i =1 ; i <=5 ; i++) { // �ݺ����� ���õ� �������� �̿밡���ϴ�!
			System.out.println(i);
		}
		// 1 2 3 4 5
		for(int i = 1; i <=5 ; i++) {
			System.out.print(i);
		}
		
		for(int i = 1; i < 6; i++) { //1,2,3,4,5ȸ ����
			System.out.print(i + " "); // " "�� ���� ����
		}
		
	}
	public void method3() {
		
		for(int i = 5; i>=1; i--) { // 5, 4, 3,2,1 5ȸ �ݺ�����
			System.out.print(i + " ");
		}
		
		
		
	}
	
	public void method4() {
		// 123...10
		
		for(int i = 0; i <=9; i++) {
			
			System.out.print((i + 1) +" ");
		}
	}
	
	public void method5() {

		
	for(int i =1; i<=10; i+=2 ) {       // i +=2 �ݺ��� ��ü�� 2�� ���� 1 3 5 7 9 5�� ������
		System.out.print(i + " ");
	
		}
		
		
		
	}
	
	public void method6() {
		
		//1���� 10������ ���������� �հ�
		int sum = 0;
		
		for(int i = 1; i<=20; i++) {
			
			sum += i;
			
			System.out.printf("%d + %d = %d\n",i,i,sum );
			
		}
		
		
		
		
		
	}
	
	public void method7() {
		// 1���� ���� ����ڰ� �Է��� �������� �� �հ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���  : ");
		int num = sc.nextInt();
		
		int sum = 0;
		//����ڰ� �Է��� �������� ������� �ƴ���(��ȿ�� �˻�)
		
		if(num>0) {
			for(int i = 1; i <= num; i++) { // 1�������� num���� 1�� �����ϴ� ���� �ݺ�(numȸ �ݺ�)
				
				sum += i;

			}
			
			System.out.println("1��������" +num + "������ �� �հ� : " + sum);
			
		}else {
			System.out.println("����� �Է����ּ���.");
		}
		
		

	}
	
	public void method8() {
		
		// 1�������� � ���� ��(1~10������ ������)�� �հ� ���ϱ�
		
		// MathŬ�������� �����ϴ� random() �޼ҵ� ȣ��� ������ �߻�
		// java.lang.Math �� �ִ� �޼ҵ� ȣ��� ���� �� �ʿ� ���� -> Ŭ������.�޼ҵ�();
		// 0.0~0.99999999999 ������ �������� �߻�!
		//0.0 <= �����Ǽ��� < 1.0
															
		//int random = Math.random(); //double ���� int���� ������ �׷��� �߻��� ����
		// 					0.0 ~1.0 ������ ������ 
		
		//int random = Math.random() * 10;
		//					0 ~10.0 ������ ������
		
		//int random = Math.random() * 10 + 1;
		//					1 ~ 11.0 ������ ������
				
		int random = (int)(Math.random() * 10 +1);
		//				1 <= <11		1~ 10 ���ϴ� ���� ����, 1�� ���ۼ�
		// +2 �̸� 2�������� 10�� �� 2~11
		System.out.println(random);
				
		int sum = 0;
		for(int i = 1; i <= random; i++) { //1�������� randomȸ������ �ݺ�			
			sum += i;
		}
		
		System.out.println("1��������" +random + "������ ���Ѱ� : " + sum);
		
	}
	
	public void method9() {
		
		// ����ڿ��� ���ڿ� �Է¹��� �� 
		// �� �ε����� ���ڸ� ���� �� ���
		
		// ���� ��� apple �Է��ϸ� => str�� �Է�
		// a				=> ��¹�(str.charAt(0);
		// p				=> ��¹�(str.charAt(1);
		// p				=> ��¹�(str.charAt(2);
		// l				=> ��¹�(str.charAt(3);
		// e				=> ��¹�(str.charAt(4);
		
		// ���� 5			4			10
		//	apple		kiwi	strawberry
		//	01234		0123	0123456789
		// ������ �ε�����  == (�׻� ���ڿ� ���� -1)!
		// �����ϰ��� �ϴ� �ε��� ���� 0~�������ε���(���ڿ��� ���� -1)���� 1�� ������!
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		String str = sc.nextLine();
		
		System.out.println("���ڿ��� ���� : " + str.length());
		
		for(int i = 0; i < str.length(); i++) { // 0�������� str.length() -1�� �����ϴ� ���� �ݺ�(Ƚ���� ���ڿ��� ���� ��ŭ)
												// <= str.length() -1 ==  < str.length()
			
			System.out.println(str.charAt(i));
			
		}
		

		
	}
	
	public void method10() {
		// ������ ����ϱ�
		// 2�� ����ϱ�
		
		// 2 *1 2*2 ... 2*9
		
		for(int i = 1;i<10;i++){
			
			int multi = 2;
			
			multi *= i;
			
			System.out.println("2 x " + i + "=" + multi);
			
		}
		

	}
	public void method11() {
		// ����ڰ� �Է��� ���� ����ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������(2~9)�� �Է����ּ��� : ");
		int dan = sc.nextInt();
		
		*/
		
		// 2�������� 9������ ������ �� ���
		
		int dan = (int) (Math.random()*8 +2);
		
		
		if(2 <= dan && dan <= 9 ) {
			for(int i = 1; i<10; i++) {
				
				//int result = 0;
				
				//result = (dan*i);
				
				//System.out.println(dan + "X" + i + "=" + result);
				
				System.out.println(dan + " x " + i + " = " + dan * i);
				
			}
		}else {
			System.out.println("�� ���� �ٽ� �Է����ּ���");
		}
		
		
		
		
	}
	
	public void method12() {
		
		// ����ڿ��� �ΰ��� �������� �Է¹޾Ƽ�
		// �ΰ��� ������ �� ���� �� ���� ū �������� ���� ���
		// �� �հ� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		// ���� ��� Math.min Math.max
		int min = Math.min(num1, num2); // �� �� �� ���� ���� ������ ����
		int max = Math.max(num1, num2); // �� �� �� ū ���� ������ ����
		
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			
			sum += i;
			
			
		}
	
		System.out.println(min + "���� " + max + "������ �� : " + sum);
		
	}
	
	
	/*
	 * ��ø for��
	 * 
	 * for(�ʱ��;���ǽ�;������) {
	 * 
	 * 	������ ����1;
	 * 
	 * 	for(�ʱ��2; ���ǽ�2; ������2) {
	 * 
	 * 
	 * }
	 * 	������ ����3;
	 * 		
	 * }
	 * 
	 */
	
	
	
	
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// ù��° ������ ������ �� 1 2 3 4 5
		// �ι�° ������ ������ �� 1 2 3 4 5
		// ����° ������ ������ �� 1 2 3 4 5
		// �ٱ��� for������ ���� ����
		// 
		
		for(int i =1; i<=3; i++) { // ������ �����ϸ� ����
			
			for(int j =1; j<=5; j++) {  // ������ �����ϸ� ����.
			
			System.out.print(j + " ");
			
		}
		
			System.out.println();
		}	
		
		
		/* i = 1
		 * �ʱ������ i =1 1�� 3���� �۾Ƽ� �߰�ȣ ������ ��
		 * �׸��� �� for���� ���� j = 1 1�� 5���� �۾Ƽ� 1 ��� j++
		 * �׸��� �� j=2 2��� j++
		 * ... j= 5 5��� j++
		 * j = 6 false�� �� ���� for���� �������ͼ� 
		 * ���� �� ����
		 * 
		 * i =2 true �ٽ� ���� for�� ����
		 * �ʱ������ i =1 1�� 3���� �۾Ƽ� �߰�ȣ ������ ��
		 * �׸��� �� for���� ���� j = 1 1�� 5���� �۾Ƽ� 1 ��� j++
		 * �׸��� �� j=2 2��� j++
		 * ... j= 5 5��� j++
		 * j = 6 false�� �� ���� for���� �������ͼ� 
		 * ���� �� ����
		 * 
		 * i =3 true �ٽ� ���� for�� ����
		 * �ʱ������ i =1 1�� 3���� �۾Ƽ� �߰�ȣ ������ ��
		 * �׸��� �� for���� ���� j = 1 1�� 5���� �۾Ƽ� 1 ��� j++
		 * �׸��� �� j=2 2��� j++
		 * ... j= 5 5��� j++
		 * j = 6 false�� �� ���� for���� �������ͼ� 
		 * ���� �� ����
		 * 
		 * i =4 ���Ǹ� ��! 
		 * 
		 */
		
		
		
	}
	
	public void method14() {
		// 0�� 0�� ~ 23�� 59��
		
		
		// 0��0�� ���
		// 0�� 1�� ���
		// ....
		// 0�� 59�� ���
		
		// 1�� 0�� ���
		// 1�� 59�� ���
		
		
		for(int hour =0; hour<=23; hour++) {
		
			
			System.out.println("=" + hour + "��=");
			
			for(int min = 0; min<=59; min++) {
				
				System.out.println(hour + "��" + min + "��");
				
			}
			System.out.println();
				
			
		}
		
		
		
		
		
	}
	
	public void method15() {
		//2�ܺ��� 9�ܱ��� ��� ���
		
		// == 2�� == 
		// 2 x 1 = 2
		//.... 2x9 = 18
		
		
		// ��(��) 2~9���� 1�� ���� -> �ٱ�
		// ��(��) �Ŵ� ���� 1~9���� 1�� ���� -> ����
		
		
		for(int i=1; i<=9 ; i++) {
			
			if(i%3 ==0) {
				System.out.println("=== " + i + "�� ===");
				
				for(int j=1; j<=9; j++) {
					
					int result = 0;
					
					result = i*j;
					
					//System.out.println(i + " x " + j + "=" + result);
					System.out.printf("%d x %d = %d\n", i, j, result);
				}
				 
					System.out.println();
			}
			
			
			
		}
		

	}
	
	public void method16() {
		
		//*****
		//*****
		//*****
		
		// ���� 1~3���� �ݺ�(3ȸ) => �ٱ��� for��
		// ���� �� �ึ�� 1~5���� �ݺ�(5ȸ) => ���� for��
		
		
		for(int i=1;i<=3;i++) {
			
			for(int j = 1; j<=5; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
	
	}
	
	public void method17() {
		//1*** i =1  j=1
		//*2** i =2 j = 2
		//**3* i =3 j = 3
		//***4 i =4 j = 4
		
		
		
		
		
		for(int i = 1; i<=4; i++) {
			
			for(int j = 1; j<=4; j++) {
				
				if(i == j) { // i == j�� ��ġ�� ��� ���ڷ� ���
					
					System.out.print(i);
				}else { //  i != j �ϰ��� ���� ���
					
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
