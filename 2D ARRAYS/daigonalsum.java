import java.util.*;
public class daigonalsum {



    public static int DiagoSum(int matrix[][]){
        int sum=0;
     
        for(int i=0;i<matrix.length;i++){
         for(int j=0;j<matrix[0].length;j++){
          if(i==j){
            sum+=matrix[i][j];

          }
          else if(i+j==matrix.length-1){

             sum+=matrix[i][j];
          }

         }
        }
        return sum;


    }
    public static void main(String args[]){

   int arr[][]={{1,2,3},
                 {4,5,6},
                {7,8,9}};

     DiagoSum(arr);

    }
}
