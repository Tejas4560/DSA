import java.util.*;
class Solution {
    public static boolean isPalindrome(String s) {
        StringBuilder str= new StringBuilder();
        for(int i=0 ;i<s.length();i++){
            char currchar=s.charAt(i);
        if(currchar>='A' && currchar<='Z'){
            currchar +=32;
          str.append(currchar);
        }
        if(currchar>='a' && currchar<='z' || currchar>='0'&& currchar<='9'){

           str.append(currchar);

        }

        }
        if(str.reverse().equals(s)){
            return true;
        }
        else {
           return false;
        }

    }

    public static void main(String args[]){

        String Str="race a car";
        System.out.println(isPalindrome(Str));
    }
}