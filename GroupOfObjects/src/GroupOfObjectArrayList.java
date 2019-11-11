import java.util.ArrayList;
import java.util.List;

public class GroupOfObjectArrayList {

	public static void main(String[] args) {
		Student s1=new Student(1,"Sankar","hyderabad");
		Student s2=new Student(2,"Sankar","vizag");
		Student s3=new Student(3,"Yesu","Rzole");
		List<Student> list=new ArrayList<>();
		list.add(s1);//here adding Objects
		list.add(s2);
		list.add(s3);
		for(Student s:list) {
			System.out.println(s.sno+"\t"+s.sname+"\t"+s.saddr);
		}

	}

}
