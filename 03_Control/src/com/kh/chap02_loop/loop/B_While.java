package com.kh.chap02_loop.loop;
import java.util.Scanner;
public class B_While {

	
	
	/*
	 *  *while �� == ��ġ�� �ٸ���  for���� ���� ������ ����
	 *  
	 *  �ʱ��;
	 *  
	 *  while(���ǽ� (�ַ� �޼ҵ带 ����)) {
	 *  	�ݺ������� �����Ű���� �ϴ� ����
	 *  	������;
	 *  }
	 *  
	 */
	
	
	public void method1() {
		
		int i =1;
		
		while(i<=5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
		i = 1;
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		i = 5;
		while(i>=1) {
			System.out.print(i + " ");
			i--;
			
		}
		
	}
	
	public void method2() {
		// 1�������� 10���� ȣ���� ���
		// 1 3 5 7 9
		
		int i = 1;

			while(i<=10) {
				if(i % 2 != 0) {
					System.out.print(i + " ");
	
				}
				i++;
			}
			
		
			System.out.println();
		
		i = 1;
		
			while(i<=10) {
				System.out.print(i + " ");
				i+=2;
			}
		
	}
	
	public void method3() {
		// 1�������� ������ ��(1~50)������ �հ�
		
		int i = 1;
		int random = (int)(Math.random()*50 +1);
		int sum = 0;
		
		System.out.println("������ : " + random);
		
			while(i<=random) {
			
				sum += i;
				
				i++;
				
			}
			System.out.println("\n1����" +random + "������ �հ�  : " + sum);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		String str = sc.nextLine();
		
		
		int i = 0;
		
		while(i < str.length()) {
			
			System.out.println(i + "��° ���� : " + str.charAt(i));
			
			i++;
		}


	}
	
	public void method5() {
		//����ڰ� �Է��� �� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է����ּ���(2~9) : ");
		int dan = sc.nextInt();
		int result = 0;
		int su = 1;
		if(2 <= dan && dan <= 9) {
			
			while(su<=9) {
				
				result = dan*su;
				
				System.out.printf("%d x %d = %d\n",dan,su,result);
				
				su++;
			}
			
			
		}else { System.out.println("2���� 9������ ���ڸ� �Է��ؾ� �մϴ�.");
		
		}
		
		
		
		
		
	}
	
	
}
