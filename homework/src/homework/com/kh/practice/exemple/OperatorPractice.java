package homework.com.kh.practice.exemple;
import java.util.Scanner;

public class OperatorPractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num1 = sc.nextInt();
		
		System.out.println( num1 > 0 ? "�����." : "����� �ƴϴ�.");
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		
		System.out.println( num2>0 ? "�����." : (num2 == 0) ? "0�̴�." : "������.");
		
		
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num3 = sc.nextInt();
		
		System.out.println( num3 % 2 == 0 ? "¦����." : "Ȧ����." );
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int num2 = sc.nextInt();
		
		int result1 = (num2 / num1) ;
		int result2 = (num2 % num1) ;
		
		System.out.println("1�δ� ���� ���� : " + result1);
		System.out.println("���� ���� ���� : " + result2);

	}
	
	public void method5 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�)");
		int class1 = sc.nextInt();
		
		System.out.print("��(���ڸ�)");
		int ban = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�)");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����(M/F)");
		char gender = sc.nextLine().charAt(0);
		String gender1 =  (gender == 'M' ? "���л�" : "���л�");
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°¥������)");
		double grade = sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.\n",
							class1,ban,number,name,gender1,grade);
		//System.out.println(Math.round(grade*100)/100f); Math.round()�� ����ϸ� �ݿø� ����
		
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.println(age > 19 ? "����" : (age > 13) ? "û�ҳ�" : "���");
		
		
	}
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		int avg = (sum/3);
		
		System.out.println("�հ� : " + sum );
		System.out.println("��� : " + avg );
		
		System.out.println((kor >= 40 && eng >= 40 &&math >= 40) && avg >= 60 ? 
							" �հ� " : "���հ�");

	}
	
	public void method8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) :" );
		char ch = sc.nextLine().charAt(7);
		System.out.println(ch);
		System.out.println(ch == '1'|| ch == '3' ? "����" : 
							ch == '2' || ch == '4' ?  "����" : "�߸��� ���Դϴ�.");
	
	}
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		System.out.println((num1 < num2) && (input <= num1 || input > num2) ?
							"true" : "false");

	}
	
	public void method10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		// 1�� ���
		//boolean result1 = ((num1 == num2) ? true : false);
		//boolean result2 = ((num2 == num3) ? true : false);
	
 		//System.out.println((result1 = result2) ? "true" : "false");
		
		
		
		// 2�� ���
		//boolean isTrue = (num1 == num2) && (num2 == num3);
		//System.out.println(isTrue);
		
		// 3�� ���
		System.out.println((num1 == num2 && num2 == num3) ? "true" : "false");
	}
	
	
	
	
	
	// ���� ��� ��¹��� �ִ��� ����ȭ ��������, ���ǹ��� ���� ����� ���Ҵ�!
	
}
