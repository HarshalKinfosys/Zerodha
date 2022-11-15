package Exception_Handling;

public class SIOOBE {// String index out of bounds exception
	public static void main(String[] args) {
		//throw Throwable {
			String s1="velocity";
	try {
	System.out.println(s1.charAt(8));//we are trying to fetch data which is not present
			}
	catch(StringIndexOutOfBoundsException a) {
		System.out.println("Idiot there is no data u are trying to fetch");
	}
	//Thread.sleep(3000);
			
		
	
		
}
}
