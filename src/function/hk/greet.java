package function.hk;
public class greet {
    public static void main(String[] args) {
        String a=num();
        System.out.println(num());

        String mess=Mygreet();
        System.out.println(mess);

    }
    static String Mygreet() {
        String neww= "message me";
        return neww;
    }

    static String num(){
        String message=" hello harshit";
        return message;

    }

}
