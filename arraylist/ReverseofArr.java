import java.util.*;
public class ReverseofArr {
    public static void main(String args []){
          ArrayList<Integer>list=new ArrayList<>();
      list.add(2);
      list.add(3);
      list.add(4);
    System.out.println(list);
    for(int i=list.size()-1;  i>=0;i--){
        System.out.print(list.get(i)+" ");
    }

    }
    
}
