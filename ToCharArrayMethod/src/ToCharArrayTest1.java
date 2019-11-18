
public class ToCharArrayTest1 {

	public static void main(String[] args) {
			String str="welcome to nataraj";
			//Converting String to Char Array
			char ch[]=str.toCharArray();
			int n=ch.length;
			System.out.println("Length Of the Char Array:: "+n);
			for(int i=0;i<=ch.length-1;i++) {
				System.out.println(ch[i]);
			}
	}

}
