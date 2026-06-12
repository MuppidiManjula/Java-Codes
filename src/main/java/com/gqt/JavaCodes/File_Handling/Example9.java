package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;
import java.util.Collections;

public class Example9 {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohith");
	al.add("virat");
	al.add("bumrah");
	System.out.println(al);
	System.out.println("-----------");
	Collections.sort(al);
	System.out.println(al);
}
}
