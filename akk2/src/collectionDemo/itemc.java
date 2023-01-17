package collectionDemo;
import java.util.*;

public class itemc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<item> i=new HashSet<item>();
		i.add(new item("Bag",100));
		i.add(new item("Pen",10));
		Iterator<item> n=i.iterator();
		while(n.hasNext()){
			item e=n.next();
			System.out.println(e);
		}

	}

}
