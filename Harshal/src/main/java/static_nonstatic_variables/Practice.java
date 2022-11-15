package static_nonstatic_variables;

public class Practice {// class body open
	static char c='H';
	long d=123456789l;
	static int i=100;
	double d1=20.5;

	public static void main(String[] args) {
	System.out.println(c);
	System.out.println(i);
	
	Practice p=new Practice();
	System.out.println(p.d);
	System.out.println(p.d1);	
	
	}	// main method close
	}// class body close
	


