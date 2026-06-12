package com.gqt.JavaCodes.File_Handling;
import java.io.*;
class Cricketer1 implements Serializable{
	private static final long serialVersionUID = 1L;
String name;
String country;
transient int runs;
int wickets;
transient int catches;
public Cricketer1(String name,String country,int runs,int wickets,int catches) {
	super();
	this.name=name;
	this.country=country;
	this.runs=runs;
	this.wickets=wickets;
	this.catches=catches;
}
void display() {
	System.out.println(name);
	System.out.println(country);
	System.out.println(runs);
	System.out.println(wickets);
	System.out.println(catches);
}
}
public class Program11_Selective_Serialization{
	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
//		 Serialization
//		Cricketer1 c1=new Cricketer1("Virat","INDIA",19000,20,300);
//		c1.display();
//		String p1="C:\\IOPrgms\\CricketerSecure.txt";
//		FileOutputStream fos=new FileOutputStream(p1);
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(c1);
//		oos.close();
		
		//De-Serialization
		String p1="C:\\IOPrgms\\CricketerSecure.txt";
		FileInputStream fis=new FileInputStream(p1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cricketer1 c1 =(Cricketer1)ois.readObject();
		c1.display();
		ois.close();
	}
}