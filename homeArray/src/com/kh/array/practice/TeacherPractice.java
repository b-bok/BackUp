package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TeacherPractice {

	public void method5 ( ) {
		
		//1. ����ڿ��� ���ڿ� ���� �Է¹ޱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : "); // �� apple �Է��ϸ�
		String str = sc.nextLine();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
			
		
		//2. ����ڰ� �Է��� ���ڿ� �߿� ������ ���ڵ��� char �迭�� ���
		
		//2_1. char[] ����(ũ��� ���ڿ��� ���̿� �����ϰ�)
		char[] arr = new char[str.length()];
		
		//2_2. �ݺ����� �̿��ؼ� �Ű� ���
		for(int i =0;i<arr.length;i++) {
	    	  
	         arr[i] = str.charAt(i);
   
	      }
		// ['a','p','p','l','e']
		// 		      �����
		// ch   ch  ch  ch  ch 
		
		
		
		//3. �˻��� ���ڰ� � ����ִ���, ��� ° �ε��� �ִ��� �ľ��ϱ�
		
		int count = 0; // ��ġ�ϴ� ���ڸ� ã�� ������ ī������ ����(������ ������ ���� 1�� ����)
		System.out.print(str +"��" + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i] == ch) {// ����ڰ� �Է��� �˻��� ���ڿ� �ش� �迭�� �ε������� ��ġ�� ���
	
				System.out.print(i + " ");
				count++;

			}
			
			
		}
		
		
		
		System.out.println();
		// x ���� : x
		System.out.println(ch + "���� : " + count);
		
		
		
	}
	
	public void method8() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			// 1. ����ڿ��� 3�̻��� Ȧ���� �ش��ϴ� �������� �Է¹���(�ݺ�)
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			
			// 2. ����� �Է��ߴ��� ���ߴ��� �Ǻ�
			if(num >=3 && num%2 == 1) { //����� �Է����� ���(�迭���� ��� ���, ����������)
				
				// ����ڰ� �Է��� ����ũ�⸸ŭ int�迭 �����
				int[] arr = new int[num];
				
				// �迭�� �߰������� 1�� �����ϴ� ��, �� ���ĺ��ʹ� 1�� �����ϴ� ���� ��ڴ�.
				int value = 1;
				for(int i = 0; i<arr.length;i++) {
					
					if(i<arr.length/2) {
						arr[i] = value++;
					}else {
						arr[i] = value--;
					}
	
				}
				// �� ������ ����ϱ�
				for(int i = 0; i<arr.length;i++) {
					System.out.print(arr[i]);
					if(i==arr.length-1) {
						break;
					}else {
						System.out.print(", ");
					}
				}
				// �ݺ��� ����������
				break;
				
			}else {// ����� �Է� ������ ���
				System.out.println("�ٽ� �Է��ϼ���.");
				//continue => ������ if�� ���������� while�� ����
			}
		}
		
	}
	
	public void method11() {
		
		// 1. ũ�� 10¥�� int[] �迭 �����ϱ�
		int[] arr = new int[10];
		// 2. �ش� �迭�� �� �ε����� 1~10������ ������ ���
		for(int i = 0; i<arr.length;i++) {
			
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i] + " ");
		}
		// 3. �迭 ��ü ���
		
		// 4. �ִ밪, �ּҰ� �Ǻ��� ���
		Arrays.sort(arr);
		
		int max = arr[arr.length-1];
		int min = arr[0];
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		
		
		
	}

	
}
