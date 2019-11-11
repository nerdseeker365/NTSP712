import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListArrayTestListIterator {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		list.add(true);					//length variable for Array to calculate size
		list.add(4.3f);					//length() method for String to calculate size
		//size() method for collection to calculate size 
		ListIterator<Object> li=list.listIterator();
		System.out.println("In forward Direction\n");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("In forward Direction\n");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
