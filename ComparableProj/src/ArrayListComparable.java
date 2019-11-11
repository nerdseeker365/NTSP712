import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListComparable {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(7101,"abhi Sankar",2.4));
		list.add(new Student(102,"ravi",2.7));
		list.add(new Student(103,"teja",4.8));
		Collections.sort(list);
		System.out.println(list);

	}

}
