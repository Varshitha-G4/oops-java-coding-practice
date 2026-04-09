class Student{ 
    String name;
    double weight;
    int age;

    public void study(){
        System.out.println(this.name + " is studying"); 
    }

    Student(){
        System.out.println("This is called Default constructor");
    }

}

class Car{
    String brand; //o1
    String color;
    
    public void move(){
        System.out.println("car is moving");
    }

    //Parameterized Constructor
    Car(String brand, String color){
        this.brand = brand; //this.brand is o1 and brand is parameter
        this.color = color;
        System.out.println("This is parameterized constructor");
        System.out.println(this.brand +" " + this.color + " car");
    }

}

class Phone{
    double storage;
    String brand;

    public void phoneInfo(){
        System.out.println("Phone storage " + this.storage + " and " + this.brand);
    }

    //copy constructor
    Phone(Phone ph1){
        this.storage = ph1.storage;
        this.brand = ph1.brand;

        System.out.println("This is copy constructor");
    }

    Phone(){
        System.out.println("Default");
    }

}

public class twoConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alexa";
        s1.age = 17;
        s1.weight = 50.5;
        s1.study();

        Student s2 = new Student();
        s2.name = "Selena";
        s2.study();

        Car car1 = new Car("Toyota", "Red");
        car1.move();

        Phone phone1 = new Phone();
        phone1.brand = "vivo";
        phone1.storage = 128;
        phone1.phoneInfo();

        Phone phone2 = new Phone(phone1);
        phone2.phoneInfo();

    }
}
