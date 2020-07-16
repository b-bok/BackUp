package com.kh.run;

import com.kh.first.B_ValuePrinter;


public class RunB {
	
	public static void main(String[] args) {
		// com.kh.first.B_ValuePrinter b = com.kh.first.B_ValuePrinter();
		B_ValuePrinter b = new B_ValuePrinter(); //클래스 생성 먼저
		
		b.printValue(); // 메소드 호출
	
		b.sumStringNumber();
		
	}
}