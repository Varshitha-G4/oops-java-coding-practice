interface Animal{
    public void walks();
    int eyes = 2;
    // public void eats(){
        // System.out.println("Animal eats");
    // } This will give error bcs in interfaces, u have to hide implementation

    // Animal(){...} this will also give error because interfaces do not have constructors
}

interface Herbivore{

}

//interfaces can have multiple inheritance -- cannot be done by classes
class Horse implements Animal, Herbivore{
    public void walks(){
        System.out.println("yea walks with 4 legs");
    }
}

public class SixInterface {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walks();
    }
}
