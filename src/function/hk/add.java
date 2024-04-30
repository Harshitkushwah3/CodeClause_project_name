package function.hk;
import java.util.*;

public class add {
    public static void main(String[] args) {
        sum();
    }

    /* this is the method */
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is "+ sum);
    }
}
