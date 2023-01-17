package mypackage;

public class Ticket {
	String source;
	String destination;
	double price;
	Ticket(String s, String d, double p){
		source=s;
		destination=d;
		price=p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket obj=new Ticket("akk", "kkk", 1000);
		System.out.println(obj.source + obj.destination + obj.price);
		

	}

}
