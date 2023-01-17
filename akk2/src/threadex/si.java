package threadex;

public class si extends Thread{
	public void simpleInterest(){
		System.out.println("Simple interest:"+(10000*10*1)/100);
	}
	public void run(){
		simpleInterest();
	}

}
