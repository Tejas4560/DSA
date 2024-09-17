import java.util.*;
public class spiralmatrix {


    public static void Spiralprint(int matrix[][]){

    int startrow=0;
    int startcol=0;
    int endrow=matrix.length-1;
    int endcol=matrix[0].length-1;

     while(startrow<=endrow  && startcol<=endcol){

        for(int i=startcol;i<=endcol;i++){

             System.out.print(matrix[startcol][i]+" ");
        }

        for (int j=startrow+1;j<=endrow;j++){
            System.out.print(matrix[j][endcol]+" ");
        }

        for(int i=endcol-1;i>=startcol;i--){
            System.out.print(matrix[endrow][i]+" ");
        }
        for(int j=endrow-1;j>=startrow+1;j--){
            System.out.print(matrix[j][startcol]+" ");
        }

        startrow++;
        endrow--;
        startcol++;
        endcol--;


     }


    }
    public static void main(String args[]){

   int matrix[][]={{1,2,3},
                  {5,6,7},
                  {9,10,11}
                };
    Spiralprint(matrix);

    }
}
