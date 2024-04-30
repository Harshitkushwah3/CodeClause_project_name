package search.hk;

import java.util.Scanner;

public class linearsrch {
    public static void main(String[] args) {
        int [] a=arr.array();
        if(a.length==0){
            System.out.println("array empty");
        }
        for (int i = 0; i < a.length; i++) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter element you want to search");
            int b=in.nextInt();
            if (b == a[i]) {
                System.out.println(i);
            }
        }
    }
}
