public class Friend {
    String name;
    // we can access this variable without even crating an object of Friends Class
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        // whenever we create a new Friend object numberOfFriends will be increased by one
        // cause there is only one numberOfFriends which is being shared by all object of Friend class
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have "+numberOfFriends+" Friends.");
    }
}
