package search.hk;

import java.util.Arrays;

public class srch2d {
    public static void main(String[] args) {
        int[][] arr={{23,5,6},{89,5,6},{45,6,87}};
        int target=5;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);//shows the minimum value in it universally
        }

    static int[] search(int[][] arr ,int target){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{-1-1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
