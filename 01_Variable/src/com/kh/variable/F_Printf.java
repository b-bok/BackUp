package com.kh.variable;

public class F_Printf {

	public void printfMethod() {
		
		
		// println(��°�); --> ����� ����
		// print(��°�); --> ���
		
		// System.out.prinf("����ϰ� ���� ����(fomat)", ����ϰ��� �ϴ� ��, ��, ��);
		// ����ϰ��� �ϴ� ������ ���� ������ ���˿� ���缭 ��¸� ���� --> ���� ���� ������! \n ���
		/*
		 * %d : �������� �� �ڸ�
		 * %f : �Ǽ����� �� �ڸ�
		 * %c : ���ڰ��� �� �ڸ�
		 * %s : ���ڿ��� �� �ڸ�(���ڵ� ����)
		 * 
		 */
		
		
		int iNum1 = 10;
		int iNum2 = 20;
		int sum = iNum1 + iNum2;
		
		System.out.printf("%d\n",iNum1,iNum2); //���� ���� ���õ�
		//System.out.printf("%d"); //���� �߻� --> ���˿� �� ���� ��� ����
		
		// 10 + 20 = 30
		
		
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, sum);
		// iNum : 10
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		
		System.out.printf("%-5d\n",iNum1); //5 : 5ĭ ���� Ȯ���� / ��� : ������ ���� �ϰ���!
		
		double dNum1 = 1.2345458;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n",dNum1,dNum2); //%f�� �⺻ ������ �Ҽ��� 6��°¥������ ǥ�����ش�
												  // ���� �Ѿ�� �ݿø�, ���ڶ�� 0���� ä����!	
		
		// 162.3
		//173.546
		System.out.printf("%.1f\t %.1f\n", dNum1, dNum2); // �Ҽ��� �Ʒ� ù��°������ .1, �ι�° .2,,, \t�� �鿩����
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n",ch,str);
		System.out.printf("%C %S\n",ch,str);
		
		
		
	}
	
	
}
