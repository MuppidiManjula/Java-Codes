package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;

public class Example6 {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohith");
	al.add("virat");
	al.add("bumrah");
	System.out.println(al);
	long count=al.stream().filter(s->s.length()==5).count();
	System.out.println(count);
}
}
