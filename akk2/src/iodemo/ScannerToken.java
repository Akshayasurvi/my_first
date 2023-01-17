package iodemo;
import java.util.*;

public class ScannerToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Peter told Harry, what Harry told to sam that sam has heard from peter";
		Scanner sc=new Scanner(str).useDelimiter(",");
		while(sc.hasNext()){
			System.out.println(sc.next());
		}
		Scanner s=new Scanner(str).;

	}

}
