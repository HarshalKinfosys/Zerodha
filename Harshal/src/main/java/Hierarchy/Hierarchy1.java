package Hierarchy;

public class Hierarchy1 {// ULC
	public static void main(String[] args) {
		System.out.println("properties of son1");
		Son1 s1=new Son1();
		s1.mobile();
		s1.home();
		s1.money();
	
		System.out.println("properties of son2");
		Son2 s2=new Son2();
		s2.bike();
		s2.home();
		s2.money();
		
		System.out.println("properties ofson3");
		Son3 s3=new Son3();
		s3.laptop();
		s3.home();
		s3.money();


	}
}