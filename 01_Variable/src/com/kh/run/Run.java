package com.kh.run;
import com.kh.variable.*; // *은 모든 것을 의미로, *을 찍으면 모든 클래스를 사용할 것을 선언
//import com.kh.variable.B_constant;
//import com.kh.variable.C_keybordInput;
//import com.kh.variable.D_Casting;
public class Run {

	public static void main(String[] args) {
		// 1) 클래스 생성 new
		
		A_Variable a = new A_Variable();
		B_constant b = new B_constant();
		C_keybordInput c = new C_keybordInput();
		D_Casting d = new D_Casting();
		E_OverFlow e = new E_OverFlow();
		F_Printf f = new F_Printf();
		// 2) 메소드 호출
		//a.printValue();
		//a.declareVariable();
		//a.initVariable();
		//b.finalConstant();
		//d.casting2();
		//e.overflow();
		f.printfMethod();
		//c.inputScanner2();
	}
}

