package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {

	
	public void method1() {
		
		int[] arr = new int[5];
		
		// 0��~�������ε��� ������(1~10) ���
		
		for(int i =0; i<arr.length;i++) {
			arr[i] =(int) (Math.random()*10 +1); // ���ο� ������ �켱 i��° �ε����� ���
			
			// �񱳴�� for ��(������ ����ִ� �����̶� ������ ��)
			for(int j =0; j<i; j++) {
			
				if(arr[j] == arr[i]) { // ������ �ߺ� �� ���� ���� �� ��� �ٽ��ѹ� 
					System.out.println("�ߺ��߻�!!");
					i--; // �ߺ��� �߻��� �Ǵ� ���� ������ i���� �ٽ� �������� ���� �� �ְԲ�(�ٽ� �ѹ���!)
					break;
				}
			}
		
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i =0; i<arr.length;i++) {
			
			System.out.print(i + "��° ���� �� �Է� : ");
			arr[i] = sc.nextInt();
			
			for(int j = 0; j<i; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("�ߺ����Դϴ�. �ٽ� �Է����ּ���");
					i--;
					break;
				}
				
			}
			
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
}
