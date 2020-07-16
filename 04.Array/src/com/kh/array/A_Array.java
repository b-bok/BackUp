package com.kh.array;
import java.util.Scanner;
public class A_Array {

	/*
	 *  �迭 : �������� ���� ������ �� �ִ� ����(��, ���� �ڷ����� �ش��ϴ� ���鸸�� ����)
	 *  	  ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��	  
	 * 		  �� �ε����� �ڸ��� ���� ���(�ε����� �׻� 0���� ����)
	 * 
	 */
	
	public void method1() {
		// * �迭�� �� ������(�迭 �Ⱦ��� ��� � ���ŷο��� �ִ���..)
		
		// - �ٷ��� �����͸� ����صΰ��� �� �� ������ ���� ����� ��Ƽ� �����ϸ� ������....
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// - �� num���� ����ϰ��� �� �� ������ ����ؾ��Ѵ�...(�ݺ��� ���Ұ�)
		/*System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		int sum = num1 + num2 + num3 + num4 +num5;
	
		// * �迭 ����
		/*
		 *  1. �迭 ����
		 *	 	�ڷ��� �迭��[];
		 *		�ڷ���[] �迭��;	*��õ*		
		 */
		
		//int arr[];

		/*
		 * 2. �迭 �Ҵ�(�迭�� ũ�� ����!!)
		 * 		�迭�� = new int[�迭�� ũ��]; 
		 */
		int[] arr = new int[5]; // �迭�� ũ�� 5�� �����Ǵ� ����(5���� ���� ����.. 0����~4����)
		
		/*
		 * 3. �� ����(�ʱ�ȭ)
		 * 		�迭��[�ε���] = ��;
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
		
		// ������ �ε��� == �迭�� ũ�� -1
		for(int i = 0;i < arr.length;i++) {
			arr[i] = i;
		}
		
		
		
		// �迭�� ���� = �迭 ���� ������ ��Ģ�� ������ �ݺ��� ����� ��
		for(int i =0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		int sum2 = 0;
		
		for(int i =0; i<arr.length; i++) {
			
			sum2 += arr[i];
			
		}
		
		System.out.println("���հ��� �� : " + sum2);
		
		
	}
	
	public void method2() {
		
		
		int a = 10;
		double d = 2.3;
		
		int[] iArr = new int[5]; // �迭 ����� ���ÿ� �Ҵ�
		double[] dArr = new double[7];
		
		System.out.println(a);
		System.out.println(d);
		/*
		 * �⺻�ڷ���(8��)���� ������ ������ 
		 * => ��¥ ��(���ͷ�)�� ��� ���� => �Ϲݺ��� 
		 * 
		 * �� �� �ڷ���(String, int[], char[],...)
		 * => �ּҰ��� ��� ���� => ���۷���(����) ����
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
		
		// ���� ���� �������� �ʾƵ� �������� �� ��� �Ǵ� ������
		// �迭�� �� �ε����� ������ �������� ������ JVM�� ������ �⺻���� ���� ��!
		// ��? Heap�������� ���� �� ������ �־�� �ȵ�!! => JVM�� �ڵ����� �ʱⰪ �ο� 
		
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
		System.out.println("arr�� �ؽ��ڵ� �� : " + arr.hashCode()); //�ּҰ��� 10���� ��
		System.out.println("�迭�� ���� : " + arr.length);
	}
	
	public void method5 () {
		
		//����ڰ� �Է��� ��������ŭ �迭 ũ�� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� : ");
		int size = sc.nextInt();
		
		char[] arr = new char[size]; //char �⺻ ���� ���� �׷��� ���� �� ��µ�
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		//int => �⺻�� 0
		//double => �⺻�� 0.0
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
		
		System.out.println("arr�� ���� : " + arr.length);
		System.out.println("arr�� �ּҰ� : " + arr.hashCode());
		
		// �߰��� ���� �� �־��ָ� ���� �߻�
		//arr[5] = 12;
		//arr[6] = 14;
		
		// * �迭�� ����ū ����!!
		// �ѹ� ������ ũ��� �� �̻� ������ �Ұ�!
		
		// ���� ũ�⸦ �����ؾ߸� �Ѵٸ� �ٽ� �迭�� �Ҵ�
		//(�迭�� ũ�⸦ �ٽ� ������ ���ο� �迭�� ��������)
		arr = new int[10];
		
		System.out.println("============������ arr ============");
		System.out.println("arr�� ���� : " + arr.length);
		System.out.println("arr�� �ּҰ� : " + arr.hashCode());
		
		// �ּҰ� �����!! (������ �����ϰ� �ִ� ���� ���� ���� �� ���ο� ���� �����ϰ� ����)
		
		//������ ���� heap������ ���ٴϴ� ��(��� �������� ���� ���� �ʴ� ��)
		//=> �����ð��� ������ ������ �÷��Ͱ� ������
		
		// ���� �Ҵ�� �迭�� ������� �� �� ��� �ؾ��ϳ�?
		arr = null; // �ּҰ��� ���� ��� �� �ǹ�
		//java.lang.NullPointerException
		//System.out.println("arr�� ���� : " + arr.length);
		//System.out.println("arr�� �ּҰ� : " + arr.hashCode());
		
		//NullPointerException : �ƹ��͵� �������� �ʴ� null �̶�� Ư���� ���� �����ϰ� ���� �� �߻�
		// null.XXX
		
	}
	
	public void method7() {
		// �迭 ���� �� ũ�� ���� �� �� �ʱ�ȭ ���� �ѹ��� �غ���!
		
		// �ڷ���[] �迭�� = {��, ��, ��,};
		// �ڷ���[] �迭�� = new �ڷ���[]{��, ��, ��};
		
		int[] arr1 = {1,2,3,4};
		
		
		int[] arr2 = new int[] {1,2,3,4};
		
		System.out.println(arr1 == arr2); //false �ּҰ��� ������ �� �߱� ������ �ٸ� ���̴�.
		
	}
	
	public void method8() {
		
		// ���ڿ� ������ �� �ִ� String[] ũ�� 5�� ������ ��
		// �ݺ������� ����ڿ��� �����ϴ� ���ϸ� �Է� ���� �� �ش� �迭�� �������� ���
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i = 0;i<arr.length;i++) {
			
			System.out.print((i+1) + "��°�� �����ϴ� ������ �Է��ϼ��� : ");
			arr[i] = sc.nextLine(); // �ݺ����� ��� �� ������ i �迭�� �Է�
			
		}
		
		// �� ������ �ش� �ε����� ��� �� ���
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
	}
	
	public void method9() {
		// ũ�� 10¥�� ������ �迭�� �����
		
		// 0�� �ε���~������ �ε�������
		// �Ź� ������ ��������� ������(1~100)�� ��������
		// ���
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) {
			
			int random = (int)(Math.random()*100 +1);
			
			arr[i] = random;
			
			//System.out.println("arr[" + i + "]�� �� : " + random);
		}
		
		//���
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		
	}
	
	public void method10() {
		
		//����ڿ��� 3���� Ű ������ �Է� �޾� ���
		//�ݺ����� �̿��ؼ� 3���� Ű�� ����, ��հ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
	
		double[] height = new double[3];
		
		for(int i =0; i<height.length;i++) {
			
			System.out.print("Ű �Է� : ");
			height[i] = sc.nextDouble();
			
		}
		
		double sum = 0;
		for(int i=0; i<height.length;i++) {
			
			sum += height[i];
		}
	
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/height.length);
	
	}
	
	public void method11 () {
		
		//����ڰ� �Է��� ���� ũ�� ��ŭ int �迭 ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		
		// 0�� �ε������� ������ �ε������� �� ���(���� ��(1~100)�� ����)
		for(int i = 0; i<arr.length;i++) {			
			arr[i] = (int) (Math.random()*100 +1);				
			}
		
		
		// ��� �ִ� �� ���, ¦�� �� �� ���հ��
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
			
		}		
		System.out.println("\n¦�� �� �� ���� : " + sum);
	}
	
	public void method12() {
		
		//����ڿ��� ���ڿ��� �Է¹��� ��
		// �� �ε����� ���ڸ� char[] �迭�� �Űܴ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
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