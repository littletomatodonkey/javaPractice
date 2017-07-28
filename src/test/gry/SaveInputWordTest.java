package test.gry;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SaveInputWordTest {

	public static void main(String[] args) {
		char ch;
		int data;
		try {
			FileInputStream fileInputStream = new FileInputStream(FileDescriptor.in);
			FileOutputStream fileOutputStream = new FileOutputStream("files/screenTxt.txt");
			System.out.println("please input text and end with #");
			while ( (ch = (char)fileInputStream.read()) != '#' ) {
				fileOutputStream.write(ch);
			}
			fileInputStream.close();
			fileOutputStream.close();
			System.out.println();
			
			FileInputStream c = new FileInputStream("files/screenTxt.txt");
			FileOutputStream d = new FileOutputStream(FileDescriptor.out);
			while ( c.available() > 0 ) {
				data = c.read();
				d.write(data);
			}
			c.close();
			d.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
