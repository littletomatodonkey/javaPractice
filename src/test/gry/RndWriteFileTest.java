package test.gry;

import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RndWriteFileTest {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String string = b.readLine();
		RandomAccessFile file = new RandomAccessFile("./files/log.log", "rw");
		file.seek(file.length());
		file.writeBytes(string + "\n");
		file.close();
	}

}
