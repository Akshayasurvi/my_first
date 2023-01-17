package threadex;
import java.util.*;

public class customerDetails extends Thread{
	public void acceptDetails(){
	Scanner sc=new Scanner(System.in);
	String n=sc.nextLine();
	String a=sc.nextLine();
	System.out.println(n);
	System.out.println(a);
	}
	public void run(){
		acceptDetails();
	}

}
