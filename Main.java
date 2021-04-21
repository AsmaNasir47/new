package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kettle k = new Kettle();
		System.out.println(k);
		System.out.println();
		
		Panasonic kk = new Panasonic("Panasonic", "White", 12, 30);
		System.out.println(kk); 
		System.out.println("Total Price : " + kk.totalPrice());
		
	}

}
