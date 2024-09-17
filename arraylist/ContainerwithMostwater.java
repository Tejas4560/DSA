import java.util.*;

public class ContainerwithMostwater {
    public static int storeWater(ArrayList<Integer> height){
        //bruteforce method
        int maxwater=0;
        for(int i=0;i<height.size();i++){
        for(int j=i+1;j<height.size();j++){
            int ht=Math.min(height.get(i),height.get(j));
            int width=j-i;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);

        }
     }



    return maxwater;
    }
    public static int storeWater2pointer(ArrayList<Integer>Height){
       int maxwater=0;
       int lp=0;
       int rp=Height.size()-1;
       if(lp<rp){
        int height=Math.min(Height.get(lp),Height.get(rp));
        int width=rp-lp;
        int currwater=height*width;
        maxwater=Math.max(maxwater,currwater);
       if(Height.get(lp)<Height.get(rp)){
        lp++;

       }
       else{
        rp--;
       }


       }

  return maxwater;
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
        System.out.print(storeWater2pointer(Height));
    }
    
}
