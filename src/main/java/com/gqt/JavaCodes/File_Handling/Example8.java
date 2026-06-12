package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(467);
		al.add(1);
		al.add(98);    
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		System.out.println("-----------------");
		List<Integer> res=al.stream().sorted().collect(Collectors.toList());
		System.out.println(res);
	}

}
