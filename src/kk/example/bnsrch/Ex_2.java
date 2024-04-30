package kk.example.bnsrch;

public class Ex_2 {
    public static void main(String[] args) {
//        char [] arr={'c','f','j'} ;
//        char target = 'c';
//        System.out.println(Smallest_Letter(arr,target));
//
//        int [] arr = {5,7,7,8,8,10};
//        int tar=8;
//        System.out.println(fp(arr,tar));
    }

    // 744. Find Smallest Letter Greater Than Target (leetcode)
/*
    static char Smallest_Letter(char [] arr,char target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return arr[s];
    }
 */


    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

