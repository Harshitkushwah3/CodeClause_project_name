package kk.bnrysrch;

public class ex1 {
    public static void main(String[] args) {
//        int [] arr={-18,-12,-4,0,2,3,4,5,6,8,9}; // ascending order
        int [] arr1={52,20,10,6,0,-1,-6,-22,-29};
        int target1=52;
        int ans=bnsrch2(arr1,target1);
        System.out.println(ans);
    }
/* THIS CODE IS FOR ASCENDING ARRAY*/
//    static int bnsrch(int[] arr, int target){
//        int s=0;
//        int e=arr.length-1;
//        while (s<=e){
////          int mid=(s+e)/2; // if the value lies inside the range  int size
//            int mid=s+(e-s)/2; //this is used to overcome above error
//            if (target<arr[mid]){
//                e=mid-1;
//            } else if (target>arr[mid]) {
//                s=mid+1;
//            }
//            else {
//                return mid;
//            }
//
//        }
//        return -1;
//    }
    static int  bnsrch2(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
//          int mid=(s+e)/2; // if the value lies inside the range  int size
            int mid=s+(e-s)/2; //this is used to overcome above error
            if (target==arr[mid]){
                return mid;
            } else if (target>arr[mid]) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return -1;
    }
}

