 import java.util.*;
public class arraycc {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }


   public static  int yourNumber(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
      if (numbers[i]==key){
        return i;
        
      }
      

    }
     return -1;

   }

   public static int largestSmallest(int numbers[]){
         int largest=Integer.MIN_VALUE;
         int smallest=Integer.MAX_VALUE;
         for(int i=0; i<numbers.length;i++){

           if(numbers[i]>largest){
            largest=numbers[i];
            
           }
           if(numbers[i]<smallest){
             smallest=numbers[i];
        
           }
         //  System.out.println("smallest number is="+smallest);
           //System.out.println("largest value is="+largest);
           



         }
          System.out.println("smallest number is="+smallest);
           System.out.println("largest value is="+largest);
         return 0;




   }


    public static void main(String[] args) {



        int numbers[]={4,7,8,9,10,34,2,67,34,21,6,89};

        largestSmallest(numbers);


    }

       // int numbers[]={34,56,67,88,45,89,87,90};
        // Scanner sc=new Scanner(System.in);
        //System.out.println("enter your key");
        //int key=sc.nextInt();
        //int index=yourNumber(numbers,key);
        //if (index==-1){
          //  System.out.println("number not present");
        //}else{
          //  System.out.println("your number is present at index="+index);
        //}















    
       // int marks[]=new int [4];
       // Scanner sc=new Scanner(System.in); 


       // marks[0]=sc.nextInt();
       // marks[1]=sc.nextInt();
        //marks[2]=sc.nextInt();
        //marks[3]=sc.nextInt();
        //update(marks);
        //for(int i=0;i<marks.length;i++){

        
        //System.out.println(marks[i]);
        

       // System.out.println("phy="+marks[0]);
        //System.out.println("che="+marks[1]);
       // System.out.println("math="+marks[2]);
       // System.out.println("bio="+marks[3]);
       //int avg=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        // System.out.println("avg="+ avg);

        
    }


