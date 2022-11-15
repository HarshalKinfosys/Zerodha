package main_method;

public class Execution {
public static void main(String[] args) {// main method body open
	System.out.println("Hi good morning");
	System.out.println("main method started");
	System.out.println("first");
	System.out.println("second");
	System.out.println("third");
}// main method body close

static {//SIB body open
	System.out.println("I will execute before the execution of main method");
}//SIB BODY CLOSE
}
