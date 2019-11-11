import java.util.ArrayList;
import java.util.List;

public class ListArrayTest {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		//ArrayList<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		list.add(true);
		list.add(4.3f);
		System.out.println(list);//Normal way to print values

	}

}
