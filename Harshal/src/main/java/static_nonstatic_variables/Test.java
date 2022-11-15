package static_nonstatic_variables;

public class Test {// class body open 
	static int i=50;
	long d=123456789l;
	static char c='H';
	String s="Velocity";
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(c);
		
		
		Test t=new Test();
		System.out.println(t.d);
		System.out.println(t.s);
	}

}
