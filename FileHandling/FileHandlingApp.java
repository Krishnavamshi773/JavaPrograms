package FileHandling;
import java.io.File;
import java.io.IOException;

public class FileHandlingApp {

	public static void main(String[] args) {

		File file =new File("demo.txt");
		
		try {
			if(file.createNewFile())
				System.out.println("demo.txt file created");
			else
				System.out.println("There is some problem");
		}
		catch(IOException e) {
			 System.out.println("IO exception thrown");
		}
	}

}
