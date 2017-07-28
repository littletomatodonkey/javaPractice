package test.gry;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("files/write.txt");
			for(int i='A'; i<='Z';i++)
			{
				fileWriter.write(i);
			}
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
