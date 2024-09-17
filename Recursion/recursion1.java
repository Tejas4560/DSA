public class recursion1 {
    public static void dec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        dec(n-1);
    }

    public static void inc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }
     public static int fact(int n){
        if(n==1){
            return 1;
        }
        int fn=n*fact(n-1);
        return fn;
     }
     public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sumn=n+sum(n-1);
        return sumn;
     }
     public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        return  f1+f2;
     }
     public  static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
      if(arr[i]>arr[i+1]){
         return false;


    }
     return sorted(arr,i+1);

     }
     public static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);

     }
     public static int lastOccurance(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int isFound=lastOccurance(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
             return i;
        }
        return isFound;

     }
     public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        
        int xn=x*power(x, n-1);
        return xn;
     }
    public static void main(String[] args) {
       int arr[]={2,4,5,7,1,5,8};
       System.out.println(sorted(arr, 0));
       System.out.println(firstOccurance(arr,5,0));
       System.out.println(lastOccurance(arr, 5, 0));
       System.out.println(power( 2, 5));
    }

}
