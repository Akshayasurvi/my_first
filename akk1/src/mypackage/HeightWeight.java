package mypackage;

public class HeightWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] hw=new int[4][2];
		hw[0][0] =6;
		hw[0][1] =45;
		
		hw[1][0] =5;
		hw[1][1] =65;
		
		hw[2][0] =5;
		hw[2][1] =62;
		
		hw[3][0] =4;
		hw[3][1] =47;
		
		for(int[] x: hw)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
	

}
}
