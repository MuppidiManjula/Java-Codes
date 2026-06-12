package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al =new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("rohith");
		al.add("virat");
		al.add("bumrah");
		System.out.println(al);
		System.out.println("------------");
		String min=al.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("The minimum valued string is:"+min);
		String max=al.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("The maximum valued string is:"+max);
	}

}
