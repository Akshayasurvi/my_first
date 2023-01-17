package collectionDemo;
import java.util.*;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put("E001", "Peter");
		m.put("E002", "Simond");
		m.put("E003", "Edgar");
		m.put("E004", "Mathew");
		m.put("E005", "Erric");
		System.out.println(m.get("E003"));
		Set set=m.keySet();
		for(Object o:set){
			System.out.println(o+" "+m.get(o));
		}
		//System.out.println(m);
		Set s=m.entrySet();
		for(Object n:s){
			System.out.println(n);
		}
		//System.out.println(m);

	}

}
