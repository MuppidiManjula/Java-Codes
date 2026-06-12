package com.gqt.JavaCodes.File_Handling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
public static void main(String[] args) throws IOException {
	ServerSocket listener =new ServerSocket(4000);
	System.out.println("Server is ready to accept the data");
		Socket ssoc=listener.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		OutputStream os=ssoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			String message=dis.readUTF();
			System.out.println(message);
			System.out.println("-----------");
			System.out.println("Enter the response:");
			String res_message=sc.nextLine();
			dos.writeUTF(res_message);
		}

		ssoc.close();
		listener.close();
		sc.close();
}
}