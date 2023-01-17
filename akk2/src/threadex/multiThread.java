package threadex;

public class multiThread extends Thread {
	String name="xyz";
	int dp;
	int op=1000;
	int d=5;
	public void run(){
		System.out.println(name);
		System.out.println(op-(op*d/100));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiThread t1=new multiThread();
		multiThread t2=new multiThread();
		

	}

}
