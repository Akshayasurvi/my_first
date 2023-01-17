package iodemo;
import java.io.*;

public class createFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		File f=new File("C://Users//SAKSHAYA//Documents//samplefile.txt");
		if(f.exists()){
			System.out.println("File exists");
		}
		else{
			if(f.createNewFile()){
				System.out.println("file created");
			}
			else{
				System.out.println("file not created");
			}
		}
		System.out.println("Name of the file "+f.getName());
		System.out.println("Absolute path of the file "+f.getAbsolutePath());
		File fd=new File("c:");
		File[] flist=fd.listFiles();
		for(File file:flist){
			System.out.println(file.getName());
			if(file.isFile()){
				System.out.println("is a file");
			}
			if(file.isDirectory()){
				System.out.println("is a directory");
				
			}
		}
		File f1=new File("C://Users//SAKSHAYA//Documents//sampledir.txt");
		if(f1.exists()){
			System.out.println("exists");
		}
		else{
			if(f1.mkdir()){
				System.out.println("created");
			}
			else{
				System.out.println("not created");
			}
		}

	}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
