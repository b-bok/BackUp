package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.*;

public class Run2 {

		public static void main(String[] args) {
			// ��ü ����
			Product goods1 = new Product();
			
			System.out.println(goods1.hashCode());
			
			System.out.println(goods1.information());
			
			System.out.println("===== �Է� �� =====");
			
			goods1.setpName("����");
			goods1.setPrice(200_000);
			goods1.setBrand("LG");
			
			System.out.println(goods1.information());

			
			Product goods2 = new Product();
			
			goods2.setpName("�����");
			goods2.setPrice(1_000_000);
			goods2.setBrand("����");
			
			System.out.println(goods2.information());
			
			
			
			Product goods3 = new Product("��������",20000,"���");
			
			System.out.println(goods3.information());
			
		}
}
	