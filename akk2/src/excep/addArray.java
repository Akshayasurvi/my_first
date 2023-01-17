package excep;

public class addArray {
	public void addnumbers(int size){
		
	int[] arr={1,2,3,4,5,6,7,8};
	try{
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Size of the array should not exceed index value");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addArray obi=new addArray();
		obi.addnumbers(9);
		

	}

}
