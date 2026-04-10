class Student1{
    String name;
    static String school; //Static is used when its a common thing for all objects
}

public class SevenStatic {
    public static void main(String[] args) {
        Student1.school = "ABC"; //due to static keyword, the class can directly access it

        Student1 s1 = new Student1();
        s1.name = "lally";
        System.out.println(s1.school);
    }
}
