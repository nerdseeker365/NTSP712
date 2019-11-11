import java.util.ArrayList;
import java.util.List;

public class ListArrayListTestContainsMethod {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		System.out.println(list.contains(123));//compares elements if found true else false
	}

}
