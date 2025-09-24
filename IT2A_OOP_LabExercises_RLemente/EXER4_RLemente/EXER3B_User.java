public class EXER3B_User {
    protected String name;
    protected String role;

    public EXER3B_User(String name) {
        this.name = name;
        this.role = "Generic User";
    }

    public void displayInfo() {
        System.out.println("User: " + name + " | Role: " + role);
    }
}
