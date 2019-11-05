package Iterator;
import java.util.ArrayList; 
import java.util.Iterator; 

public class FailFastDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 
		list.add(1); 
		list.add(2); 
		list.add(3); 
		list.add(4); 
		list.add(5); 
  
        Iterator<Integer> itr = list.iterator(); 
        while (itr.hasNext())
        {
            Integer integer = (Integer) itr.next();
             
            list.add(6);      //This will throw ConcurrentModificationException

        System.out.println(list); 
	}

	}
}