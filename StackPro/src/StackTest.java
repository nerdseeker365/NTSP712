import java.util.Stack;

public class StackTest {
//LIFO
	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		s.add(1);
		s.push(2);//adding elements
		System.out.println("all elements:: "+s);
		System.out.println("Remove top element:: "+s.pop());
		System.out.println("check empty or not:: "+s.empty());
		System.out.println("Display top of the element:: "+s.peek());
		System.out.println("Search this element is present or not:: "+s.search(2));
	}

}
