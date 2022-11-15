package Method_Overriding;

public class method_overriding {//ULC
	public static void main(String[] args) {
		System.out.println("Take talk of cat");
		Cat c=new Cat();
		c.talk();
		
		System.out.println("Take talk of Dog");
		Dog d=new Dog();
		d.talk();
	}

}
