package com.kh.operator;

public class C_Arithmetic {

	//산술 연산자 (이항 연산자)
	// 우선순위 (+ -) << (* /(몫) %(나머지))
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 4;
		//	괄호를 안쓴다면		"num1 +num2=10" + num2
		//					"num1 +num2=104"
		System.out.println("num1 + num2 = " +(num1 + num2)); // 14
		System.out.println("num1 - num2 = " +(num1 - num2)); // 6
		System.out.println("num1 x num2 = " +(num1 * num2)); // 40
		System.out.println("num1 / num2 = " +(num1 / num2)); // 2
		System.out.println("num1 % num2 = " +(num1 % num2)); // 2
		
		System.out.println(10 / 3); //3
		System.out.println(10 % 3); //1
		
	}
	
	
	public void quiz() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
	}
	
}
