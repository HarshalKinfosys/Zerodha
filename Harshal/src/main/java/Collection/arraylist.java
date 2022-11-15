package Collection;

import java.util.ArrayList;

public class arraylist {// dont confuse here we are talking abt inbuilt class
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Harshal");
		al.add(100);
		al.add('H');
		al.add(100);
		al.add(null);
		al.add(null);
		// print all data in class
		System.out.println(al);
		// get the size
		System.out.println(al.size());//6
		// check whether it is empty
		System.out.println(al.isEmpty());//false
		//insertion operation
		al.add (3,500);
		System.out.println(al);
		// deletion operation
		 al.remove(3);
		 System.out.println(al);
		
		
	}

}
