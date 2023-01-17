package thr;

public class SimpleInterest {
	public void calculate(float p,float r,float t)throws Exception{
		if(p==0||r==0||t==0){
		throw new Exception("Don't enter zero");
		}
		else if(p<1000){
			throw new Exception("p should be greater than 1000");
		}
		else{
			System.out.println(p*r*t/100);
		}
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SimpleInterest obj=new SimpleInterest();
		try{
			obj.calculate(10, 10, 1);
		}
		catch (Exception e){
			
			System.out.println(e);
		}

	}

}
