package Collection;

import java.util.LinkedList;

public class Link_list {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Ganesh");
		ll.add(100);
		ll.add('H');
		ll.add(null);
		ll.add(null);
		ll.add(100);
		// print entire data
		System.out.println(ll);
		// get the size
		System.out.println(ll.size());
		//check whether it is empty
		System.out.println(ll.isEmpty());
		//insertion operation(right shift)
		 ll.add(1,"Suresh");
		 System.out.println(ll);
		 //deletion operation (left shift)
		 ll.remove(1);
		 System.out.println(ll);
	}

}
