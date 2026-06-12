package com.gqt.JavaCodes.File_Handling;
import java.io.*;
public class Program12_File_Builtin {
public static void main(String[] args) throws IOException {
	String p1="C:\\IOPrgms\\File1.txt";
	File f1=new File(p1);
	f1.createNewFile();
	System.out.println(f1.exists());//checks if a path exists or not
	System.out.println(f1.canExecute());//checks if the file have right to execute
	System.out.println(f1.canWrite());//checks if the file have right to write
	System.out.println(f1.canRead());//checks if the file have right to read
	System.out.println(f1.getAbsoluteFile());// Returns the absolute file path
	System.out.println(f1.getCanonicalPath());// Returns the canonical path
	System.out.println(f1.getFreeSpace());// Returns the number of unallocated bytes 
	System.out.println(f1.getName());//Returns the name of the file
	System.out.println(f1.getParent());// Returns the parent directory path
	System.out.println(f1.getPath());//Returns the path of the file
	System.out.println(f1.getTotalSpace());//Returns the total space
	System.out.println(f1.getUsableSpace());//Returns the usable space
	System.out.println(f1.hashCode());//Returns the hash code 
	System.out.println(f1.isAbsolute());//Checks Whether the path is absolute
	System.out.println(f1.isDirectory());//Checks whether the path represents a directory
	System.out.println(f1.isFile());//Checks whether the path represents a file
	System.out.println(f1.isHidden());//Checks whether the file is hidden
	File f2=new File("C:\\IOPrgms\\hidden.txt");
	System.out.println(f2.isHidden());
	System.out.println(f1.lastModified());//Returns the last modified time in long
	System.out.println(f1.length());//Returns the number of characters in the file
//	File f3=new File("F:\\IOPrgms\\File2.txt");
//	System.out.println(f1.renameTo(f3));
//	System.out.println(f1.exists());
}
}
