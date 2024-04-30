package search.hk;

import java.util.Scanner;

public class arr {
    static int[] array(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = in.nextInt();
        System.out.println("enter elements of array");
        int[] arr = new int[a];
        // adding inputs
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        // show output
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
            array();
    }
}
