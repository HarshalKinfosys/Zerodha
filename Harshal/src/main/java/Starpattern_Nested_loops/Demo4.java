package Starpattern_Nested_loops;


public class Demo4 {
	public static void main(String[] args) {
		int space=0;
		int star=5;
		for(int i=1;i<=5;i++) {// for row
			for(int j=1;j<=space;j++) {// for coloumn
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		
			space++;
			star--;
			
		}
	}

	}

