package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohith");
	al.add("virat");
	al.add("bumrah");
	System.out.println(al);
	List<String> res=al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
	System.out.println(res);
}
}
