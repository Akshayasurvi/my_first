package mypackage;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] strarr ={
				{"Peter","Simond","Edgar"},
				{"Harry","Mathew","Stephen"},
				{"Jason","Erric","Jasmin"}
		};
		for(String[] s:strarr)
		{
			for(String a:s)
			{
				if(a.equals("Simond")||a.equals("Erric"))
				{
					System.out.println(a);
				}
				
			}
		}

	}

}

