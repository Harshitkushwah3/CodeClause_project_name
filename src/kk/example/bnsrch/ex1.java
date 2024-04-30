package kk.example.bnsrch;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 12, 45, 69, 78};
        int target = 40;
//        System.out.println(ceil(arr, target));
//        System.out.println(floor(arr,target));

    }
// CEIL OF A NUMBER IN AN ARRAY
// number is equal or greater than the target element


    /*

    public static int ceil(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        while (s <= e) {

            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                return arr[mid];
            }
            mid = s + (e - s) / 2; // Update mid within the loop
        }
        return arr[mid];
    }
}
*/


// FLOOR OF A NUMBER
    // it is the number smaller than or equal to the target element;

/*

    static  int floor(int [] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        while (s <= e) {

            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                return arr[mid];
            }
            mid = s + (e - s) / 2;
        }
        return arr[e];
    }

*/

}