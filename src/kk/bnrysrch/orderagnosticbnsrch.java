// ORDER AGNOSTIC BINARY SEARCH
// if you don't know whether it is sorted in ascending or descending order
package kk.bnrysrch;

public class orderagnosticbnsrch {
    public static void main(String[] args) {
//        int [] arr1={52,20,10,6,0,-1,-6,-22,-29};
        int[] arr1={-18,-16,-10,-5,-1,0,5,7,9,45,52};
        int target1=52;
        int ans=orderagnostic(arr1,target1);
        System.out.println(ans);
    }
    static  int orderagnostic(int[] arr, int target){
        int s= 0;
        int e=arr.length-1;
        // find oder of sorted array
        boolean isAsc=arr[s]<arr[e];
        while (s<=e){
            int mid=s+(e-s)/2; //this is used to overcome above error
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]) {
                    e = mid - 1;
                } else{
                    s = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    e = mid - 1;
                } else{
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
