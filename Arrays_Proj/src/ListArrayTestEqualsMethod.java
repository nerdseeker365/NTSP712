import java.util.ArrayList;
import java.util.List;
public class ListArrayTestEqualsMethod {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		List<Object> list1=new ArrayList<>();
		list1.add("Sankar");//java lan is case sensitive so careful upper letters and lower letters 
		list1.add(1231);
		System.out.println(list.equals(list1));//compares two methods
		
	}

}
