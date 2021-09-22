import java.util.*;
public class program_5 {
 
    public static void main(String a[]){
        int[] arr1 = {1,3,2,5,4};
        int[] arr2 = {3,2,6,7,8};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}