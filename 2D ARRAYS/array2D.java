import java.util.*;

public class array2D {
    public static boolean search(int matrix[][],int key){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==key){
                System.out.println("key present");
                return true;
              }

            }

        }  
        System.out.println("not present");
        return false;
    }     



    public static void main(String args[]){
     int arr[][]= new int [3][3];
     int n=arr.length;
     int m=arr[0].length;
     Scanner sc=new Scanner(System.in);
     for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
        
     }
     for (int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
     }
       search(arr,11);
     


    }

    
}