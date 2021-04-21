package Inheritance;

import java.util.Scanner;

public class Panasonic extends Kettle {
	
private int retailprice, monthlyrental;
	
	public Panasoninc(String b, String c, double w, double p, double t) {
		super(b, c, w, p, t);
		totalPrice=t;
	}
	
	 public Double getTotalPrice() {
		  return totalPrice;
	  }
	 public String toString() {
		  return super.toString() + "Total Price : " + totalPrice;
	  }
}
