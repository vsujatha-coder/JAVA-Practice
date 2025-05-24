package com.flm;

import java.io.*;
import java.net.*;

public class client1 {
	
	public static void main(String[] args) throws InterruptedException {
		try {
			//connect to server
			//declare Socket
			//initialize port number-5000 in localhost
			
			Thread.sleep(8000);
			Socket s = new Socket("localhost",3005);
		
			//create input output streams
			
			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter output = new PrintWriter(s.getOutputStream(),true);
			
			//send message to server and read reply
			output.println("Hello from client");
			String reply = input.readLine();
			System.out.println("server says : "+reply);
			
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			
			String clientMsg, serverMsg;
			while(true) {
				System.out.print("You : ");
				clientMsg = console.readLine();
				output.println(clientMsg);
				if(clientMsg.equalsIgnoreCase("exit")){
					break;
				}
				serverMsg = input.readLine();
				if(serverMsg.equalsIgnoreCase("exit")) {
					break;
				}
				System.out.println("server : "+serverMsg);
				}
			
			//close connections
			s.close();
			input.close();
			output.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

