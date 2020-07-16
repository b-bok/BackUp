
// 호연
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
			System.out.print("1이상의 숫자를 입력하세요:");
		
			int num1 = sc.nextInt();
		
		if(num1<=0) { 
			System.out.println("잘못 입력하셨수다."); 
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
		System.out.println("1이상의 숫자를 입력하세요");
		int num1 = sc.nextInt();
	int sum=0;
		for(int i = 1 ; i<=num1; i++)
		{
			
			sum += i;
			
		}
	System.out.println("1부터" + num1 + " 까지의 합은" + sum +" 입니다.");
	
	}
	
	public static void number3() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("첫 번째 숫자:");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자:");
		int num2 = sc.nextInt();
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		
		if(max<=0 || min<=0) {
			
			System.out.println("1이상의 숫자만을 입력해주세요"); 
			
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
		System.out.println("출력하실 단수를 적어주십시오.");
		int num1 = sc.nextInt();
		
		for(int i = num1 ; i<=num1 ; i++)
		{  System.out.println("===="+num1+"단====");
			for(int j = 1 ; j<=9 ; j++)
			{
				System.out.printf("%d x %d = %d\n",num1,j,num1*j);
			}
			
		}
		
	}
	public static void number5()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하실 단수를 적어주십시오.");
		int num1 = sc.nextInt();
		
		if(num1>9 || num1<2) {
			System.out.println("2~9 사이의 값을 입력하시오");
		} else {
 		
		for(int i = num1 ; num1<=9 ; num1++)
		{  System.out.println("===="+num1+"단====");
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
		System.out.print("시작값을 입력하시오:");
		int num1 = sc.nextInt();
		System.out.print("공차를 입력하시오:");
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
            
			System.out.print("연산자(+, -, *, /, %) 프로그램 종료를 원하시면 exit 입력 :");
			
			String str = sc.nextLine();
			if(str.equals("exit")) {
				
				System.out.println("프로그램을 종료합니다."); break;
				
			}
			
			
			System.out.print("정수1 :");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 :");
			int num2 = sc.nextInt();
			
			int max = Math.max(num1,num2);
			int min = Math.min(num1,num2);
			
			
			if(min==0 && str.equals("/")) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요"); sc.nextLine();
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
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
			}
			
			sc.nextLine();

		}
		
		
	}
	
		
	}
	
	


