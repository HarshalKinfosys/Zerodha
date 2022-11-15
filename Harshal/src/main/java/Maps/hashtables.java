package Maps;

import java.util.Hashtable;

public class hashtables {
	public static void main(String[] args) {
		Hashtable<Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(101,"Harshal");//1st entry
		t.put(102,"Bablu");
		t.put(103,"Chanda");
		t.put(104,"Dhanush");
		//print all data
		System.out.println(t);
		//remove any one entry
		t.remove(102);
		System.out.println(t);
	}

}
