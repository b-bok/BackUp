package com.kh.chap02_loop.loop;

public class C_Dowhile {

	
	/*
	 *  * do-while��
	 *  
	 *  
	 *  
	 *  �ʱ��;
	 *  
	 *  do {
	 *  		�ݺ������� ������ �ڵ�(� ���� ���� �ѹ��� ����)
	 *  		������;
	 *  
	 *  }while(���ǽ�);
	 * 
	 * �ʱ�� -> ������ ���� -> ������ -> ���ǽ� true�� ���� -> ������
	 * 							
	 * 
	 * 
	 * 
	 */
	
	public void method1 () {
		
		int num = 1;
		
		
		do {
			System.out.println(num);
			
			
		}while(num==0);
		
		
		
		
	}
	public void method2 () {
		// 1 2 3 4 5
		
		int num = 1;
		
		do {
			System.out.print(num++ + " "); // ���������� ������ָ� ����� ������ ���߿��� �����ش�. �� ������ �ڵ�
			
			
		}while(num<=5);
		
		
	}
	
	public void method3 () {
		// 1���� ������(11~ 20)������ �հ�
		
		int i = 1;
		
		int random = (int) (Math.random()*10 +11);
		int sum = 0;
		
		do {
			
			sum += i++;
		
		}while(i<=random);
		
		System.out.printf("1���� %d������ �հ� : %d ",random,sum);
		System.out.println();
	
		
	}
	
	
	
}
