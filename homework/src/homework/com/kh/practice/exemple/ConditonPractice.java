package homework.com.kh.practice.exemple;
import java.util.Scanner;
public class ConditonPractice {

public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		String str = "";
		if(num == 1) {
			str = "�Է�";
		}else if(num == 2) {
			str = "����";
		}else if(num == 3) {
			str = "��ȸ";
		}else if (num == 4) {
			str = "����";
		}else {
			System.out.println("���α׷��� ����˴ϴ�.");
			
			return;			
		}
		
		System.out.printf("%s �޴��Դϴ�.",str);
		

	}
	
	public void practice2 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� ��  �Է����ּ��� : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("¦����");
			
		}else if (num % 2 != 0) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���.");
		}
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3 ; 
		
		if( kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	public void practice7 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double h = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double g = sc.nextDouble();
		
		double bmi = g / (h*h);
		
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}else if(bmi < 23) {
			System.out.println("����ü��");
		}else if(bmi < 25) {
			System.out.println("��ü��");
		}else if(bmi < 30) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		
		
		
	}
	

	
	/*if(month == 1 || month == 2 || month == 12) {
		season = "�ܿ�";
		} else if(month >= 3 && month <= 5) {
		season = "��";
		} else if(month >= 6 && month <= 8) {
		season = "����";
		} else if(month >= 9 && month <= 11) {
		season = "����";
		} else {
		season = "�ش��ϴ� ������ �����ϴ�.";
		}
	*/
	
	public void practice4 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		String season = "";
		switch(month) {
		case 1 :
		case 2 :
		case 12 : season = "�ܿ�"; break;
		case 3 : 
		case 4 :
		case 5 : season = "��"; break;
		case 6 :
		case 7 : 
		case 8 : season = "����"; break;
		case 9 : 
		case 10 :
		case 11 : season = "����"; break;	
		default : season = "�߸� �Էµ� ��"; break;
		}
		
		System.out.printf("%d���� %s�Դϴ�.",month,season);

	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		int pw = sc.nextInt();
	
		if(id.equals("boram")) {
			if(pw == 1234) {
				 System.out.println("�α��� ����");
			}
		}else if(pw != 1234) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				
		}else { System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		
		}
		

	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String id = sc.nextLine();
		
		
		switch(id) {
		case "������" : System.out.println("ȸ������, �Խñ� ����");
		case "ȸ��"  : System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
		case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break;
		default : System.out.println("�߸��Է��Ͽ����ϴ�."); 
		}
		
		
		
	}
	
	public void practice8 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է�  : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		int result = 0;
		
		/* if(num1 > 0 && num2 > 0) {
			if(ch == '+') {
				result = num1 + num2;
			}else if (ch == '-') {
				result = num1 - num2;
			}else if (ch == '*') {
				result = num1 * num2;
			}else if (ch == '/') {
				result = num1 / num2;
			}else if (ch == '%') {
				result = num1 % num2;
			}else {
				System.out.println("�����ڸ� �߸��Է� �ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
		
		}else {
			System.out.println("����� �Է����ּ���. ���α׷��� �����մϴ�.");
			return;
			} */
		
		if(num1>0 && num2>0) {
			switch(ch) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("�����ڸ� �߸��Է��߽��ϴ�. ���α׷��� �����մϴ�.");
			return;
			}
		
		}else {
			System.out.println("����� �Է����ּ���. ���α׷��� �����մϴ�."); return;
		}
		

		System.out.printf("%d %S %d = %d", num1, ch, num2, result);
		

		
	}
	
	public void practice9 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int score1 = sc.nextInt();
		
		System.out.print("�⸻ ��� ���� : ");
		int score2 = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int score3 = sc.nextInt();
			
		System.out.print("�⼮ ȸ�� : ");
		int score4 = sc.nextInt();
		
		double result1 = score1*0.2;
		double result2 = score2*0.3;
		double result3 = score3*0.3;
		double result4 = score4;
		double cut = 20*0.7;
	
		
		
		double sum = (result1 + result2 + result3 + result4);
		
		System.out.println("===========���==========");
		
		if(sum > 70 && score4 >= cut) {
			System.out.println("�߰� ��� ����(20) : " + result1);
			System.out.println("�⸻ ��� ����(30) : " + result2);
			System.out.println("���� ����	 (30) : " + result3);
			System.out.println("�⼮ ����	 (20) : " + result4);
			System.out.println("���� : " + sum);
			System.out.println("PASS");
		}else {
			if(score4 < cut) {
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + score4 + '/' + "20)");
		}
				
			if(sum < 70) {
				System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
		}
		// if�� ������ ���� �ǹǷ� ù��° if ������, else�� 70�� �̸��ϼ���, �⼮ �̴��ϼ���, �Ѵ��ϼ���
		// �׷��� if�� ���� ������ �ؾ�, �Ѵ� �϶� �Ѵ� ������ �� ����
		//if else if�� ���� ������ �񱳴���� ������ �� ���� ���̴�.
			
			
	}
		
	}
	
	public void practice10 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦�� / Ȧ��");
		System.out.println("3. �հ� / ���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		System.out.print("���� : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
