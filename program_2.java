import java.util.*;
public class program_2
{
	public static void main(String[] args)
	{
		String str = "Java is a Programming Language and also Python is a Programming Language";
		str = str.toLowerCase();
		String[] strArray = str.split("");
		List<String> repeatewords = new ArrayList<>();
		HashSet<String> uniquewords = new HashSet<>();
		for(String str1 : strArray)
		{
			if(!uniquewords.add(str1))
				repeatewords.add(str1);
		}
		System.out.println(repeatewords);
	}
}