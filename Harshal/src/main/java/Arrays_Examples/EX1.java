package Arrays_Examples;

public class EX1 {
	public static void main(String[] args) {
		String ar[]=new String[5];
		ar[0]="Samantha";
		ar[1]="Rashmika";
		ar[2]="Sai Pallavi";
		ar[3]="Niveda Thomas";
		ar[4]="Kirthy Suresh";
		//print samantha
		//System.err.println(ar[0]);
		//print sai pallavi
		//System.out.println(ar[2]);
		// i want to print entire data in given array 
		for(int i=0;i<=4;i++) {
			System.out.println(ar[i]);
		}
	}
}

