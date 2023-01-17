package mypackage;

public class Area {
	void area_of_circle(float r){
		float pi=3.14f;
		float a=pi*r*r;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj=new Area();
		obj.area_of_circle(2.17f);

	}

}
