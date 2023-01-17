package iodemo;
import java.io.*;

public class StudentDetails implements Serializable {
	String studentName;
	int rollNo;
	public StudentDetails(String studentName, int rollNo){
		this.studentName=studentName;
		this.rollNo=rollNo;
	}
	public void printDetails(){
		System.out.println("Student name: "+studentName);
		System.out.println("Roll no: "+rollNo);
	}

}
