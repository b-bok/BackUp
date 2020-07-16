package com.kh.dimention;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {

	// 이차원 배열 : 일차원배열 여러개를 하나로 묶은 것이 2차원 배열
	
	public void method1() {
		
		// *****
		// *****
		// *****
		
		// 행 3번 반복		  => 바깥쪽 for문
		// 각 행별로 열 5번씩 반복 => 안쪽 for문
		
		for(int i=0;i<3;i++) { // 0에서 2까지 1씩 증가하는 동안 반복 3번!
			for(int j = 0; j<5;j++) { // 0에서 4까지 1씩 증가하는 동안 반복 5번!			
				System.out.print("*");			
			}
			System.out.println();
		}
		
		
		/*
		 * 1. 이차원 배열 선언
		 *		자료형 배열명[][];
		 *		자료형[] 배열명[];
		 *		자료형[][] 배열명; **선호**
		 */
		int arr1[][];
		int[] arr2[];
		//int[][] arr;
		
		/*
		 * 2. 이차원 배열 할당(크기 지정)
		 * 
		 * 배열명 = new 자료형[행크기][열크기]; // 행크기는 지정 반드시 but 열크기는 그렇지 않다.
		 * 
		 */
		
		// arr = new int[3][5];
		
		// 이차원 배열 선언과 동시에 크기지정
		int[][] arr = new int[3][5];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
		System.out.println(arr[0][0]);
		
		// 행의 길이
		System.out.println("행의 길이 : " + arr.length);
		// 열의 길이
		System.out.println("0행의 열의 길이 : " + arr[0].length);
		System.out.println("1행의 열의 길이 : " + arr[1].length);
		System.out.println("2행의 열의 길이 : " + arr[2].length);
		
		//행 : 바깥쪽 for(0~2) (0~행의길이-1)
		//열 : 안쪽 for(0~4)	(0~각행별열의길이 -1)
		
		// 행의 인덱스를 지정하는 바깥쪽 for문(i)
		for(int i =0;i<arr.length;i++) {
			
			// 열의 인덱스를 지정하는 안쪽 for문(j)
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
		//행의 인덱스를 지정하는 바깥쪽 for문
		for(int i=0; i<arr.length;i++) {
			// 열의 인덱스를 지정하는 안쪽 for문
			for(int j =0; j<arr[i].length;j++) {
				
				arr[i][j] += value++;
				
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ",arr[i][j]); //양수 2는 두칸 공간 확보 오른쪽 / 정렬 음수 2는 두칸 공간 확보 왼쪽 정렬
			}
			
			System.out.println();
		}
		
		
	}
	
	public void method3() {
		
		//int[] arr = {1,2,3,4,5};
		
		// 이차원 배열 할당과 동시에 값 대입
		int[][] arr = {{1, 2, 3, 4, 5},
					   {6, 7, 8, 9, 10},
					   {11, 12, 13, 14, 15}};
		
		// 행의 인덱스 지정 for문
		for(int i = 0; i<arr.length;i++) {
			// 열의 인덱스 지정 for문
			for(int j = 0; j<arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		
		// 가변 배열
		// 행은 정해졌으나 각 행별 열의 갯수가 정해지지 않은 상태
		
		int[][] arr = new int[3][]; //가변 배열 할당
		
		// 0행은 2열
		arr[0] = new int[2];
		// 1행은 1열
		arr[1] = new int[1];
		// 2행은 3열
		arr[2] = new int[3];
		
		// 1 2
		// 3
		// 4 5 6
		
		int value = 1;
		// 행의 인덱스를 지정하는 바깥쪽 for(0~2)
		for(int i=0; i<arr.length;i++) {
			// 열의 인덱스를 지정하는 안쪽 for(0~1|0|2)
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
		// 가변 배열의 할당과 동시에 값 대입
		
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
					System.out.print("국어 점수를 입력하세요 : ");
			
				}else {
					System.out.print("영어 점수를 입력하세요 : ");
					
				}
				
				arr[i][j] = sc.nextDouble(); // 사용자 입력 값이 바로 아래 있을 필요가 없다.
				
				arr[i][3] += arr[i][j];

			}
		}
		
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.printf("%.2f ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("국어점수 평균 : " + arr[0][3] / 3);
		System.out.println("영어점수 평균 : " + arr[1][3] / 3);
		
	}
	
	public void method7() {
		// 3행 3열 int이차원 배열 생성 한후
		// 각 공간에 1~10사이의 랜덤값 발생 후 기록
		
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
		// 3행 3열에 1~10사이에 랜던값 담기(단, 중복값 없이)
		
		// 크기 9짜리 1차원 배열을 만든 후 중복값 없이 담은 후
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
		
		// 이차원 배열에 옮겨담기
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
		
		// 5행 5열 짜리 빙고판 만들기
		// 5행 5열짜리에 1~25사이의 랜덤값 중복값 없이 담아내기
		
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
			// 빙고판 완성
		}	
			System.out.println("\n========== 빙고게임 시작=============");
			int count = 0;
			
	while(true) {
		
		
		System.out.print("\n정수 입력 : ");
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
		
		System.out.print("게임을 끝내시겠습니까?(y/n): ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'Y' || ch == 'y') {
			break;
		}
		
	
		
	}
	
	System.out.println(count + "번 입력했습니다.");
	
	}
}
