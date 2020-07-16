package com.kh.chap03_branch.branch;

public class B_Continue {

	/*
	 * 
	 *  continue : continue;�� ������ �Ǹ� �� �ڿ� ������ �������� �ʰ�
	 *  			���� ����� �ݺ��� ���� �ö󰡶�� �ǹ�
	 * 
	 */
	
	public void method1() {
		
		// 1���� 10������ Ȧ�� ���
		// 1 3 5 7 9 
		
		
		for(int i = 1; i<=10; i++) {	
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		
		for(int i=1;i<=10;i++) {
			
			if(i%2 == 0) {// ¦�� �ϰ�� => ���� ���� �������� �ʰ�, �ٽ� �ݺ��� ���� �ö󰡶�!
				
				continue;
			}
			
			System.out.print(i + " ");
			
		}
		
	}
	public void method2 () {
		// 1���� 100���� �������� �հ� ���ϱ�
		// ��, 6�� ������� ���� ���� �����϶�
		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			
			if(i%6 == 0) { // 6�� ����� ��� ���� ������ �������� �ʰ�, �ٽ� �ݺ��� ���� �ö�!
				
				continue;
			}
			
			
			sum += i;
			

		}
		
		System.out.println("1���� 100���� ����(6�ǹ�� ����) : "  + sum);
		
	}
	public void method3 () {
		// 2~9�� ������ ������ ���
		// �� 4�� ������� ���� ����ϼ���(4��, 8�� ����)
		
		int result = 0;
		
		for(int i =2; i<=9; i++) {
			
			
		
			if(i%4 == 0) { // 4�� ����� ���
				
				continue; //continue������ ���� �ڿ� ������ ���� ���ϰ� ���� �ö�!
				
			}
			
			System.out.println("==" + i + "�� ==");
			
			for(int j = 1; j<=9; j++) {
				
				if(j % 2 == 0) {
					
					continue; // 2�� ��� ���ϱ⵵ ���� ��������!
				}
				
				result = i*j;
				System.out.printf("%d x %d = %d\n",i,j,result);
	
			}
			
			
			
			
			
		}
		
		
		
		
		
	}
}
