package test.gry;

import java.io.*;

public class BufferReadTest {

	public static void main(String[] args) {
		String line;
		String file = "files/buffer.txt";
		int cnt = 0;
		try {
			FileReader fReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fReader);
			while ( (line = bufferedReader.readLine()) != null ) {
				cnt++;
				System.out.println(line);
			}
			System.out.println("line in all : " + cnt);
			bufferedReader.close();
		} catch (IOException io) {
			System.out.println( io );
		}
	}

}
