package sorted;
import java.util.*;

public class RevenueCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Revenue> s=new TreeSet(new sortByAmount());
		s.add(new Revenue("rent",6000));
		s.add(new Revenue("interest",60));
		s.add(new Revenue("xyz",1200));
		System.out.println(s);

	}

}
