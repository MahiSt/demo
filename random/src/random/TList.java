package random;

import java.util.Arrays;
import java.util.List;

public class TList {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("String","Stri");
		String[] converted= new String[l.size()];
		converted=l.toArray(converted);
		System.out.println(converted);
	}
}
