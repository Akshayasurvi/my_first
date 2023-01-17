package iodemo;
import java.io.*;

public class InputOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStream i=System.in;
			OutputStream o=System.out;
			byte[] bt=new byte[100];
			i.read(bt);
			String str="I am fine. what's upp";
			
		}
		catch(IOException e){
			System.out.println(e);
		}

	}

}
