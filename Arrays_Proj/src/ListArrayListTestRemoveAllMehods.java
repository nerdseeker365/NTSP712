import java.util.ArrayList;
import java.util.List;

public class ListArrayListTestRemoveAllMehods {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("Sankar");
		list.add(123l);
		list.add(2.3f);
		list.add(1234);
		list.remove(new Integer(1234));
		//list.add(2.3f);
		//list.remove(0);//index position using remove element
		//list.remove("Sankar");//element position using remove element
		//list.remove(2.3f);
		//list.remove(123l);//if we want to remove integer value use literals 
		System.out.println(list);
//		List<Object> list1 = new ArrayList<>();
//		list1.add("Sankar");
//		list1.add(123l); 
//		list1.removeAll(list);
//		System.out.println(list1);
	}

}
