package threadapp;

public class charThread extends Thread{
	char c;
	public void printChar(){
		for(c='A';c<='Z';++c){
			System.out.print(Thread.currentThread().getName()+c);
		}
	}
	public void run(){
		//try{
		printChar();
		//Thread.currentThread().join();
		//}
		////catch(Exception e){
			
		//}
	}

}
