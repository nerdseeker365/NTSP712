import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListArrayTestForEachRemainingMethod {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		list.add(123);
		list.add(true);					
		list.add(4.3f);	
		list.add(3.4d);
		Iterator<Object> itr=list.iterator();
		//forEachRemaining Method.....
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	}

}
