package test.gry;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteDatFileTest {

	public static void main(String[] args) {
		String fn = "files/datFile.dat";
		int v1 = 10, v2 = 0, v3 = -10;
		try {
			DataOutputStream dStream = new DataOutputStream(new FileOutputStream(fn));
			dStream.writeInt(v1);
			dStream.writeInt(v2);
			dStream.writeInt(v3);
			dStream.close();
			
			
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fn));
			int sum = 0;
			sum += dataInputStream.readInt();
			sum += dataInputStream.readInt();
			sum += dataInputStream.readInt();
			
			System.out.println("sum is : " + sum);
			dataInputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
