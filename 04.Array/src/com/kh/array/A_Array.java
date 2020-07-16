package com.kh.array;
import java.util.Scanner;
public class A_Array {

	/*
	 *  배열 : 여러개의 값을 보관할 수 있는 공간(단, 같은 자료형에 해당하는 값들만을 보관)
	 *  	  같은 자료형의 변수를 하나의 묶음으로 다루는 것	  
	 * 		  각 인덱스의 자리에 값을 기록(인덱스는 항상 0부터 시작)
	 * 
	 */
	
	public void method1() {
		// * 배열을 왜 쓰는지(배열 안쓰는 경우 어떤 번거로움이 있는지..)
		
		// - 다량의 데이터를 기록해두고자 할 때 일일히 변수 만들고 담아서 관리하면 되지만....
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// - 저 num값을 출력하고자 할 때 일일히 출력해야한다...(반복문 사용불가)
		/*System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		int sum = num1 + num2 + num3 + num4 +num5;
	
		// * 배열 사용법
		/*
		 *  1. 배열 선언
		 *	 	자료형 배열명[];
		 *		자료형[] 배열명;	*추천*		
		 */
		
		//int arr[];

		/*
		 * 2. 배열 할당(배열의 크기 지정!!)
		 * 		배열명 = new int[배열의 크기]; 
		 */
		int[] arr = new int[5]; // 배열의 크기 5로 지정되는 순간(5개의 방이 생김.. 0번방~4번방)
		
		/*
		 * 3. 값 대입(초기화)
		 * 		배열명[인덱스] = 값;
		 * 
		 * 
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 마지막 인덱스 == 배열의 크기 -1
		for(int i = 0;i < arr.length;i++) {
			arr[i] = i;
		}
		
		
		
		// 배열의 장점 = 배열 사용시 일정한 규칙이 있으면 반복문 사용이 편리
		for(int i =0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		int sum2 = 0;
		
		for(int i =0; i<arr.length; i++) {
			
			sum2 += arr[i];
			
		}
		
		System.out.println("총합계의 값 : " + sum2);
		
		
	}
	
	public void method2() {
		
		
		int a = 10;
		double d = 2.3;
		
		int[] iArr = new int[5]; // 배열 선언과 동시에 할당
		double[] dArr = new double[7];
		
		System.out.println(a);
		System.out.println(d);
		/*
		 * 기본자료형(8개)으로 선언한 변수는 
		 * => 진짜 값(리터럴)을 담는 변수 => 일반변수 
		 * 
		 * 그 외 자료형(String, int[], char[],...)
		 * => 주소값을 담는 변수 => 레퍼런스(참조) 변수
		 * 
		 */
		System.out.println(iArr);  
		System.out.println(dArr);
		
	}
	
	
	public void method3() {
		
		double[] dArr = new double[3];

		for(int i= 0; i<dArr.length;i++) {
			
			System.out.println(dArr[i]);
			
		}
		
		// 아직 값을 대입하지 않아도 오류없이 잘 출력 되는 이유가
		// 배열의 각 인덱스에 별도로 대입하지 않으면 JVM이 지정한 기본값이 담기게 됨!
		// 왜? Heap영역에는 절대 빈 공간이 있어서는 안됨!! => JVM이 자동으로 초기값 부여 
		
		int[] iArr = new int[5];
		
		for(int i = 0; i<iArr.length; i++) {
			
			System.out.println(iArr[i]);
		}
	}

	public void method4() {
		
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 * 
		 */
		
		for(int i = 0; i<arr.length;i++) {
			
			arr[i] = i + 1;
			
			
		}
		for(int i=0; i<arr.length;i++) {
			
			// arr[0] : 1
			// arr[1] : 2
			//...
			// arr[4] : 5
			
			System.out.println("arr[" + i + "] : " + arr[i]);
			
			
		}
		
		System.out.println("arr : " + arr);
		System.out.println("arr의 해시코드 값 : " + arr.hashCode()); //주소값으 10진수 값
		System.out.println("배열의 길이 : " + arr.length);
	}
	
