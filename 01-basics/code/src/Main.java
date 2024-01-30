import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        // printf method in java
        // we use printf method  to format string
        // which take two arguments
        // format string + object/variable/value

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name?");
        String Name = scanner.nextLine();
        System.out.println("What is your Age?");
        int age = scanner.nextInt();
        System.out.println("What is your profession");
        String profession = scanner.next();
        formatedOutput(Name,age,profession);
    }


    static void formatedOutput(String name,int age,String profession){
        System.out.printf("Hello %s!,\nYou are %d year old.Your Profession is %s.",name,age,profession);
    }
}