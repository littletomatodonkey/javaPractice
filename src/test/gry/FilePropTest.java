package test.gry;

import java.io.*;

public class FilePropTest {

	public static void main(String[] args) throws IOException {
		String name;
		System.out.println("please input a path....");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        name = bufferedReader.readLine();
        File file = new File(name);
        if( file.isDirectory() )
        {
            File fl[] = file.listFiles();
            System.out.println("number of files : " + fl.length);
            for(int i =0;i<fl.length;i++)
            {
                if( !fl[i].isHidden() )
                {
                    System.out.println(fl[i].getName());
                }
            }
        }
        else if( file.isFile() )
        {
            System.out.println( name + " is a file" );
            System.out.println("================");
            System.out.println("absolute path£º"+file.getAbsolutePath());
            System.out.println(file.canRead()?"can be read":"can not be read");
            System.out.println(file.canWrite()?"can be modified":"can not be modified");
        }
        else {
			System.out.println(name + " is not a file or a dir");
		}
	}

}
