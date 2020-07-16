package com.kh.variable;
// 다른 패키지라면 같은 클래스명으로 사용 가능!
public class A_Variable {

	
	
	/*
 * 1. 변수?
 * 2. 왜 사용?
 * 3. 어떻게 씀? 
 * 4. 명명규칙?
 * 
 */
	public void printValue() {
		
		System.out.println("======= 변수 사용 전 ==========");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		// 출력은 성공적 but 의미 파악 어려움
		
		int point = 100;		// 포인트
		int bonus = 10;			// 보너스
		int personCount = 10;	// 사람수
		int fees = 10;			// 수수료
		
		System.out.println("===========변수 사용 후=========");
		// 변수? --> 메모리 기록 박스 같은 개념
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
		
		/*
		 *  2. 변수를 사용하는 이유를 알았다! --> 의미가 부여되어 파악이 쉬움
		 *  - 변수는 값의 의미를 부여하기 위해 사용 == 가독성이 좋음
		 *  - 변수는 한번 값 저장, 계속 사용 할 목적으로 이용 == 유지보수가 쉬움
		 */
	
	}
	
	
	public void declareVariable() {
		
		
		
		System.out.println();
		
		//3. 변수를 어떻게 만들고, 어떻게 값을 담을까 ?
		/*
		 * 3_1. 변수의 선언(저장할 값을 기록하기 위한 변수를 메모리 공간 확보하는 과정)
		 * [표현법] 자료형 변수명;
		 * 자료형 : 어떤 값을, 어떤 크기의 값을 담을 박스 설정
		 * 변수명 : 변수 의미 부여
		 * (주의! 
		 * -반드시 첫문자는 소문자,
		 * - 낙타기법 지키기,-
		 * - 동일한 변수 명은 선언 불가
		 * - 해당 영역에 선언한 지역변수는 해당영역에서만 사용가능
		 * 
		 * 
		 * 
		 */
		// ------자료형( 8개) ------
		// 1. 논리형
		boolean isTrue; //1byte
		// 2. 숫자형
		// 2_1. 정수형
		byte bNum; // 1byte(-128~127)
		short sNum; // 2byte
		int iNum; // 4byte --> 기본형
		long lNum; // 8byte --> 날짜 관련 자료 작성 시
		
		// 2_2. 실수형(2개)
		float fNum; //4byte
		double dNum; // 8byte 실수형에서 기본형, 더 정확한 값 가능
		
		// 3. 문자
		
		char ch; // 2byte 
		
		// 참조 자료형, 문자열(여러글자 저장)
		
		String str;
		
		
		/*
		 *  3_2. 변수에  값 대입(초기화)
		 *  
		 *  [표현법] 자료형 변수명 = 값;
		 *  
		 * 
		 */
		
		isTrue = true; // 논리형 변수는 true, false만 저장 가능
		bNum = 1;
		sNum = 2;
		iNum = 3;
		lNum = 1_000_000_000L; // long형 변수에는 L을 끝에 붙여서 표현해주자
		
		fNum = 4.0f; // float형 변수에는 끝에 f을 끝에 붙여주자
		dNum = 4.12;
		
		ch = 'A'; // 홑 따옴표를 이용하여 대입하면 됨
		str = "abcdedfhijkl";
		
		// 변수의 값이 잘 담겼낭?
		
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch + str);
		System.out.println(5_000_000*30);
		
	}
	
	public void initVariable() {
		// 변수 선언이랑, 값을 대입하는 것을 동시에 할것
		// [표현법] 자료형 변수명 = 값;
		
		boolean isTrue = true;
		byte bNum = 1;
		short sNum = 12;
		int iNum =123;
		long lNum = 1234L;
		float fNum = 1234.12f;
		double dNum = 123.45; //더 정확한 값 저장 가능해서 기본형
		char ch = 'c';
		
		
		String str = "charbok";
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch + str:" +ch + str);
		
		int result = iNum * 2;
		
		System.out.println("result : " + result);
		
		//
		int etc = 100_999_999;
		System.out.println("etc : " + etc);
		
		
		
	}
	
	
	
	public void namingRule() {
		
		int number;
		//double number; 변수 중복 불가
		// 대소문자 구분가능
		int Number;
		
		//true, public, class, void, abstract 등은
		// 이미 자바에서 사용되고 있는 예약어다.
		// 변수이름에 숫자 포함 가능하나, 숫자로 시작해선 안된다!
		// _와 $ 특수문자 제외하고는 모두 불가
		
		int number_1;
		int number$;
		
		int age1;
		int age12;
		int age123;
		// 이제부터는 권장사항
		// 이것이 바로 낙타표기법이다! / 시작은 소문자로 할것!
		int toFindSumProject;
		int whenWeGoHome;
		int whatIsTheProblem;
		
		/*
		 * 정리!
		 * 변수는 값(리터럴)을 기록하기 위한 공간이다.
		 * 변수를 사용한다면, 의미파악이 쉽다, 유지보수가 쉽다
		 * 변수 선언과 값대입을 동시에
		 * [표현법] 자료형 변수명  = 값; 깔끔 보기 좋아
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}
	
	
}
