package iodemo;
import java.io.*;
import java.util.stream.Stream;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileReader reader = new FileReader("C://Users//SAKSHAYA//Documents//my file.txt");
			BufferedReader buffer=new BufferedReader(reader);
			String c;
			while((c=buffer.readLine())!=null){
			System.out.println(c);
			}
			
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}

	}

}
