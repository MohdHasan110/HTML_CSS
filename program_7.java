import java.util.*;
public class program_7
{
	static String firstname = "Smith";
	static String lastname = "warner";
	static int age = 23;
	static void getdata(String s1,String s2,int a)
	{
	s1=firstname;
	s2=lastname;
	a = age;
	}
	static {
		System.out.println("Firstname :"+firstname);
		System.out.println("lastname :"+lastname);
		System.out.println("age :"+age);
		
		
	}
	public static void main(String[] args)
	{
		
		System.out.println("static variable and static method or static block");
	}
}