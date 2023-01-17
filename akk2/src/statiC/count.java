package statiC;

public class count {
	static int a=0;
	static void c(){
		a++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count a1=new count();
		a1.c();
		count a2=new count();
		a2.c();
		System.out.println(a);

	}

}
