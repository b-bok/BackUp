package com.kh.dimention;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {

	// ������ �迭 : �������迭 �������� �ϳ��� ���� ���� 2���� �迭
	
	public void method1() {
		
		// *****
		// *****
		// *****
		
		// �� 3�� �ݺ�		  => �ٱ��� for��
		// �� �ະ�� �� 5���� �ݺ� => ���� for��
		
		for(int i=0;i<3;i++) { // 0���� 2���� 1�� �����ϴ� ���� �ݺ� 3��!
			for(int j = 0; j<5;j++) { // 0���� 4���� 1�� �����ϴ� ���� �ݺ� 5��!			
				System.out.print("*");			
			}
			System.out.println();
		}
		
		
		/*
		 * 1. ������ �迭 ����
		 *		�ڷ��� �迭��[][];
		 *		�ڷ���[] �迭��[];
		 *		�ڷ���[][] �迭��; **��ȣ**
		 */
		int arr1[][];
		int[] arr2[];
		//int[][] arr;
		
		/*
		 * 2. ������ �迭 �Ҵ�(ũ�� ����)
		 * 
		 * �迭�� = new �ڷ���[��ũ��][��ũ��]; // ��ũ��� ���� �ݵ�� but ��ũ��� �׷��� �ʴ�.
		 * 
		 */
		
		// arr = new int[3][5];
		
		// ������ �迭 ����� ���ÿ� ũ������
		int[][] arr = new int[3][5];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
		System.out.println(arr[0][0]);
		
		// ���� ����
		System.out.println("���� ���� : " + arr.length);
		// ���� ����
		System.out.println("0���� ���� ���� : " + arr[0].length);
		System.out.println("1���� ���� ���� : " + arr[1].length);
		System.out.println("2���� ���� ���� : " + arr[2].length);
		
		//�� : �ٱ��� for(0~2) (0~���Ǳ���-1)
		//�� : ���� for(0~4)	(0~���ະ���Ǳ��� -1)
		
		// ���� �ε����� �����ϴ� �ٱ��� for��(i)
		for(int i =0;i<arr.length;i++) {
			
			// ���� �ε����� �����ϴ� ���� for��(j)
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
	
	public void method2() {
		
		int[][] arr = new int[3][5];
		
		// 1 2 3 4 5 
		// 6 7 8 9 10
		// 11 12 13 14 15
		int value = 1;
		//���� �ε����� �����ϴ� �ٱ��� for��
		for(int i=0; i<arr.length;i++) {
			// ���� �ε����� �����ϴ� ���� for��
			for(int j =0; j<arr[i].length;j++) {
				
				arr[i][j] += value++;
				
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ",arr[i][j]); //��� 2�� ��ĭ ���� Ȯ�� ������ / ���� ���� 2�� ��ĭ ���� Ȯ�� ���� ����
			}
			
			System.out.println();
		}
		
		
	}
	
	public void method3() {
		
		//int[] arr = {1,2,3,4,5};
		
		// ������ �迭 �Ҵ�� ���ÿ� �� ����
		int[][] arr = {{1, 2, 3, 4, 5},
					   {6, 7, 8, 9, 10},
					   {11, 12, 13, 14, 15}};
		
		// ���� �ε��� ���� for��
		for(int i = 0; i<arr.length;i++) {
			// ���� �ε��� ���� for��
			for(int j = 0; j<arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		
		// ���� �迭
		// ���� ���������� �� �ະ ���� ������ �������� ���� ����
		
		int[][] arr = new int[3][]; //���� �迭 �Ҵ�
		
		// 0���� 2��
		arr[0] = new int[2];
		// 1���� 1��
		arr[1] = new int[1];
		// 2���� 3��
		arr[2] = new int[3];
		
		// 1 2
		// 3
		// 4 5 6
		
		int value = 1;
		// ���� �ε����� �����ϴ� �ٱ��� for(0~2)
		for(int i=0; i<arr.length;i++) {
			// ���� �ε����� �����ϴ� ���� for(0~1|0|2)
			for(int j = 0; j<arr[i].length;j++) {
				
				arr[i][j] = value++;	
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length; j++) {
				
				System.out.printf("%2d ",arr[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
	
	public void method5() {
		// ���� �迭�� �Ҵ�� ���ÿ� �� ����
		
		int[][] arr = {{1,2},{3},{4,5,6}};
		
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = 0; j<arr[i].length;j++) {
				
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	
	public void method6() {
		//
		
		
		Scanner sc = new Scanner(System.in);
		
		double [][] arr = new double[2][4];
		

		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0;j<arr[i].length-1;j++) {
				
				if(i == 0) {
					System.out.print("���� ������ �Է��ϼ��� : ");
			
				}else {
					System.out.print("���� ������ �Է��ϼ��� : ");
					
				}
				
				arr[i][j] = sc.nextDouble(); // ����� �Է� ���� �ٷ� �Ʒ� ���� �ʿ䰡 ����.
				
				arr[i][3] += arr[i][j];

			}
		}
		
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.printf("%.2f ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("�������� ��� : " + arr[0][3] / 3);
		System.out.println("�������� ��� : " + arr[1][3] / 3);
		
	}
	
	public void method7() {
		// 3�� 3�� int������ �迭 ���� ����
		// �� ������ 1~10������ ������ �߻� �� ���
		
		int[][] arr =new int[3][3];
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				
				arr[i][j] = (int)(Math.random()*10 +1);
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method8() {
		// 3�� 3���� 1~10���̿� ������ ���(��, �ߺ��� ����)
		
		// ũ�� 9¥�� 1���� �迭�� ���� �� �ߺ��� ���� ���� ��
		int[] temp = new int[9];
		
		
		
		for(int i = 0; i<temp.length;i++) {
			
			temp[i] = (int)(Math.random()*10 +1);
			
			for(int j = 0;j<i;j++) {
				
				if(temp[i] == temp[j]) {
					i--;
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(temp));
		
		// ������ �迭�� �Űܴ��
		int[][] arr = new int[3][3];
		int index = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				
				arr[i][j] = temp[index++];
				
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
	
	public void bingo() {
		
		Scanner sc = new Scanner(System.in);
		
		// 5�� 5�� ¥�� ������ �����
		// 5�� 5��¥���� 1~25������ ������ �ߺ��� ���� ��Ƴ���
		
		int[] temp = new int[25];
		
		for(int i = 0; i<temp.length; i++) {
			temp[i] = (int)(Math.random()*25 +1);
			
			for(int j = 0; j<i;j++) {
				
				
				if(temp[i] == temp [j]) {
					i--;
					break;
		
				}

			}
			
			
		}
		
		
		
		int[][] bingo = new int[5][5];
		int index = 0;
		
		for(int i =0; i<bingo.length;i++) {
			for(int j = 0; j<bingo[i].length;j++) {
				
				bingo[i][j] = temp[index++];
				
				System.out.printf("%4d ",bingo[i][j]);
				
			}
			System.out.println();
			// ������ �ϼ�
		}	
			System.out.println("\n========== ������� ����=============");
			int count = 0;
			
	while(true) {
		
		
		System.out.print("\n���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		count++;
		
		for(int i =0; i<5;i++) {
			for(int j =0; j<5;j++) {
				
				if(bingo[i][j] == num) {
					bingo[i][j] = 0;
					
				}
				
				System.out.printf("%4d", bingo[i][j]);
				
			}
			System.out.println();
		}
		
		System.out.print("������ �����ðڽ��ϱ�?(y/n): ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'Y' || ch == 'y') {
			break;
		}
		
	
		
	}
	
	System.out.println(count + "�� �Է��߽��ϴ�.");
	
	}
}
