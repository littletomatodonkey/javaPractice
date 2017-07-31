package net.gry;

import java.io.*;  
import java.net.*; 

public class AcClient {
	
	Socket socket;  
    BufferedReader in;  
    PrintWriter out;  
  
    public AcClient()   
    {  
        try   
        {  
            socket = new Socket("127.0.0.1", 10000);  
              
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
            out = new PrintWriter(socket.getOutputStream(), true);  
            BufferedReader line = new BufferedReader(new InputStreamReader(System.in));  
  
            out.println(line.readLine());  
              
            line.close();  
            out.close();  
            in.close();  
              
            socket.close();  
              
        } catch (IOException e) {  
        }  
    }  

	public static void main(String[] args) {
		new AcClient();
	}

}
