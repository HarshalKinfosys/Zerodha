package Exception_Handling;

public class Finally {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("I am from try block");
		}
		catch(ArithmeticException h) {
			System.out.println("Idiot enter valid denominator");
			System.out.println("Exception is handled");
		}
		finally {
			System.out.println("Thank you for using ATM");
		}
	}

}
