package InterestCalculator;

public class calculatorApp {
	public void getAmount(intrest_calculator obj){
		System.out.println(obj.simpleInterest(13000,3,4));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatorApp n=new calculatorApp();
		n.getAmount((a,b,c)->a*b*c/100);
		

	}

}
