import java.util.*;
public class asedes {
    public static void desorder(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        desorder(n-1);



    }
 
    public static void aseorder(int n){            
            
        if(n==1){
            System.out.println();
            System.out.print(1);                                                                                                                                                                                                                                                                                                                                           
            return;
        }
        aseorder(n-1);
        System.out.print(" "+n);
    } 
    public static void main(String[]args){
     desorder(5);
     aseorder(5 );

    }
}