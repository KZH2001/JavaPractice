package readFile;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\MSI\\Downloads\\note.txt";
		
	try(BufferedReader reader = new BufferedReader(new FileReader(path))){
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	
	}catch(FileNotFoundException e) {
		System.out.print("File not found");
	}catch(IOException e) {
		System.out.print("Something went wrong");
	}
	

	}

}
