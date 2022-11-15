package static_nonstatic_variables;

public class Demo {// class body open
	static String s="Harshal";
	String s1="Velocity";
	public static void main(String[] args) {
		System.out.println(s);
		
		Demo d=new Demo();
		System.out.println(d.s1);
	}

}
