package mypackage;

public class Discount {
	void price_discount(float price, float discount){
		float d=price-price*discount/100;
		System.out.println(d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount obj=new Discount();
		obj.price_discount(1500, 10);

	}

}
