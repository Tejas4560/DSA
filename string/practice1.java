import java.util.*;
public class practice1 {

    public static int lowercount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++;
            }

        }
        return count;
    }
    public static void main(String args[]){
       String str="AbbBcDeFS";
       System.out.println(lowercount(str));

    }

    
}
