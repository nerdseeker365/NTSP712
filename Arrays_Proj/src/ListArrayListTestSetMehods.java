import java.util.ArrayList;
import java.util.List;

public class ListArrayListTestSetMehods {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("Sankar");
		list.add(123l);
		list.add(2.3f);
		list.set(0,"raja");//index position using remove existing element and replace another element in that position.
		System.out.println(list);
	}

}
