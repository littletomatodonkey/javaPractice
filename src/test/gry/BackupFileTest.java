package test.gry;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BackupFileTest {

	public static void main(String[] args) throws IOException {
		FileInputStream a = new FileInputStream("files/screenTxt.txt");
		FileOutputStream b = new FileOutputStream("files/screenTxt_backup.txt");
		
		System.out.println("file size is : " + a.available());
		byte c[] = new byte[a.available()];
		a.read(c);
		b.write(c);
		
		a.close();
		b.close();
	}

}
