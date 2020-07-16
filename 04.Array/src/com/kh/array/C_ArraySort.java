package com.kh.array;

import java.util.Arrays;

// 배열 정렬
public class C_ArraySort {

	public void method1() {
		
		// 변수를 가지고 값 변경
		int num1 = 20;
		int num2 = 10;
				
		System.out.println("== 변경 전 ==");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 기존의 값을 보관할 임시 변수 만든 후 하나의 값을 기록해둠
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
				
		System.out.println("== 변경 후 ==");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);		
		
		
	}
	
	public void method2() {
		
		int[] arr = {2,1,3}; //오름차순 : 앞에 제시된 값이 뒤에 제시된 값보다 클 경우 변경
		
		//arr[0] <--> arr[1]
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	public void method3() {
		// 비교 주체(위치는 뒤)를 설정하고, 비교 대상(비교 주체보다 앞)을 움직여 가면서 비교하자.
		int[] arr = {2,5,4,1,3};
		
		/*	빨간색(뒤)		파란색(앞)
		 * 비교 주체(i) 비교 대상(j)
		 * 	i = 0일때		j= x
		 *  i = 1일때 	j = 0;
		 *  i = 2일때 	j = 01;
		 *  i = 3일때 	j = 012;
		 *  i = 4일때 	j = 0123;
		 *  i = 5일때 	j = 01234;
		 * 
		 *  i = 0~마지막 인덱스 j = 0~i-1;
		 * 	바깥 for			안쪽 for
		 */

		// 오름차순 정렬 : 앞에꺼 뒤에꺼보다 클경우 => 변경!!
		
		// 1. 비교 주체를 선정하는 for문
		for(int i = 0; i<arr.length;i++) {
			// 2. 비교 대상을 선정하는 for문
			for(int j = 0; j<i;j++) {
				
				if(arr[j]<arr[i]) {
					
					System.out.println("변경!!");
					
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
