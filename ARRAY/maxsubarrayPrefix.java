import java.util.*;
public class maxsubarrayPrefix {
    
    public static void maxsubArray(int numbers[]){
        int currsum=0;
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0]=numbers[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];

        }
        
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
             currsum=start==0? prefix[end]:prefix[end]-prefix[i-1];
           
            if (currsum>max){
                max=currsum;
            }
            if(currsum<min){
                min=currsum;
            }
            
            
        }

    }
     
    System.out.println("maximum sum is"+max);
    System.out.println("minimum sum is"+min);


    }

    public static void main(String[] args){
        int numbers[]={2,4,5,6,8};
        maxsubArray(numbers);
   
   
       }
}
