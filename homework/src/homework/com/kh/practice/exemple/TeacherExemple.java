package homework.com.kh.practice.exemple;
import java.util.Scanner;
public class TeacherExemple {

	
	
	public void practice12() {
		// ����ڰ� �� �Է��ߴٴ� �����Ͽ�, ����Ǵ� ���α׷��� �غ���
		// ���Ŀ� ������ �� �ִ� �κ��� ���ĺ���.
		// ���� ���� �Ŀ��� �ٷ� �ٷ� ���� �� �� �ִ�.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			//(���� �ؾ��� �ڵ� �����)
			
			//1. ������ �Է¹ޱ�
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			// >> ����ó�� : ����ڰ� �Է��� �����ڰ� exit�ϰ�� ���ᱸ�� ����� ����������
			
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.\n");
				break;
			}
			
			
			//2. �ΰ��� ������ �Է¹ޱ�
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); // �ϳ��� ���� �׽�Ʈ �ذ�, �׽�Ʈ �ذ� ���� ����.
			
			// >> ���� ó�� : �����ڰ� /�̸鼭(�׸���) num2�� 0�� ��� �������� ��� �� �ݺ��� ���� �ö󰡶�!
			if(op.equals("/") || op.equals("%") && num2 ==0) {
				System.out.println("0���� ������ �����ϴ�. �ٽ� �Է����ּ���. \n");
				continue;
			}
			
			
			//3. ������ ����ϱ�
			int result = 0;
			switch(op) {
			
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			case "%" : result = num1 % num2; break;
			// >> ����ó�� : �����ڸ� �߸� �Է����� ��� �������� ��� �� �ݺ��� ���� �ö󰡴�!
			//  by zero : 0���� ������ ��쿡 ���� ��, ���� �߻�	
			default : System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.\n"); continue; // continue ������ ����  �ڿ� �ִ� printf������ ���� �ȵȴ�.
																					//����� �ݺ������� �ö󰣴�.
			}
			
			
			//(�ڵ��ϱ��� �뷫���� ������ ��Ʈ�� ����� �͵� ����)
			
			
			System.out.printf("%d %s %d = %d\n",num1, op, num2,result);
		}
		
		
		
	}
	
	
	
	
	
	
	
}
