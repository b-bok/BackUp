
// ȣ��
import java.util.Scanner;

public class HoyeonLoopQuestion {

	public static void main(String[] args) {
	 
		//number1();
		//number2();
		//number3();
		//number4();
		//number5();
        //nember6();
		//number7();
	}

	public static void number1()
	{
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���:");
		
			int num1 = sc.nextInt();
		
		if(num1<=0) { 
			System.out.println("�߸� �Է��ϼ̼���."); 
		} 
		else {
		for(int i = num1 ; i>=0 ; i-- ) {
			
			System.out.print(i+" " );
			
		     }

		}
		
		System.out.println("");
		}
		
	}
	
	public static void number2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1�̻��� ���ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
	int sum=0;
		for(int i = 1 ; i<=num1; i++)
		{
			
			sum += i;
			
		}
	System.out.println("1����" + num1 + " ������ ����" + sum +" �Դϴ�.");
	
	}
	
	public static void number3() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("ù ��° ����:");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ����:");
		int num2 = sc.nextInt();
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		
		if(max<=0 || min<=0) {
			
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���"); 
			
		} else {
			
			for(int i = min ; i<=max; i++)
			{
				
				System.out.print(i+" ");
				
			}
			
		}
		}
	}
	
	public static void number4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ͻ� �ܼ��� �����ֽʽÿ�.");
		int num1 = sc.nextInt();
		
		for(int i = num1 ; i<=num1 ; i++)
		{  System.out.println("===="+num1+"��====");
			for(int j = 1 ; j<=9 ; j++)
			{
				System.out.printf("%d x %d = %d\n",num1,j,num1*j);
			}
			
		}
		
	}
	public static void number5()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ͻ� �ܼ��� �����ֽʽÿ�.");
		int num1 = sc.nextInt();
		
		if(num1>9 || num1<2) {
			System.out.println("2~9 ������ ���� �Է��Ͻÿ�");
		} else {
 		
		for(int i = num1 ; num1<=9 ; num1++)
		{  System.out.println("===="+num1+"��====");
			for(int j = 1 ; j<=9 ; j++)
			{
				System.out.printf("%d x %d = %d\n",num1,j,num1*j);
			}
			
		}
		}
		
	}
	
	public static void nember6()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���۰��� �Է��Ͻÿ�:");
		int num1 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�:");
		int num2 = sc.nextInt();
		
		for (int i = 1 ; i<=10; i++) {
			
			System.out.print((num1 += num2)-num2+" ");
			
				
			}
			
		
			
		}

	public static void number7()
	{
		Scanner sc = new Scanner(System.in);
	
		while(true)
		{
            
			System.out.print("������(+, -, *, /, %) ���α׷� ���Ḧ ���Ͻø� exit �Է� :");
			
			String str = sc.nextLine();
			if(str.equals("exit")) {
				
				System.out.println("���α׷��� �����մϴ�."); break;
				
			}
			
			
			System.out.print("����1 :");
			int num1 = sc.nextInt();
			
			System.out.print("����2 :");
			int num2 = sc.nextInt();
			
			int max = Math.max(num1,num2);
			int min = Math.min(num1,num2);
			
			
			if(min==0 && str.equals("/")) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���"); sc.nextLine();
			continue;}
			
			int result = 0;
	
			if(str.equals("+")) {
				
			System.out.println(max + "+" + min +"=" + (max+min));
			} 
			
			else if (str.equals("/")) { 
			
			System.out.println(max + "/" + min +"=" + (max/min)); 	
			} 
			
			else if (str.equals("*")) { 
			
			System.out.println(max + "*" + min +"=" + (max*min));
			} 
			
			else if (str.equals("-")) { 
			
			System.out.println(max + "-" + min +"=" + (max-min));
			} 
			
			else {
				System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.");
			}
			
			sc.nextLine();

		}
		
		
	}
	
		
	}
	
	


