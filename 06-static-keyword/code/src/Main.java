

/**
 * <h1><h1/>
 * static
 * <br/>
 * modifier. A single copy of a variable/method is created and shared.

 * The class "owns" the static member

 */

public class Main {

    public static void main(String[] args) {

        Friend friend1 = new Friend("Rohan");
        Friend friend2 = new Friend("Arjun");

        System.out.println(Friend.numberOfFriends);

    }
}