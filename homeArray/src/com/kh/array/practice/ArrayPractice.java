package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void method1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
			
		}
		
	}
	
	public void method2() {
		
		int[] arr = new int[10];
		
		for(int i = arr.length-1; i>=0;i--) {
			
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");	
			
			}
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length;i++) {
			
			arr[i] += (i+1);
			System.out.print(arr[i] + " ");
		}
		
		//System.out.print(Arrays.toString(arr));	
	}
	
	
	public void method4() {
		
		String[] fruit = {"���", "��", "����","������", "����"};
		
		
		for(int i = 0; i<fruit.length;i++) {
			
			if(fruit[i].equals("��")) {
				System.out.println(fruit[i]);
				
			}
			
		}
		
		
		//System.out.println("ex.\n" + fruit[1]);
		
		
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		char word = sc.nextLine().charAt(0);
		
	      char[] ch = new char[name.length()];
	      
	      int[] arr = new int[name.length()];
	      
	      int sum = 0;
	      
	      System.out.print(name +"��" + word + "�� �����ϴ� ��ġ(�ε���) : ");
	      
	      for(int i = 0; i<ch.length; i++) {
	    	  
				if(name.charAt(i) == word) {
					sum++;
					
					System.out.print(i + " ");
				}
			}
	      
	      System.out.println();
	      System.out.println(word + "���� : " + sum );
		
	}
		public void method51() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���ڿ� : ");
			String str = sc.nextLine();
			
			char[] ch = new char[str.length()];
			
			for(int i = 0; i<str.length();i++) {
				
				ch[i] = str.charAt(i);
	
			}
			System.out.println();
			
			String index = "";
			int count = 0;
			
			System.out.print("���� : ");
			char input = sc.nextLine().charAt(0);
			
			for(int i = 0; i<str.length();i++) {
				
				if(ch[i] == input) {
					
					index += i + " ";
					count++;
					
				}
				
			}
			System.out.printf("%s�� %c�� �����ϴ� ��ġ(�ε���) : %s\n",str,input,index);
			System.out.printf("%c��  ���� : %d",input,count);
			
		}
	
	

	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] week = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		
		System.out.print("0~6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		/*switch(num) {
		case 0 : System.out.println(week[0]); break;
		case 1 : System.out.println(week[1]); break;
		case 2 : System.out.println(week[2]); break;
		case 3 : System.out.println(week[3]); break;
		case 4 : System.out.println(week[4]); break;
		case 5 : System.out.println(week[5]); break;
		case 6 : System.out.println(week[6]); break;
		default : System.out.println("�� �� �Է��ϼ̽��ϴ�."); break;
		
		}
		*/
		if(num<0 || num>6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		
		
		System.out.println(week[num]);
	}
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num1 = sc.nextInt();
		
		int[] arr = new int[num1];
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			
			System.out.print("�迭" + i + "��° �ε����� ���� �� : ");
			int num2 = sc.nextInt();
			
			arr[i] = num2;
			
			sum += arr[i];
			
		}
		
		System.out.println();
		
		for(int i =0; i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		
		
		//System.out.println(Arrays.toString(arr));
		System.out.println("\n�� �� : " + sum);
		
	}
	
	public void method8() {
		
		Scanner sc = new Scanner(System.in);
	while(true) {
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num<3||num%2 == 0) {
			System.out.println("�ٽ� �Է����ּ���");
			continue;
		}
		
		int[] arr = new int[num];
		int middle = (int) num/2;
		
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(i<=middle) {
				sum += 1;
				arr[i] = sum;
				
			}else {
				sum -= 1;
				arr[i] = sum;
			
			}
		}
		System.out.println(Arrays.toString(arr));
		break;
	}

	}
		
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ġŲ �̸��� �Է��ϼ���  : ");
		String chickname = sc.nextLine();
		
		String[] chicken = {"�Ķ��̵�","���","����","���߸���","�Ҵ�"};
		
		int num = 0;
		
		for(int i = 0; i<chicken.length;i++) {
			
				if(chickname.equals(chicken[i])) {
					
					num = i;
					
					break;				
				}
				
			}
		if(chickname.equals(chicken[num])) {
			System.out.println(chicken[num] + "��� ����");
		}else {
			System.out.println(chickname + "�� ���� �޴��Դϴ�.");
		}
			
		
		}
		
	public void method10 () {
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) {
			
			int random = (int) (Math.random()*10 +1);
			arr[i] = random;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public void method11() {
		int[] arr = new int[10];
		int max = arr[0];
		int min = arr[arr.length-1];
		
		
		for(int i = 0; i<arr.length;i++) {
			
				int random1 = (int) (Math.random()*10 +1);
				arr[i] = random1;

		}
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		max = arr[arr.length-1];
		min = arr[0];
		
		System.out.println(max);
		System.out.println(min);
		}
		
	public void method12() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) {
			
			arr[i] = (int)(Math.random()*10 +1);
			
			for(int j = 0; j<i; j++) {
				
				if(arr[i] == arr[j]) {
					i--;
					continue;	
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void method13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String num = sc.nextLine();
		
		char[] ch = new char[num.length()];
		
		for(int i = 0; i<num.length();i++) {
			
			ch[i] = num.charAt(i);
			
			if(i>=7) {
				ch[i] = '*';
			}
			System.out.print(ch[i] + " ");
		}
		
	}
	
	
	public void method14() {
		
		int[] lotto = new int[6];
		
		for(int i = 0; i<lotto.length;i++) {
			
			lotto[i] = (int)(Math.random()*45 + 1); 
		
			for(int j=0; j<i;j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					continue;
				}
				
			if(lotto[i]<lotto[j]) {
				int temp = lotto[i];
				lotto[i] = lotto[j];
				lotto[j] = temp;
			}
				
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}
}	
	
		

