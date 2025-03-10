import java.util.Calendar;

class User{
    String name;
    String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public void test(){
        System.out.println("test");
    }
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Email: " + this.email);
    }

}