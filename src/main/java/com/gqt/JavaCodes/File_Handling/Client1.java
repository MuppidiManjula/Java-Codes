package com.gqt.JavaCodes.File_Handling;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client1 {
	public static void main(String[] args) throws IOException {
		Socket csoc=new Socket("92.168.110.115",4000);
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message from client:");
		String message=sc.nextLine();
		dos.writeUTF(message);
		csoc.close();
		sc.close();
	}
	}

