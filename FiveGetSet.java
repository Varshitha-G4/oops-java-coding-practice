//access modifiers -- public, private, default, protected

class Account{
    public String name;
    protected String email;
    private String password;

    public String getPwd(){
        return this.password;
    }

    public void setPwd(String pwrd){
        this.password = pwrd;
    }
}


public class FiveGetSet {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "name";
        a1.email = "abc@gmail.com";
        // a1.password = "ksjdf"; will show error bcs its private. so use getter and setter to access it
        //after setting the getter and setter
        a1.setPwd("kldhds");
        System.out.println(a1.getPwd());
    }
}
