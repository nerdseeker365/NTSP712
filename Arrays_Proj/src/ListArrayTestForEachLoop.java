import java.util.ArrayList;
import java.util.List;

public class ListArrayTestForEachLoop {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		list.add(true);
		list.add(4.3f);
		for(Object s:list) {//choosing Object because of different types of values so.
			System.out.println(s);
		}

	}

}
