package string;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="My name is Akshaya";
		//char[] c = s1.toCharArray();
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'){
				count++;
			}
			System.out.println(count);
		}
		

	}

}
