package kk.Recursion;

/*
Recursion is a concept or process that depends on a previous or simpler version of itself. It is used in many disciplines, including linguistics and logic. In computer science, recursion is a method for solving computational problems by using functions that call itself within their own code.
*/

/*
Why we use recursion ?

-> Help to solve bigger and complex problems.
-> You can convert recursion solution in to iteration & vice-versa.
-> Space complexity is not constant because of recursive calls.
-> It helps in breaking down bigger problems in to smaller problems.

 */

import java.util.Scanner;

class number_example{
    public static void main(String[] args) {
        recu(1);
    }
    static void recu(int n){
        if (n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        // this is called tail recursion because it is the final call of function
        recu(n+1);
    }

}
class print_fibonacci {
    public static void main(String[] args) {
        fib(10); // iterative call

        for (int i=0;i<10;i++) { // for print the fibonacci series
            System.out.print(fibo(i)+" ");
        }
        System.out.println();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n=sc.nextInt();
        System.out.println(fibo(n)); // it shows the last fibonacci of 10 place
    }
    // this is the iterative approach
    static void fib(int n){
        int n1=0;
        int n2=1;
        for (int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n2+n1;
            n1=n2;
            n2=n3;
        }
        System.out.println( );
    }

    // recursive approach
    static int fibo(int n){
        if (n<2){
            return n;
        }
        // this is not a tail recursion because in this step it first find the values of both and then add , because of the extra step of addition it is not tail recursion.
        return fibo(n-1)+fibo(n-2);
    }

}
