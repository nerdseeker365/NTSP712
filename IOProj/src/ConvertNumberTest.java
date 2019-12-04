import java.util.Arrays;

//input::874903
//output::347890

public class ConvertNumberTest {
	public static void main(String[] args) {	
		String s="874903";
		//Converting String text to char array
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i!=0) {
			Arrays.sort(c);
			System.out.print(c[i]);
			}
		}
		System.out.print("0");
	}

}
