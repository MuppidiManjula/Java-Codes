package com.gqt.JavaCodes.File_Handling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket csoc = new Socket("192.168.110.115", 4000);
        OutputStream os = csoc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = csoc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter message " + i + ":");
            String message = sc.nextLine();
            // Send message to server
            dos.writeUTF(message);
            // Receive response from server
            String response = dis.readUTF();
            System.out.println("Server Response: " + response);
            System.out.println("----------------------------");
        }
        csoc.close();
        sc.close();
    }
}