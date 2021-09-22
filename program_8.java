import java.util.*;

public class program_8 {

   public static void main(String[] args) {
   
      StringBuffer s1 = new StringBuffer("Java is a programming language");
	  StringBuffer s2 = s1.reverse();
	  s2.delete(4,9);
      System.out.println("After deletion = " + s2);
   }
}