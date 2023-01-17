package mypackage;

public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=9;
		if(t>5){
			System.out.println("Closing time");
		}
		else if(t>4){
			System.out.println("Meeting time");
		}
		else if(t>3){
			System.out.println("Marktet review");
		}
		else if(t>1){
			System.out.println("Lunch time");
		}
		else {
			System.out.println("Good morning");
		}

	}

}
