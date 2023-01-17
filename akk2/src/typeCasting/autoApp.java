package typeCasting;

public class autoApp {
	public void accept(vehicle v){
		if(v instanceof vehicle){
			car a=(car)v;
			a.setDetails();
			a.displayDetails();
		}
		else{
			v.setDetails();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		autpApp obj=new autoApp();
		vehicle v=new vehicle();
		obj.accept(v);
		

	}

}
