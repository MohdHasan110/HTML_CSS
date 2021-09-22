import java.util.*;

public class program_9 {

   void Adding_2_Integer(int a,int b)
   {
    int c =a + b;
	System.out.println("Adding 2 Integer Number : "+c);
   }
   
    void Adding_2_Double(double a,double b)
   {
    double c =a + b;
	System.out.println("Adding 2 Double Number : "+c);
   }
   
    void Multiplying_2_float(float a,float b)
   {
    float c =a * b;
	System.out.println("Multiplying 2 float Number : "+c);
   }
   
    void Multiplying_2_int(int a,int b)
   {
    int c =a * b;
	System.out.println("Multiplying 2 Integer Number : "+c);
   }
   
    void Concate_2_string(String a,String b)
   {
    String c =a + b;
	System.out.println("Concate 2 string : "+c);
   }
   
    void Concate_3_string(String a,String b,String c)
   {
    String d =a.concate(b).concate(c);
	System.out.println("Concate 2 string : "+c);
   }
   
      public static void main(String[] args)
	  {
	  program_9 ob = new program_9();
	  ob.Adding_2_Integer(10,20);
	  ob.Adding_2_Double(10.01,20.012);
	  ob.Multiplying_2_float(10.05f,20.25f);
	  ob.Multiplying_2_int(10,20);
	  ob.Concate_2_string("Java","Language");
	  ob.Concate_3_string("Java","Programming","Language");
   }
}