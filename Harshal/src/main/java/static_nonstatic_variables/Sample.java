package static_nonstatic_variables;

public class Sample {// class body open
	static int i=20;//static global variable
    int j=30;//non static global variable
    public static void main(String[] args) {// main method body open
    	System.out.println(i);// since i is static variable so that we can print it directly
    	Sample s=new Sample();
    	
    	System.out.println(s.j);//20
		
	}// main method closed
    

    
}// class body closed


