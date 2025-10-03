public class EXER4_Admin extends EXER4_User {
    private String role;

    public EXER4_Admin(String name, String username, String password) {
        super(name, username, password);
        this.role = "Admin";
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + name + " | Username: " + username + " | Role: " + role);
    }
}