	public void method5 () {
		
		//사용자가 입력한 정수값만큼 배열 크기 지정
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값 : ");
		int size = sc.nextInt();
		
		char[] arr = new char[size]; //char 기본 값은 공백 그래서 공백 이 출력됨
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		//int => 기본값 0
		//double => 기본값 0.0
		//char => ' '
		
	}
	

	
	public void method6() {
		
		int [] arr = new int[5];
		
		/*
		 * 	arr[0] = 2;
		 * 	arr[1] = 4;
		 * 	...
		 * 	arr[4] = 10
		 * 
		 */
		
		int value = 2;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = value ;
			
			value += 2;
			
			System.out.println("arr[" + i + "] = " + arr[i] );
		}
		
		
		for(int i =0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 길이 : " + arr.length);
		System.out.println("arr의 주소값 : " + arr.hashCode());
		
		// 추가로 값을 더 넣어주면 오류 발생
		//arr[5] = 12;
		//arr[6] = 14;
		
		// * 배열의 가장큰 단점!!
		// 한번 지정된 크기는 더 이상 변경이 불가!
		
		// 만일 크기를 변경해야만 한다면 다시 배열을 할당
		//(배열의 크기를 다시 지정한 새로운 배열을 만들어야함)
		arr = new int[10];
		
		System.out.println("============변경후 arr ============");
		System.out.println("arr의 길이 : " + arr.length);
		System.out.println("arr의 주소값 : " + arr.hashCode());
		
		// 주소값 변경됨!! (기존에 참조하고 있던 곳과 연결 끊긴 후 새로운 곳을 참조하고 있음)
		
		//끊어진 기존 heap영역에 떠다니는 것(어느 곳에서도 참조 하지 않는 것)
		//=> 일정시간이 지나면 가비지 컬렉터가 지워줌
		
		// 지금 할당된 배열을 지우고자 할 때 어떻게 해야하나?
		arr = null; // 주소값이 없다 라는 걸 의미
		//java.lang.NullPointerException
		//System.out.println("arr의 길이 : " + arr.length);
		//System.out.println("arr의 주소값 : " + arr.hashCode());
		
		//NullPointerException : 아무것도 참조하지 않는 null 이라는 특수한 값을 참조하고 있을 때 발생
		// null.XXX
		
	}
	
	public void method7() {
		// 배열 선언 및 크지 지정 및 값 초기화 까지 한번에 해보자!
		
		// 자료형[] 배열명 = {값, 값, 값,};
		// 자료형[] 배열명 = new 자료형[]{값, 값, 값};
		
		int[] arr1 = {1,2,3,4};
		
		
		int[] arr2 = new int[] {1,2,3,4};
		
		System.out.println(arr1 == arr2); //false 주소값을 가지고 비교 했기 때문에 다른 값이다.
		
	}
	
	public void method8() {
		
		// 문자열 보관할 수 있는 String[] 크기 5로 지정한 후
		// 반복적으로 사용자에게 좋아하는 과일명 입력 받은 후 해당 배열에 차곡차곡 담기
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i = 0;i<arr.length;i++) {
			
			System.out.print((i+1) + "번째로 좋아하는 과일을 입력하세요 : ");
			arr[i] = sc.nextLine(); // 반복문이 출력 될 때마다 i 배열에 입력
			
		}
		
		// 잘 담겼는지 해당 인덱스에 담긴 값 출력
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
	}
	
	public void method9() {
		// 크기 10짜리 정수형 배열을 만들고
		
		// 0번 인덱스~마지막 인덱스까지
		// 매번 새로이 만들어지는 랜덤값(1~100)을 담을꺼임
		// 출력
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) {
			
			int random = (int)(Math.random()*100 +1);
			
			arr[i] = random;
			
			//System.out.println("arr[" + i + "]의 값 : " + random);
		}
		
		//출력
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		
	}
	
	public void method10() {
		
		//사용자에게 3명의 키 정보를 입력 받아 담기
		//반복문을 이용해서 3명의 키의 총합, 평균값 구하기
		
		Scanner sc = new Scanner(System.in);
	
		double[] height = new double[3];
		
		for(int i =0; i<height.length;i++) {
			
			System.out.print("키 입력 : ");
			height[i] = sc.nextDouble();
			
		}
		
		double sum = 0;
		for(int i=0; i<height.length;i++) {
			
			sum += height[i];
		}
	
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/height.length);
	
	}
	
	public void method11 () {
		
		//사용자가 입력한 정수 크기 만큼 int 배열 만듬
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		
		// 0번 인덱스에서 마지막 인덱스까지 값 담기(랜덤 값(1~100)을 담음)
		for(int i = 0; i<arr.length;i++) {			
			arr[i] = (int) (Math.random()*100 +1);				
			}
		
		
		// 담겨 있는 값 출력, 짝수 일 때 총합계산
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
			
		}		
		System.out.println("\n짝수 일 때 총합 : " + sum);
	}
	
	public void method12() {
		
		//사용자에게 문자열을 입력받은 후
		// 각 인덱스별 문자를 char[] 배열에 옮겨담기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<str.length();i++) {
			
			arr[i] = str.charAt(i);
	
		}
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
}