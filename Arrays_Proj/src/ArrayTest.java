
public class ArrayTest {
		public static void main(String args[]) {
		int n1=0,n=4,a[]= {2,3,4,5,6};//6 8 15 20 30....
		System.out.print("{");
		for(int i=0;i<a.length;i++) {
			int b=a[i]+n+n1;
			System.out.print(b+" ");
			n=n1;
			n1=b;
	
		}
		System.out.print("}");
		
	}
}
