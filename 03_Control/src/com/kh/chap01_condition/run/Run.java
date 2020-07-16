package com.kh.chap01_condition.run;
import com.kh.chap01_condition.condition.*;
public class Run {

	public static void main(String[] args) {
		
		/*
		 * 프로그램은 기본적으로 순차적으로 실행
		 * 단, 순차적인 흐름을 바꿀 때 제어문이라는 걸 통해서 직접 제어 할 수 있음!
		 * 
		 * 선택적으로 실행하는 선택문 --> 조건문
		 * 반복적으로 실행하는 실행문 --> 반복문
		 * 그 외의 흐름을 제어하는 문 --> 분기문
		 * 
		 * 
		 * * 조건문
		 * - 조건식이 참이냐 거짓이냐 판단 후 조건이 참이면 그에 해당하는 실행문 실행
		 * - 삼항연산자 역시 조건문
		 * 
		 * 조건문 크게 if문과 switch문으로 나뉨
		 * 
		 * 그중 if문은 크게 3가지이다.
		 * 1. 단독 if문
		 * 2. if-else문
		 * 3. if-else if문
		 * 
		 * 
		 */
		C_switch c = new C_switch();
		
		c.method4();
		
		
	}
}
