import java.util.*;
public class swap {


    public static void swap(ArrayList<Integer>list,int indx1 ,int indx2){

   int temp=list.get(indx1);
   list.set(indx1,list.get(indx2));
   list.set(indx2, temp);


    }
    public static void main( String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        System.out.println(list);
         swap(list,2,4);
         System.out.println(list);
        


    } 
}
 