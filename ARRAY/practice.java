 import java.util.*;
 public class practice  {

    public static boolean appear(int Arr[]){
      Arrays.sort(Arr);
      for(int i=0;i<Arr.length-1;i++){
        if(Arr[i]==Arr[i+1]){
           return true;
          
        }


      }
      return false;

    }
    public static void main(String args[]){
      int Arr[]={2,1,4,5,3};
      
      System.out.println(appear(Arr));


    }
    
}
