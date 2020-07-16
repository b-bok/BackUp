package com.kh.array;

import java.util.Arrays;

// �迭 ����
public class C_ArraySort {

	public void method1() {
		
		// ������ ������ �� ����
		int num1 = 20;
		int num2 = 10;
				
		System.out.println("== ���� �� ==");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// ������ ���� ������ �ӽ� ���� ���� �� �ϳ��� ���� ����ص�
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
				
		System.out.println("== ���� �� ==");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);		
		
		
	}
	
	public void method2() {
		
		int[] arr = {2,1,3}; //�������� : �տ� ���õ� ���� �ڿ� ���õ� ������ Ŭ ��� ����
		
		//arr[0] <--> arr[1]
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	public void method3() {
		// �� ��ü(��ġ�� ��)�� �����ϰ�, �� ���(�� ��ü���� ��)�� ������ ���鼭 ������.
		int[] arr = {2,5,4,1,3};
		
		/*	������(��)		�Ķ���(��)
		 * �� ��ü(i) �� ���(j)
		 * 	i = 0�϶�		j= x
		 *  i = 1�϶� 	j = 0;
		 *  i = 2�϶� 	j = 01;
		 *  i = 3�϶� 	j = 012;
		 *  i = 4�϶� 	j = 0123;
		 *  i = 5�϶� 	j = 01234;
		 * 
		 *  i = 0~������ �ε��� j = 0~i-1;
		 * 	�ٱ� for			���� for
		 */

		// �������� ���� : �տ��� �ڿ������� Ŭ��� => ����!!
		
		// 1. �� ��ü�� �����ϴ� for��
		for(int i = 0; i<arr.length;i++) {
			// 2. �� ����� �����ϴ� for��
			for(int j = 0; j<i;j++) {
				
				if(arr[j]<arr[i]) {
					
					System.out.println("����!!");
					
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}	
		}	
		System.out.println(Arrays.toString(arr));
	}
	
	public void method4() {
		int[] arr = {2,5,4,1,3};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	
	
	
	
}
