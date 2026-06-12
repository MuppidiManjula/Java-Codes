package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;

public class Example3 {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohith");
	al.add("virat");
	al.add("bumrah");
	System.out.println(al);
	ArrayList<String> res =new ArrayList<String>();
	for(int i=0;i<al.size();i++) {
			res.add(al.get(i).toUpperCase());
		}
	System.out.println(res);
}
}
