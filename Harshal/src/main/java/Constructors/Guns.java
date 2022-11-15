package Constructors;

public class Guns {//BLC
	String gunName;
	int noofbullets;
	public Guns(String gunName,int noofbullets) {
		this.gunName=gunName;
		this.noofbullets=noofbullets;
	}
	public void shoot() {
		for(int i=1;i<=noofbullets;i++) {
			System.out.println("Deshkaw");
			
		}
	}

}
