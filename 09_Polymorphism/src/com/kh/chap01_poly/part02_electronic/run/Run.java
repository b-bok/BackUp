package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop d = new Desktop();
		NoteBook n = new NoteBook();
		Tablet t = new Tablet();
		
		Electronic[] arr = new Electronic[3];
		arr[0] = new Desktop("삼성","데탑",1200000,"Geforce 1070");
		arr[1] = new NoteBook("LG","그램",1800000,3);
		arr[2] = new Tablet("애플","아이패드프로",2000000,true);
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
