package this_super_keyword;

public class B extends A {// BLC
	int b=60;
	public void test() {
		System.out.println(this.b);
		System.out.println(super.a);
	}

}
