import java.util.*;
public class insertionsort {

    public static void insertsort(int arr[]){

    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;

        }
        arr[prev+1]=curr;

    }
    }

   
    public static void display(int arr[]){

        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        }
    public static void main(String args[]){
    int arr[]={1,4,3,7,8};
    insertsort(arr);
    display(arr);


    }
    
}
