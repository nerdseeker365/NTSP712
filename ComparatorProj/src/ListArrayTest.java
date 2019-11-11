import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListArrayTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Sankar", 1));
		list.add(new Student("Yesu", 2));
		list.add(new Student("Ramu", 3));
		list.add(new Student("Banu", 4));
		Comparator<Student> com = new Comparator<Student>() {//inner class

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getSno() > s2.getSno())
					return 1;
				else
					return -1;

			}

		};
		Collections.sort(list,com);
			System.out.println(list);
	}

}
