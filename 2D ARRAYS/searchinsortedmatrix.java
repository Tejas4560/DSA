import java.util.*;
public class searchinsortedmatrix {

    public static boolean staircasesearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<=matrix.length-1 && col>=0 ){
         if(matrix[row][col]==key){
            System.out.println("key found");
            return true;
         }
         else if(matrix[row][col]>key){
            col--;
         }
         else{
            row++;
         }

        }
        System.out.print("not found");
        return false;
       

    }

    public static void main(String args[]){
          int arr[][]={{10,20,30,40,50},
                        {12,22,32,42,52},
                        {14,24,34,44,54},
                        {16,26,36,46,56},
                        {18,28,38,48,58}};
    int key=26;
    staircasesearch(arr, key);


    }
    
}
