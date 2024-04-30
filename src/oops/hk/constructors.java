package oops.hk;

import java.util.Scanner;

public class constructors {
    public static void main(String[] args) {
        person p1 = new person(); // here p1 is the object of class person
        p1.age=24;
        p1.name="Harshit";
        System.out.println(p1.age+" "+ p1.name);
        // accessing the methods
        p1.eat();
        p1.walk();
        p1.walk(2000);
        // for n no. of person
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("Enter total no. of persons");
        int a= in.nextInt();
        in.nextLine();
        for (int i=0;i<a;i++){
            person p2=new person();
            System.out.println("enter age of person");
            p2.age=in.nextInt();
            in.nextLine();
            System.out.println("enter name of person");
            p2.name=in.nextLine();
            System.out.println(p2.name+" "+p2.age);
            p2.walk();
            p2.eat();
            p2.walk(23333);
        }
        */
        System.out.println(person.count); // it will print total no. of persons generated


    }
    static class person{ // this is the class
        int age;
        String name ;
        static int count; // with the help of the static you can make the propertie of class

        // constructors
        public person(){
            count++;
            System.out.println("creating an object");
        }
// constructor overloading
        public  person(int age, String name){
            this(); // calling the above class using this keyword
            this.age=age;
            this.name=name;
        }
        // defining the properties or methods of a class

        void walk(){
            System.out.println(name+" is walking");
        }
        void eat(){
            System.out.println(name+" is eating");
        }
        void walk(int steps){
            System.out.println(name+" walked "+ steps + " steps ");
        }
        // here polymorphism occurs i.e. same class name but different arguments
        // this is called compile timed polymorphism.
    }
}
