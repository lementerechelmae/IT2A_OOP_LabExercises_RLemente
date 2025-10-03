public class EXER4_Resident extends EXER4_User {
    private String address;

    public EXER4_Resident(String name, String username, String password, String address) {
        super(name, username, password);
        this.address = address;
    }

    @Override
    public void displayInfo() {
        System.out.println("Resident: " + name + " | Username: " + username + " | Address: " + address);
    }
}
