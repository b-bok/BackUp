package com.kh.chap06_method.run;

import java.util.Arrays;

import com.kh.chap05_constructor.model.vo.User;
import com.kh.chap06_method.controller.*;

public class Run {

	public static void main(String[] args) {
		//------ 1. MethodTest1-----------
		MethodTest1 m1 = new MethodTest1();
		
		//m1.method1();
		
		/*
		double random = m1.method2();
		
		System.out.println(random);
		
		
		//System.out.println(m1.method2());
		
		
		
		//m1.method3(3,4);
		
		int minus = m1.method4(11, 2);
		
		System.out.println("»¬»ù °á°ú : " + minus);
		*/
		
		MethodTest2.method1();
		MethodTest2.method2();
		MethodTest2.method3("Á¤Âùº¹");
		
		
		String str = MethodTest2.method4("¹Ú¹ÎÁö");
		
		System.out.println(str);
	
		int[] a = MethodTest2.test1();
		
		System.out.println(Arrays.toString(a));
		
		
		User b = MethodTest2.test2("user01", "pass01", "È£ÀÕÈ£ÀÕ");
		
		System.out.println(b.information());
		
		
		
	}

}
