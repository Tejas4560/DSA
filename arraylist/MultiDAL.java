import java.util.*;
public class MultiDAL {
   public static void main(String args[]){
      ArrayList<ArrayList<Integer>> Mainlist=new ArrayList<>();
      ArrayList<Integer> list1=new ArrayList<>();
      list1.add(1);
      list1.add(2);
      ArrayList<Integer> list2=new ArrayList<>();
      list2.add(3);
      list2.add(4);
      Mainlist.add(list1);
      Mainlist.add(list2);
      System.out.println(Mainlist);

      for(int i=0;i<Mainlist.size();i++){
      ArrayList<Integer> currlist=Mainlist.get(i);
        for(int j=0;j<currlist.size();j++){
         System.out.print(currlist.get(j));
        }

      }
   } 
}
