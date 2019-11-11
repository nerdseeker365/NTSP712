import java.util.ArrayList;
import java.util.List;
public class ListArrayTestClearMethod {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		list.clear();//clear method used to clear all the elements in the list...
		list.forEach(a->{
			System.out.println(a);
		});
	}

}
