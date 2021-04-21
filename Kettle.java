package Inheritance;

import java.util.Scanner;

public class Kettle {
	private String brand;
	private String color;
	private double weight;
	private double price;
	private double total;
	
	Scanner s = new Scanner(System.in);
	
	Kettle(){
		System.out.println("Enter brand : ");
		this.brand = s.nextLine();
		s.nextLine();
		System.out.println("Enter color : ");
		this.brand = s.nextLine();
		s.nextLine();
		System.out.println("Enter weight : ");
		this.weight = s.nextDouble();
		s.nextLine();
		System.out.println("Enter price : ");
		this.price = s.nextDouble();
	}
	
	public double totalPrice() {
		this.total = this.price * 2;
		return this.total;
	}
	
	Kettle(String b, String c, double w, double p){
		this.brand=b;
		this.color=c;
		this.weight=w;
		this.price=p;
	}
	
	public String getBrand() {
		  return this.brand;
	  }
	  public String getColor() {
	 	  return this.color;
	  }
	  public double getWeight() {
		  return this.weight;
	  }
	  public double getPrice() {
		  return this.price;
	  }	  
}
