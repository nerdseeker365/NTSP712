import java.util.ArrayList;
import java.util.List;
public class ListArrayTestisEmptyMethod {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Sankar");
		System.out.println(list.isEmpty());//Elements available in list display false else display true
	}

}
