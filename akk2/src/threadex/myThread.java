package threadex;

public class myThread extends Thread{
	public void run(){
		try{
			for(int i=0;i<=10;i++){
				System.out.println(i);
				Thread.sleep(3000);
			}
			
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread n=new myThread();
		n.start();

	}

}
