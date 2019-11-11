import java.util.ArrayList;
import java.util.List;

public class ListArrayTestForLoop {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		list.add(true);					//length variable for Array to calculate size
		list.add(4.3f);					//length() method for String to calculate size
		for(int i=0;i<list.size();i++) {//size() method for collection to calculate size 
			System.out.println(list.get(i));
		}

	}

}
