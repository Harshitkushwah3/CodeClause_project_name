package array.hk;

import java.util.ArrayList;

public class DynamicArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(10); //it conatins elements as much yu wnt
        list.add(10);
        list.add(12);
        list.add(13);
        /*
        you can do add , remove, update,add and other function using array list

         */
        System.out.println(list);

        // get index of any number
        System.out.println(list.indexOf(12));
    }
}
