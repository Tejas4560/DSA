import java.util.*;
public class subarrays {

    public static void subArray(int numbers[]){
        int count=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){ 
                sum=sum+numbers[k];
                System.out.print(numbers[k]+" ");
            }
            if (sum>max){
                max=sum;
            }
            if(sum<min){
                min=sum;
            }
            System.out.print("="+sum);
            count++;
            System.out.println();
        }
        System.out.println();
    } System.out.println("count of subarrays is :"+count);
    System.out.println("maximum sum is"+max);
    System.out.println("minimum sum is"+min);


    }

    public static void main(String[] args){
     int numbers[]={2,4,5,6,8};
     subArray(numbers);


    }
    
    
}
