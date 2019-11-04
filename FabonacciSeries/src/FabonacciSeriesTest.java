import java.util.Scanner;

public class FabonacciSeriesTest {
//1,1,2,3,5,8,13,21,34,55..........
	public static void main(String[] args) {
		int i,n=1,n1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value::");
		int r=sc.nextInt();
			for(i=1;i<=r;i++) {
				int n3=n+n1;
				System.out.print(n3+" ");
				n=n1;
				n1=n3;
			}
			System.out.println("..............");
	}

}
