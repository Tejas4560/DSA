import java.util.*;

public class pairsum1 {
    //brute force
  //  public static boolean pairsum(ArrayList<Integer> Height,int target){
   //for(int i=0;i<Height.size();i++){
    //for(int j=i+1;j<Height.size();j++){
      //  if(Height.get(i)+Height.get(j)==target){
        //    return true;
       // }
    //}
   //}        


     //return false;
   // }
   public static boolean pairsum( ArrayList<Integer> Height,int target){
    Collections.sort(Height);
    int lp=0;
    int rp=Height.size()-1;
    while(lp<rp){
     if(Height.get(lp)+Height.get(rp)==target){
        return true;
     }
     if(Height.get(lp)+Height.get(rp)<target){
        lp++;
     }
     else{
        rp--;
     }

    }
    return false;
   }
    public static void main(String args[]){
         ArrayList<Integer> Height=new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5); 
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        System.out.println(pairsum(Height, 5));
    }
}
