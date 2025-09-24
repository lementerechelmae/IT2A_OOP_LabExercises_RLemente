public class EXER4_Customer extends EXER4_User {
    public EXER4_Customer(String name) {
        super(name);
        this.role = "Customer";
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer: " + name + " | Role: " + role + " | Can browse and purchase items.");
    }
}
