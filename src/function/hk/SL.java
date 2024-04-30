package function.hk;

import java.util.Scanner;

public class SL {

    // basic way


//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        System.out.println("Enter three numbers ");
//        System.out.println("num1");
//        int a=in.nextInt();
//        System.out.println("num2");
//        int b=in.nextInt();
//        System.out.println("num3");
//        int c=in.nextInt();
//        System.out.println("smaller number");
//        sml(a,b,c);
//        System.out.println("larger number");
//        la(a,b,c);
//    }
//    static  void sml(int a, int b, int c){
//        if(a>b && c>b){
//            System.out.println(b);
//        } else if (a<b &&a<c) {
//            System.out.println(a);
//        }else {
//            System.out.println(c);
//        }
//    }
//    static  void la(int a, int b, int c){
//        if(a>b && a>c){
//            System.out.println(a);
//        } else if (b>a && b>c) {
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }
//    }

 // nums store in array

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < size; i++) {
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
