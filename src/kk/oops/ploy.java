package kk.oops;

public class ploy {
    void sum(String  a, int b){
        System.out.println("string"+ a +"int " + b);
    }
    void sum(int b, String a){
        System.out.println("string"+ a +"int " + b);
    }

    public static void main(String[] args) {
        ploy ob=new ploy();
//        ob.sum("hk",5);
//        ob.sum(4,"kk");
        System.out.println(ob);
    }
}
