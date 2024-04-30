package function.hk;
// variable arguments

import java.lang.reflect.Array;
import java.util.Arrays;

public class varArg {
    public static void main(String[] args) {
//        fun(12,5,6,8,9,54,5,9,558,5,5,5,5); // for single type arguments
         multiple(25,2,"554","hydfg","regsd");

 }

    static void multiple(int a,int b,String...c){
        System.out.print(a+" "+b);
        System.out.print(Arrays.toString(c));
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));

    }
}
