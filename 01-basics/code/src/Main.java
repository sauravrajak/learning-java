import java.util.Scanner;

/**
 * printf method in java
 * <p>
 * we use printf method  to format string
 * <p>
 * which take two arguments
 * <p>
 * format string + object/variable/value
 **/

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name?");
        String Name = scanner.nextLine();
        System.out.println("What is your Age?");
        int age = scanner.nextInt();
        System.out.println("What is your profession");
        String profession = scanner.next();
        formatedOutput(Name, age, profession);
    }


    static void formatedOutput(String name, int age, String profession) {
        System.out.printf("Hello %s!,\nYou are %d year old.Your Profession is %s.", name, age, profession);
    }
}


