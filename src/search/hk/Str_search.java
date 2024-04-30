package search.hk;

import java.util.Arrays;

public class Str_search {
    public static void main(String[] args) {
        String name = "Harshit";
        char targret = 'i';
      System.out.println(search(name, targret));
        System.out.println(Arrays.toString(name.toCharArray())); // this will make string in to character array
    }


    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch:str.toCharArray()){
            if (target== ch){
                return true;
            }
        }
        return false;
    }
//
//    static boolean search(String str, char target) {
//        if (str.length() == 0) {
//            return false;
//        }
//        for (int i=0;i<str.length();i++){
//            if (target== str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
}
