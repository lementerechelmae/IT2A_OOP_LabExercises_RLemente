public class EXER4_Admin extends EXER4_User {
    public EXER4_Admin(String name) {
        super(name);
        this.role = "Administrator";
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin User: " + name + " | Role: " + role + " | Has full access.");
    }
}
