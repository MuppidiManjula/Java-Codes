package com.gqt.JavaCodes.File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
public static void main(String[] args) throws FileNotFoundException,IOException {
	String p1="C:\\IOPrgms\\Input1.txt";
	String p2="C:\\IOPrgms\\Output1.txt";
	
	FileReader fr=new FileReader(p1);
	int temp;
	FileWriter fw=new FileWriter(p2);
	
	while((temp=fr.read())!=-1) {
		fw.write(temp);
	}
	
	fw.close();
	fr.close();
}
}
