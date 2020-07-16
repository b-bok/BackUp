package com.kh.chap03_class.model.vo;



// Ŭ���� �տ� ��� ������ ���� ������ : public, default(���������ڸ� �Ⱦ��� �ٷ� default)
// default : �ٸ� ��Ű�������� ���� ���(����) �Ұ�  
public class Product {
	// �ʵ�
	private String pName;
	private int price;
	private String brand;
	
	// �⺻ ������
	public Product() {}
	
	// �Ű�����������
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
	}
	
	// setter�޼ҵ�
	
	public void setpName(String pName) {
		this.pName = pName;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// getter�޼ҵ�
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	// ��� �ʵ尪�� �ϳ��� ���ڿ��� ���ļ� ��ȯ��Ű�� information �޼ҵ� �����
	
	public String information() {
		
		return "��ǰ�� : " + pName + ", ���� : " + price + "��, �귣�� : " + brand;
	}
	
	
}
