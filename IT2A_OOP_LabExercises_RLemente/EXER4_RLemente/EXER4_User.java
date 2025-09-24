public class EXER4_User {
    protected String name;
    protected String role;

    public EXER4_User(String name) {
        this.name = name;
        this.role = "Generic User";
    }

    // Polymorphic method (to be overridden)
    public void displayInfo() {
        System.out.println("User: " + name + " | Role: " + role);
    }

    // Method overloading (compile-time polymorphism)
    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
    }

    public void sendMessage(String message, String recipient) {
        System.out.println(name + " sends message to " + recipient + ": " + message);
    }
}
