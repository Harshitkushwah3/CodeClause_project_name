// it is same as encapsulation but we can hide the data for decreasing the complexity of the program

// you can achieve abstraction using the abstract keyword or using the interface method
package oops.hk;

public class abstrct {
    public static void main(String[] args) {
        Audi a1=new Audi();
        a1.start();
        BMW b1=new BMW();
        b1.start();

    }
}
class Audi extends car{
    @Override
    void start() {
        System.out.println("Audi is start");
    }
}
class BMW extends car{
    @Override
    void start() {
        System.out.println("BMW is start");
    }
}

// if you made abstract function you have to make the class also abstract
// you cannot create the object of this class you can only create the object of the child class of it
abstract class  car{
    int price;
    String brand;
    abstract void start();
}
