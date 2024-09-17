import java.util.*;
public class selectionsort {


public static void selectionsort(int array[]){

    for(int i=0;i<=array.length-1;i++){

        int minPos=i;
        for(int j=i+1;j<=array.length-1;j++){

            if(array[minPos]>array[j]){
                minPos=j;
            }
        }

        int temp=array[minPos];
        array[minPos]=array[i];
        array[i]=temp;
    }
}

public static void display(int array[]){

for(int i=0;i<=array.length-1;i++){
    System.out.println(array[i]);
}
}
public static void main(String args[]){
    int array[]={6,5,4,3,2,1};
    selectionsort(array);
    display(array);


}
    
}
