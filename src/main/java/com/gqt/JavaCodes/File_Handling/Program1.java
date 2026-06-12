package com.gqt.JavaCodes.File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {
public static void main(String[] args) throws FileNotFoundException,IOException {
	String p1="C:\\IOPrgms\\Input.txt";
	String p2="C:\\IOPrgms\\Output.txt";
	
	FileInputStream fis=new FileInputStream(p1);
	int temp;
	FileOutputStream fos=new FileOutputStream(p2);
	
	while((temp=fis.read())!=-1) {
		fos.write(temp);
	}
	
	fos.close();
	fis.close();
}
}
