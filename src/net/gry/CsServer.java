package net.gry;

import java.io.*;
import java.net.*;

public class CsServer {

	public static void main(String[] args) {
		ServerSocket server = null;
        Socket you = null;
        String s = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        try{
            server = new ServerSocket(4441);
        }catch(IOException e1){
            System.out.println("ERROR:" +e1);
        }
        while(true) {
        	try{
                you = server.accept();
                in = new DataInputStream(you.getInputStream());
                out = new DataOutputStream(you.getOutputStream());
                while(true){
                    s = in.readUTF();
                    if(s!=null) break;
                }
                if( s != null )
                {
                	System.out.println( "recvived : " + s );
                    s = null;
                    out.writeUTF("hello, I am server");
                    out.close();
                    in.close();
                    you.close();
                }
            }
            catch(IOException e) {
            	System.out.println("ERROR:"+e);
            }
        }
        
	}

}
