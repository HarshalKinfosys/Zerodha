package Collection;

import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Ganesh");
	v.add(100);
	v.add('H');
	v.add(100);
	v.add(null);
	v.add(null);
	//print all data
	System.out.println(v);
	//check the size
	System.out.println(v.size());
	//empty
	System.out.println(v.isEmpty());
	//insertion operation
	v.add(3,500);
	System.out.println(v);// right shift
	//deletion operation
	v.remove(3);
	System.out.println(v);//left shift
}
}
