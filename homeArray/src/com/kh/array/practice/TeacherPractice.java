package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TeacherPractice {

	public void method5 ( ) {
		
		//1. 사용자에게 문자열 문자 입력받기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : "); // 예 apple 입력하면
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
			
		
		//2. 사용자가 입력한 문자열 중에 각가의 문자들을 char 배열에 담기
		
		//2_1. char[] 생성(크기는 문자열의 길이와 동일하게)
		char[] arr = new char[str.length()];
		
		//2_2. 반복문을 이용해서 옮겨 담기
		for(int i =0;i<arr.length;i++) {
	    	  
	         arr[i] = str.charAt(i);
   
	      }
		// ['a','p','p','l','e']
		// 		      동등비교
		// ch   ch  ch  ch  ch 
		
		
		
		//3. 검색할 문자가 몇개 들어있는지, 몇번 째 인덱스 있는지 파악하기
		
		int count = 0; // 일치하는 문자를 찾을 때마다 카운팅할 변수(갯수를 세어줄 변수 1씩 증가)
		System.out.print(str +"에" + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i] == ch) {// 사용자가 입력한 검색할 문자와 해당 배열의 인덱스값이 일치할 경우
	
				System.out.print(i + " ");
				count++;

			}
			
			
		}
		
		
		
		System.out.println();
		// x 개수 : x
		System.out.println(ch + "개수 : " + count);
		
		
		
	}
	
	public void method8() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			// 1. 사용자에게 3이상의 홀수에 해당하는 정수값을 입력받자(반복)
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			
			// 2. 제대로 입력했는지 안했는지 판별
			if(num >=3 && num%2 == 1) { //제대로 입력했을 경우(배열값에 담고 출력, 빠져나가기)
				
				// 사용자가 입력한 정수크기만큼 int배열 만들기
				int[] arr = new int[num];
				
				// 배열의 중간까지는 1씩 증가하는 값, 그 이후부터는 1씩 감소하는 값을 담겠다.
				int value = 1;
				for(int i = 0; i<arr.length;i++) {
					
					if(i<arr.length/2) {
						arr[i] = value++;
					}else {
						arr[i] = value--;
					}
	
				}
				// 잘 담겼는지 출력하기
				for(int i = 0; i<arr.length;i++) {
					System.out.print(arr[i]);
					if(i==arr.length-1) {
						break;
					}else {
						System.out.print(", ");
					}
				}
				// 반복문 빠져나가기
				break;
				
			}else {// 제대로 입력 안했을 경우
				System.out.println("다시 입력하세요.");
				//continue => 어차피 if문 빠져나가서 while문 실행
			}
		}
		
	}
	
	public void method11() {
		
		// 1. 크기 10짜리 int[] 배열 생성하기
		int[] arr = new int[10];
		// 2. 해당 배열의 각 인덱스에 1~10사이의 랜덤값 담기
		for(int i = 0; i<arr.length;i++) {
			
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i] + " ");
		}
		// 3. 배열 전체 출력
		
		// 4. 최대값, 최소값 판별후 출력
		Arrays.sort(arr);
		
		int max = arr[arr.length-1];
		int min = arr[0];
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
	}

	
}
