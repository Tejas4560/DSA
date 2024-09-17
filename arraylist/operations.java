import java.util.*;
public class operations{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        int element=list.get(2);
        System.out.println(element);
        list.remove(2);
        System.out.println(list);
        list.add(6);
        list.set(1,12);
        System.out.println(list);
        System.out.println(list.contains(12));
        list.add(2,14);
        System.out.println(list);


    }
}