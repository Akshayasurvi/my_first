package sorted;
import java.util.*;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> n=new TreeSet<>();
		n.add(23);
		n.add(45);
		n.add(11);
		n.add(19);
		n.add(55);
		n.add(22);
		n.add(18);
		n.add(32);
		Integer k=n.ceiling(20);
		System.out.println(k);
		Integer l=n.floor(15);
		System.out.println(l);
		Integer a=n.higher(50);
		System.out.println(a);
		Integer b=n.lower(25);
		System.out.println(b);
		System.out.println(n.descendingSet());
	}

}
