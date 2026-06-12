package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		System.out.println("-----------------");
		al.stream().forEach(i->System.out.println(i));
		System.out.println("------------------");
		al.stream().forEach(System.out::println);
	}
}