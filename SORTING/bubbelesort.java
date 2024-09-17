import java.util.*;
public class  bubbelesort {
    public static void bubbsort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){//no of turns are 1 less than no of numbers in array
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    
                }
            }

        }

    }

public static void print(int arr[]){
        for(int i=0;i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

}



    
    public static void main(String args[]){

        int arr[]={52,6,2,5,1};
        bubbsort(arr);
        print(arr);
    }
}

