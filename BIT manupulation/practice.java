import java.util.*;
public class practice {

    public static void oddeven(int n){
      if((n&1)==0){
        System.out.println("no is even");
      }
      else{
        System.out.println("no is odd");
      }
    }
    public static int getithbit(int n,int i){
      int bitmask=1<<i;
        if ((n&bitmask)==0){
          return 0;
             }
        else{
          return 1;
        }
    }
    public static int setIthbit(int n,int i){
     int bitmask=1<<i;
     return n|bitmask;

    }
    public static int clearIthbit(int n,int i){

      int bitmask=~(1<<i);
      return n&bitmask;
    }

    public static void main(String args[]){
        
      System.out.println(getithbit(10,2));
      System.out.println(setIthbit(10,2));
      System.out.println(clearIthbit(10, 1));

    }
}