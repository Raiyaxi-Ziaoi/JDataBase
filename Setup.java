package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.File;

public class Setup {
	
	public static final String IP = "IP";
	public static final int PORT = 1234;
	
	public static void setup() throws UnknownHostException, IOException {
		try (var s = new Socket(IP, PORT)) {  
			new File("Server").mkdir(); // Creates folder called "Server"
			// var pr = new PrintWriter(s.getOutputStream());
			// Setup goes here
		}
	}
	
}
