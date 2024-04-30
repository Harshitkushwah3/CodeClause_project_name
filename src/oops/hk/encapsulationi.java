package oops.hk;

public class encapsulationi {
    public static void main(String[] args) {
//        encapsulationi ec = new encapsulationi();
//        ec.dowork1();
//        ec.dowork();
//        ec.dowork2();
        lap l1=new lap();
        l1.setprice(31);
        System.out.println(l1.getPrice());
    }
    // here with the help of public keyword the class is accesed by other packages class or same package class;
    // if we remove public it cannot accessed by the other package class but accessed by the same package class
//    void dowork(){
//        System.out.println("working");
//    }
//    public void dowork1(){
//        System.out.println("working");
//    }
//    private void dowork2(){ // can be accessed only by the same class
//        System.out.println("working");
//    }

}
class lap{
    int ram;
    private int price;

    public void setprice(int price) {
        boolean isAdmin=true;
        if (!isAdmin){
            System.out.println("not changable");
        }
        else {
            this.price=price;
        }
    }

    public int getPrice() {
        return price;
    }
}

/* PROTECTED ACCESS MODIFIER IS ONLY ACCESSED BY THE CLASS CHILD ONLY WHETHER IT LIES ANYWHERE */