package test.gry;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class FileCompressionTest {
	
	static String names[] = {"files/log.log"};

	public static void main(String[] args) throws Exception {
		FileOutputStream a = new FileOutputStream("files/test.zip");
		ZipOutputStream out = new ZipOutputStream( new BufferedOutputStream(a) );
		for(int i=0;i<names.length;i++)
		{
			System.out.println( "writing file : " + names[i] );
			BufferedInputStream in=new BufferedInputStream(new FileInputStream(names[i]));
            out.putNextEntry(new ZipEntry(names[i])); 
            int b;
            while((b=in.read())!=-1)
                out.write(b);  
            in.close();
		}
		out.close();
		
		System.out.println("reading file...");
		FileInputStream d=new FileInputStream("files/test.zip");
        ZipInputStream  inout=new  ZipInputStream(new BufferedInputStream(d));
        ZipEntry z;
        
        while((z=inout.getNextEntry())!=null){ 
            System.out.println("Reading file : "+z.getName());
            int x;
            while((x=inout.read())!=-1)
                System.out.write(x);
            System.out.println();
        }
        inout.close();
	}

}
