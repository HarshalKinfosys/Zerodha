package Variables_program;

public class Global_without_initialization { // class is started
	static byte b;// only declared
	static short s;
	static int i;
	static long l;
	static double d;
	static float f;
	static char ch;
	static boolean j;
	static String k;
	
	public static void main(String[] args) {
		
		System.out.println(b);//0
		System.out.println(s);//0
		System.out.println(i);//0
		System.out.println(l);//0
		System.out.println(d);//0.0
		System.out.println(f);//0.0
		System.out.println(ch);//empty
		System.out.println(j);//false
		System.out.println(k);//null
	
	}// main method closed
	
	
}// class is closed
