import java.util.Random;

class DiceRoller {


    DiceRoller() {
        // local
        Random random = new Random();
        int number = 0;
        roll(random,number);
    }

    void roll(Random random,int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}


public class Main {
    public static void main(String[] args) {
        // local
        // it is declared inside a method, and it is visible only inside methods
        // ----------------------------------------------------------------------------------
        // global
        // it is declared outside a methods. it is visible everywhere.

        DiceRoller diceRoller = new DiceRoller();

    }
}