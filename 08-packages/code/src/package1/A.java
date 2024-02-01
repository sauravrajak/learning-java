package package1;
import package2.*;

public class A {
//    only a child class can access protectedString
    protected  String protectedString = "This is protected";

    public static void main(String[] args) {
        // creating an instance of C class
        B b = new B();

    }
}
