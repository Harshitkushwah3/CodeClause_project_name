// for every class in java the super parent is the object always
package oops.hk;

public class inherit {
    public static void main(String[] args) {
//        person p2=new person();
//        p2.age=24;
//        p2.name="jl";
//        dev d1= new dev("harshit",24);
//        d1.walk();
//        encapsulationi.java ec= new encapsulationi.java();
//        ec.dowork();
//        ec.dowork1();
//        ec.dowork2(); // here private method cannot be accessed

    }
    static class dev extends person{

        public dev(String name, int age) {
            super(name, age); // here super call the parent or person class constructor
        }
        @Override
        void walk(){
                System.out.println(" dev "+ name + " walking ");
            }

    }
    static class person{
        String name;
        int age;

        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public person() {

        }

        void walk(){
            System.out.println(name+" is walking");
        }
        void eat(){
            System.out.println(name+" is eating");
        }
        void walk(int steps){
            System.out.println(name+" walked "+ steps + " steps ");
        }
    }
}
