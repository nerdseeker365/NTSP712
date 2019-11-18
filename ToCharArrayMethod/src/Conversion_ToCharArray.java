
public class Conversion_ToCharArray {

	public static void main(String[] args) {
		String str="Welcome to Lab";
		//Converting String to Char Array
		char ch[]=str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++) {
			System.out.println(ch[i]);
		}
		
	}

}
