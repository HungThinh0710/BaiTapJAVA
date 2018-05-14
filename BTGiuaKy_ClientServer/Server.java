package clientserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread  {
	public class tread extends Thread{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(9005);
	         System.out.print("Server Waiting.");
	         Socket incoming = serverSocket.accept();
	         System.out.print("\nServer started.\n");
	         BufferedReader in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
			 BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
	         PrintWriter out = new PrintWriter(incoming.getOutputStream(), true /* autoFlush */);
	         System.out.println("Server");
			 out.println( "Hello! This is application for reverse String." );

	         boolean done = false;
	         while (!done) {  
				String fromClient = in.readLine();
				String reverse = new StringBuffer(fromClient).reverse().toString();
				System.out.println(fromClient);
				System.out.print("Server: ");
				out.println(reverse);
	         }
	         incoming.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
