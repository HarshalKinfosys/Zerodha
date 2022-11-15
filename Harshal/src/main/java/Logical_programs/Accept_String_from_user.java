package Logical_programs;

import java.util.Scanner;

public class Accept_String_from_user {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Hey user enter name");//get string from user
		String name=s.next();
		System.out.println(name);
	}

}

