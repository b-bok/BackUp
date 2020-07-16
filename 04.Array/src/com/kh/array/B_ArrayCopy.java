package com.kh.array;
import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {

	/*
	 * * 배열의 복사
	 * - 얕은 복사 : 배열의 주소만을 복사
	 * - 깊은 복사 : 배열의 새로이 생성하고 실제 내부 값들을 복사
	 * 
	 */
	
	public void method1 () {
		
		int[] origin = {1,2,3,4,5};
		
		System.out.println("== 원본 배열 ==");
		
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i] + " ");
			
		}
		//복사본 배열
		int [] copy = origin;
		
		System.out.println("\n== 복사본 배열  ==");
		
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n == 복사본 배열 수정 후  ==");
		
		System.out.println("== 원본 배열 ==");
		
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i] + " ");
			
		}
		
		System.out.println("\n== 복사본 배열  ==");
		for(int i = 0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin주소값 : " + origin.hashCode());
		System.out.println("coopy 주소값 : " + copy.hashCode());
		
		// 주소값만을 복사(얕은 복사)했을 때 같은 배열을 참조 하고 있음
		
		
	}
	
	public void method2() {
		// 깊은 복사
		
		//1. for문 방법
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[origin.length];
		
		for(int i=0; i<origin.length;i++) {
			
			origin[i] = copy[i];
			
			
		}
		for(int i =0; i<origin.length;i++) {
			
			System.out.print(origin[i] + " ");
			
		}
		
		System.out.println();
		
		for(int i =0; i<copy.length;i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		
		copy[2] = 99;
		
		System.out.println("\n --- 복사본 변경후 ---");
		
		for(int i =0; i<origin.length;i++) {
			
			System.out.print(origin[i] + " ");
			
		}
		
		System.out.println();
		
		for(int i =0; i<copy.length;i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		
		
		System.out.println("\norigin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		}
		
	public void method3() {
		// 2. 새로운 배열 생성하고 System클래스에서의 arraycopy 메소드 이용한 복사
		
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[10]; // 넉넉하게 생성
		
		
		// System.arraycopy(원본배열명 , 복사를 시작할인덱스 ,복사본배열명 , 복사본배열의 복사가 시작 될 시작 인덱스 ,복사할갯수 );
		System.arraycopy(origin, 2, copy, 0, 3);
		//ArrayIndexOutOfBoundsException = 부적절하게 제시할 경우 (범위 아웃)
		for(int i = 0; i<copy.length;i++) {
			
			System.out.print(copy[i] + " ");
		
		}
		System.out.println("\norigin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		// 주소값이 다르다 -> 배열 수정시 서로 영향을 받지 않는다!
		// 복사본 가지고 여러가지 테스트 가능하다!
	}
	
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf 메소드 사용
		
		int[] origin = {1,2,3,4,5};
		
		//복사본 배열 = Arrays.copyOf(원본배열명, 복사할 갯수); => copy배열의 크기 == 복사할 갯수(원본배열보다 크게 해도 문제 없음)
		
		
		
		// Arrays클래스에서의 copyOf 메소드 와 System클래스의 arraycopy의 차이점
		// 복사할 시작 인덱스, 복사될 시작 인덱스 제시 불가!
		
		//int[] copy = Arrays.copyOf(origin, origin.length);
		
		//int[] copy = Arrays.copyOf(origin, 3);
		
		int[] copy = Arrays.copyOf(origin, 8);
		
		for(int i =0; i<copy.length; i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("\norigin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
	
	public void method5() {
		// 4. clone() 메소드 이용한 복사(시작 인덱스, 복사할 갯수 일체 제시 불가)
		
		int[] origin = {1,2,3,4,5};
		
		int[] copy = origin.clone();
		
		/*
		for(int i =0; i<copy.length; i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		*/
		// toString 메소드는 반복문 없이 모든 인덱스 바로 출력가능
		System.out.println(Arrays.toString(copy));
		

		System.out.println("\norigin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
		
		
		
}
	

