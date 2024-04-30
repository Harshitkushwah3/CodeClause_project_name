package search.hk;

public class min_num {
    public static void main(String[] args) {
        int[] arr1 = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr1));
    }
    static  int min(int[] arr1) {
        int min=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]<min) {
                min=arr1[i];
            }
        }
        return min;
    }
}
