import java.util.ArrayList;
import java.util.List;
public class ListArrayTestlastIndexOfIndexOfMethods {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");//0
		list.add(123);//1
		list.add(123);//2
		//System.out.println(list.lastIndexOf(123));//2 
		System.out.println(list.indexOf(123));//1 here element is found so index value
		System.out.println(list.indexOf(1234));//-1 here element is not found so -1
	}

}
