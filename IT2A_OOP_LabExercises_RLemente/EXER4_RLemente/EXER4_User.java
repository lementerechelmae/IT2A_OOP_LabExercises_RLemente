public class EXER4_User {
    protected String name;
    protected String username;
    protected String password;

    public EXER4_User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    // Polymorphism through method overloading
    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    // Overridden by subclasses
    public void displayInfo() {
        System.out.println("User: " + name + " | Username: " + username);
    }
}
