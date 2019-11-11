import java.util.ArrayList;
import java.util.List;

public class ListArrayListTestSizeMethod {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("Sankar");
		list.add(1234);
		list.add(78.89f);
		list.add("sankar");
		list.add("Yesu");
		System.out.println(list.size());//subList starts with 0 index ends with 1
		

	}

}
