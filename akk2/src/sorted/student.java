package sorted;

public class student implements Comparable<student>{
	String studentName;
	  float marks;
	   public student(String studentName,float marks) 
	{ 
	this.studentName=studentName;
	this.marks=marks;
	} 
	public String toString()
	{ 
	return studentName+","+marks;
	}
	public int compareTo(student s ){
		if(marks == s.marks){
			return 0; 
		}else{
			if(marks<s.marks){
				return -1;
			}
			else{
				return 1;
			}
		}
	}

}
