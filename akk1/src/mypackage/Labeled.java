package mypackage;

public class Labeled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str={
				{"Car","Truck","Lorry"},
				{"Bike","Scooter"}
				
		};
		outer:
		for(String[] s: str)
		{
			for(String a:s)
			{
				//System.out.println(a+" ");
				if(a.equals("Lorry"))
				{
					break outer;
				}
				System.out.println(a);
				
			}
			//System.out.println(s+" ");
			
		}
		

	}

}
