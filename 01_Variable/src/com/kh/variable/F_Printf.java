package com.kh.variable;

public class F_Printf {

	public void printfMethod() {
		
		
		// println(출력값); --> 출력후 개행
		// print(출력값); --> 출력
		
		// System.out.prinf("출력하고 싶은 형식(fomat)", 출력하고자 하는 값, 값, 값);
		// 출력하고자 하는 값들이 내가 제시한 포맷에 맞춰서 출력만 진행 --> 한줄 띄어쓰기 안해줌! \n 사용
		/*
		 * %d : 정수값이 들어갈 자리
		 * %f : 실수값이 들어갈 자리
		 * %c : 문자값이 들어갈 자리
		 * %s : 문자열이 들어갈 자리(문자도 가능)
		 * 
		 */
		
		
		int iNum1 = 10;
		int iNum2 = 20;
		int sum = iNum1 + iNum2;
		
		System.out.printf("%d\n",iNum1,iNum2); //뒤의 값은 무시됨
		//System.out.printf("%d"); //에러 발생 --> 포맷에 들어갈 값이 없어서 에러
		
		// 10 + 20 = 30
		
		
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, sum);
		// iNum : 10
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		
		System.out.printf("%-5d\n",iNum1); //5 : 5칸 공간 확보후 / 양수 : 오른쪽 정렬 하겠음!
		
		double dNum1 = 1.2345458;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n",dNum1,dNum2); //%f의 기본 포맷이 소수점 6번째짜리까지 표현해준다
												  // 만약 넘어가면 반올림, 모자라면 0으로 채워짐!	
		
		// 162.3
		//173.546
		System.out.printf("%.1f\t %.1f\n", dNum1, dNum2); // 소수점 아래 첫번째까지만 .1, 두번째 .2,,, \t는 들여쓰기
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n",ch,str);
		System.out.printf("%C %S\n",ch,str);
		
		
		
	}
	
	
}
