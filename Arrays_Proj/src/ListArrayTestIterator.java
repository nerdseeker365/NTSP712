import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListArrayTestIterator {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		list.add(true);					
		list.add(4.3f);	
		//Iterator itr=list.iterator();
	Iterator<Object> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
