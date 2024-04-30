package function.hk;

public class mOverload {
    public static void main(String[] args) {
    metOver(4,5);
    metOver("terfd","ed");
    }
    static void metOver(int a, int b){
        System.out.println(a + " "+ b);

    }
    static  void metOver(String a, String b){
        System.out.println(a + " " +b);
    }
}
