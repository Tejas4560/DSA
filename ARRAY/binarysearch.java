import java.util.*;
public class binarysearch {

  public static int binarySearch(int numbers[],int key){
    int start=0;
    int end=numbers.length-1;
   // int mid=(start+end)/2;
    while(start<=end){
      int mid=(start+end)/2;
      if(numbers[mid]==key){
        return mid;
      }
      if (numbers[mid]>key){
        end=mid-1;

      }else{
        start=mid+1;
      }
         
    }
    return -1;

  }



    public static void main(String[] args) {

      int numbers[]={2,4,6,8,10,12,14,16,18};
      int key=14;
      System.out.println("key is found at index: "+binarySearch(numbers, key));
      



    
  }
}

