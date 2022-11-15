package Starpattern_Nested_loops;

public class Demo1 {
	public static void main(String[] args) {
		int star=1;
		for(int i=1;i<=5;i++) {//outer for loop for rows
			for(int j=1;j<=star;j++) {// inner for loop for coloumn
				System.out.print("*");
			}
			System.out.println();//cursor goes to next line
			star++; //incremental by one
				
			}
		}
	}


