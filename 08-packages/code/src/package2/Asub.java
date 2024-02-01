package package2;

// import everything from package 1
import package1.*;

public class Asub extends A {

    public static void main(String[] args) {
        // creating an instance of C class
        Asub asub = new Asub();
        System.out.println(asub.protectedString);

    }

}
