package com.gqt.JavaCodes.File_Handling;

//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program13_Try {
public static void main(String[] args) {
	try {
		//Write
		String p1="C:\\IOPrgms\\File1.txt";
		FileWriter fw=new FileWriter(p1);
		fw.write("Hello Welcome to GQT");
		fw.close();
		
		//Read
		System.out.println("Reading the data from the file");
		FileReader fr=new FileReader(p1);
		Scanner sc=new Scanner(fr);
		while(sc.hasNextLine()) {
			String temp=sc.next();
			System.out.print(temp);
		}
		sc.close();
		fr.close();
	}
//		Delete Operation
//		File file = new File(p1);
//		if (file.delete()) {
//			System.out.println("\n\nFile deleted successfully");
//			} else {
//				System.out.println("\n\nFailed to delete the file");
//				}
//		}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
