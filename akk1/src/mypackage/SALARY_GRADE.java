package mypackage;

public class SALARY_GRADE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='C';
		switch (grade){
		case 'A':
			System.out.println("35000");
			break;
		case 'B':
			System.out.println("30000");
			break;
		case 'C':
			System.out.println("25000");
			break;
		case 'D':
			System.out.println("15000");
			break;
		case 'E':
			System.out.println("9000");
			break;
		default:
			System.out.println("Please select grade between A to E");
		}
		int x=10;
		int y=++x + ++x + x++;
		System.out.println(x);
		System.out.println(y);

	}

}
