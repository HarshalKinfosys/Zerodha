package NSM_CALL_FROM_DIFFRENT_CLASS;

public class A {// ULC
	public static void main(String[] args) {
		System.out.println("main method started");
		
		B b=new B();
		b.t1();
		b.t2();
		
		System.out.println("main method ended");
	}

	
}
