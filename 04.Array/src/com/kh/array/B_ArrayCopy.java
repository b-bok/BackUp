package com.kh.array;
import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {

	/*
	 * * �迭�� ����
	 * - ���� ���� : �迭�� �ּҸ��� ����
	 * - ���� ���� : �迭�� ������ �����ϰ� ���� ���� ������ ����
	 * 
	 */
	
	public void method1 () {
		
		int[] origin = {1,2,3,4,5};
		
		System.out.println("== ���� �迭 ==");
		
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i] + " ");
			
		}
		//���纻 �迭
		int [] copy = origin;
		
		System.out.println("\n== ���纻 �迭  ==");
		
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n == ���纻 �迭 ���� ��  ==");
		
		System.out.println("== ���� �迭 ==");
		
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i] + " ");
			
		}
		
		System.out.println("\n== ���纻 �迭  ==");
		for(int i = 0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin�ּҰ� : " + origin.hashCode());
		System.out.println("coopy �ּҰ� : " + copy.hashCode());
		
		// �ּҰ����� ����(���� ����)���� �� ���� �迭�� ���� �ϰ� ����
		
		
	}
	
	public void method2() {
		// ���� ����
		
		//1. for�� ���
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
		
		System.out.println("\n --- ���纻 ������ ---");
		
		for(int i =0; i<origin.length;i++) {
			
			System.out.print(origin[i] + " ");
			
		}
		
		System.out.println();
		
		for(int i =0; i<copy.length;i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		
		
		System.out.println("\norigin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
		}
		
	public void method3() {
		// 2. ���ο� �迭 �����ϰ� SystemŬ���������� arraycopy �޼ҵ� �̿��� ����
		
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[10]; // �˳��ϰ� ����
		
		
		// System.arraycopy(�����迭�� , ���縦 �������ε��� ,���纻�迭�� , ���纻�迭�� ���簡 ���� �� ���� �ε��� ,�����Ұ��� );
		System.arraycopy(origin, 2, copy, 0, 3);
		//ArrayIndexOutOfBoundsException = �������ϰ� ������ ��� (���� �ƿ�)
		for(int i = 0; i<copy.length;i++) {
			
			System.out.print(copy[i] + " ");
		
		}
		System.out.println("\norigin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		// �ּҰ��� �ٸ��� -> �迭 ������ ���� ������ ���� �ʴ´�!
		// ���纻 ������ �������� �׽�Ʈ �����ϴ�!
	}
	
	public void method4() {
		// 3. Arrays Ŭ�������� �����ϴ� copyOf �޼ҵ� ���
		
		int[] origin = {1,2,3,4,5};
		
		//���纻 �迭 = Arrays.copyOf(�����迭��, ������ ����); => copy�迭�� ũ�� == ������ ����(�����迭���� ũ�� �ص� ���� ����)
		
		
		
		// ArraysŬ���������� copyOf �޼ҵ� �� SystemŬ������ arraycopy�� ������
		// ������ ���� �ε���, ����� ���� �ε��� ���� �Ұ�!
		
		//int[] copy = Arrays.copyOf(origin, origin.length);
		
		//int[] copy = Arrays.copyOf(origin, 3);
		
		int[] copy = Arrays.copyOf(origin, 8);
		
		for(int i =0; i<copy.length; i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("\norigin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
	}
	
	public void method5() {
		// 4. clone() �޼ҵ� �̿��� ����(���� �ε���, ������ ���� ��ü ���� �Ұ�)
		
		int[] origin = {1,2,3,4,5};
		
		int[] copy = origin.clone();
		
		/*
		for(int i =0; i<copy.length; i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		*/
		// toString �޼ҵ�� �ݺ��� ���� ��� �ε��� �ٷ� ��°���
		System.out.println(Arrays.toString(copy));
		

		System.out.println("\norigin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
	}
		
		
		
}
	

