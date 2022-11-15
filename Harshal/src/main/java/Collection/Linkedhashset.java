package Collection;

import java.util.LinkedHashSet;

public class Linkedhashset {
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("Harshal");
		lhs.add(500);
		lhs.add('H');
		lhs.add(200);
		lhs.add(null);
		lhs.add(null);
		// print entire data
		System.out.println(lhs);
		// size
		System.out.println(lhs.size());
		//empty
		System.out.println(lhs.isEmpty());
		
		
		
	}

}
