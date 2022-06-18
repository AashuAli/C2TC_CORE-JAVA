package ExpectionHandlersPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Vital {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fh = null;
		
		try {
			fh = new FileInputStream("C:\\Users\\aashu\\OneDrive\\Desktop\\Vital.txt");
			int k;
		
		 	try {
		 		while((k = fh.read()) != -1) {
		 			System.out.print((char)k);
		 		}
		 	}catch(IOException e) {
		 		System.out.println("Vital words would not be read");
		 	}finally {
				fh.close();
			}
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}