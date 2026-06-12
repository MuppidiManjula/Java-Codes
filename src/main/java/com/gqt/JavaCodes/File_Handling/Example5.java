package com.gqt.JavaCodes.File_Handling;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ArrayList<String> al =new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("rohith");
		al.add("virat");
		al.add("bumrah");
		System.out.println(al);
		int count=0;
		for(int i=0;i<al.size();i++) {
			if(al.get(i).length()==5) {
				count++;
			}
		}
		System.out.println(count);
	}

}
