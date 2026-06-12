package com.gqt.JavaCodes.File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
public static void main(String[] args) throws FileNotFoundException,IOException {
	String p1="C:\\IOPrgms\\Input2.txt";
	String p2="C:\\IOPrgms\\Output2.txt";
	
	FileReader fr=new FileReader(p1);
	BufferedReader br=new BufferedReader(fr);
	int temp;
	FileWriter fw=new FileWriter(p2);
	BufferedWriter bw=new BufferedWriter(fw);
	
	while((temp=br.read())!=-1) {
		bw.write(temp);
	}
	
	bw.close();
	br.close();
	fw.close();
	fr.close();
}
}
