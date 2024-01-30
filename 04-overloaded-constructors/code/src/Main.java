

class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    /*
          overloaded constructors
          these are multiple constructors within a class with the same name,
          but have different parameters
          name + parameters = signature

     */
    // overloaded constructor same name but different parameters
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;


    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;


    }
}

public class Main {
    public static void main(String[] args) {

        //using #1 constructor to bake pizza with topping
        Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza1.");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
        System.out.println();


        //using #2 constructor to bake pizza without topping
        Pizza pizza2 = new Pizza("thick crust", "tomato", "mozzarella");
        System.out.println("Here are the ingredients of your pizza2.");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);


    }
}