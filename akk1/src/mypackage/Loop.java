package mypackage;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0, n=1, c=1;
		while(c<=10)
		{
			if(n%2==0){
				s+=n;
				c++;
			}
			n++;
		}
		System.out.println(s);

	}

}
