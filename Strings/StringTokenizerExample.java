package Strings;
import java.util.StringTokenizer;
public class StringTokenizerExample {

	public static void main(String[] args) {

		StringTokenizer str=new StringTokenizer("Hello java World"," ",true);
		System.out.println(str.countTokens());
		
		while(str.hasMoreTokens())
			System.out.println(str.nextToken());
		System.out.println(str.hashCode());
		
		
	}

}
