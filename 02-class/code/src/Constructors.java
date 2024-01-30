
class Human {
    // Constructor
    // we have three parameters here
    // name , age, weight
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        // we are using this keyword So we can access these things in our objects
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    void eat(){
        System.out.println(this.name+" is eating.");
    }
}

public class Constructors {
    public static void main(String[] args) {
        //constructor = special method that is called
        // when an object is instantiated (Created)
        // it allows us to construct objects which has varying attributes
        // such as every human will have different name,age,weight

        Human human1 = new Human("Saurav", 25, 71);
        Human human2 = new Human("Sonam", 25, 65);
        System.out.println(human1.name);
        human1.eat();
        System.out.println(human2.name);
        human2.eat();

    }
}
