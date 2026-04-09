/* Polymorphism - when a method has multiple forms.
allows a single interface to represent different underlying implementations */

class Book{
    double price;
    boolean isRuled;
    double pages;


    //method overloading - Compile time polymorphism
    public void bookInfo(double price){
        System.out.println("The price is " + price);
    }
    
    //the below method will give error bcs we cant have 2 methods with the same datatype
    // public void bookInfo(double pages){
    //     System.out.println("The price is " + price);
    // }

    public void bookInfo(boolean isRuled){
        if (isRuled){
            System.out.println("The book in ruled");
        }
        else{
            System.out.println("The book is unruled");
        }
    }

    public void bookInfo(double price, boolean isRuled){
        System.out.println("the book is " + price + " and " + isRuled);
    }

}

public class threePolymorphism{
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.price = 35.5;
        b1.isRuled = false;

        b1.bookInfo(b1.isRuled);
        b1.bookInfo(b1.price, b1.isRuled);
    }
}