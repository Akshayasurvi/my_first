package string;

public class opp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="It is raining outside! Can I have a raincoat please";
		//s1=s1.toLowerCase();
		//System.out.println(s2);
		int count=0;
		char[] cstr = s1.toCharArray();
		for(char c:cstr){
			System.out.println(c);
		}
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='0'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'){
				count++;
			}
			
		}
		System.out.println("No. of vowels "+count);
		}
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		String s4=s1.replace("raincoat", "umbrella");
		System.out.println(s4);
		

	}

}
