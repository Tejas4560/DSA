import java.util.*;
public class practice4 {

    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
      if(arr1[i]!=arr2[i]){
        return false;
      }

        }
        return true;



    }

    public static void main(String args[]){


        String str1="care";
        String str2="race";

        System.out.println(anagram(str1, str2));




    }

    
}
