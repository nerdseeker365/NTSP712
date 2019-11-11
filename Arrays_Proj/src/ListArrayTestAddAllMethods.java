import java.util.ArrayList;
import java.util.List;
public class ListArrayTestAddAllMethods {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		List<Object> list1=new ArrayList<>();
		list1.add("Sankar1");
		list1.add(1231);
		//list1.addAll(list);//adding elements to another list
		list1.addAll(0,list);//index based addAll elements to the another list
		for(Object o:list) {
			System.out.println(o);
		}
		System.out.println("\n");
		list1.forEach(a->{
			System.out.println(a);
		});
	}

}
