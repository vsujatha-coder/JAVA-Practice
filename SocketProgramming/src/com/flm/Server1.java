package com.flm;

import java.io.*;
import java.net.*;

public class Server1 {
	
	public static void main(String[] args) {
		 try {
			 //create ServerSocket//5000 port number
			 ServerSocket ss= new ServerSocket(3005);
			 System.out.println("server is waiting for client");	 
			 //accept client connection
			 //using Socket
			 
			 Socket s = ss.accept();
			 System.out.println("client connected");
			 
			 //create input output streams
			 //using BufferedReader
			 
			 BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			 
			 PrintWriter output = new PrintWriter(s.getOutputStream(),true);
			 
			 //read message from client and respond
			 
			 String message = input.readLine();
			 System.out.println("client says : "+message);
			 output.println("Hello from server..");
			 
			 BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			 
			 String clientMsg, serverMsg;
			 while(true) {
				 clientMsg = input.readLine();
				 if(clientMsg.equalsIgnoreCase("exit")) {
					 break;
				 }
				 System.out.println("client : "+clientMsg);
				 System.out.print("You : ");
				 serverMsg = console.readLine();
				 output.println(serverMsg);
				 if(serverMsg.equalsIgnoreCase("exit")){
					break;
				 }
					 
			 }
			 
			 
			 
			 
			 //close all connections
			 
			 input.close();
			 output.close();
			 s.close();
			 ss.close();
			 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
	}

}
