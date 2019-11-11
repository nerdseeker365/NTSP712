import java.util.ArrayList;
import java.util.List;

public class ListArrayListTestSortMethod {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sankar");
		list.add("1234");
		list.add("7889");
		list.add("sankar");
		list.add("Yesu");
		//list.sort(Comparator.naturalOrder());
		list.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);
		

	}

}
