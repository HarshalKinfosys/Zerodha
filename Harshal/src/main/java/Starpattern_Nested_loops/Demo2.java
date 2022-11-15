package Starpattern_Nested_loops;

public class Demo2 {
	public static void main(String[] args) {
		int star=5;
		for(int i=1;i<=5;i++) {//rows
			for(int j=1;j<=star;j++) {
				System.out.print("*");
		
			}
			System.out.println();// cursor goes to next line
			star--;
		}
	}

}
