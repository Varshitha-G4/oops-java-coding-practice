//class name should start with capitals
class Person{ 
    String name;
    double weight;
    int age;

    //methods start with small letters
    public void sleep(){
        System.out.println(this.name + " is sleeping"); 
        // this.name indicates the current object's name that is calling the method.
    }
}


public class oneClass {
    public static void main(String[] args) {
        // new keyword -> stores the object in a new memory space
        //Person() is a constructor that creates the object
        Person p1 = new Person();
        p1.name = "Alexa";
        p1.age = 17;
        p1.weight = 50.5;

        Person p2 = new Person();
        p2.name = "Selena";

        p1.sleep();
        p2.sleep();

    }
}