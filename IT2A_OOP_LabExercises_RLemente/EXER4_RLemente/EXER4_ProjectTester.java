public class EXER4_ProjectTester {
    public static void main(String[] args) {
        // Upcasting (Polymorphism in action)
        EXER4_User user1 = new EXER4_Admin("Kap. Reyes", "kapreyes", "12345");
        EXER4_User user2 = new EXER4_Resident("Juan Dela Cruz", "juandelacruz", "password", "Quezon City");

        // Each object responds differently (method overriding)
        user1.displayInfo();
        user2.displayInfo();

        // Method overloading
        user2.setName("Pedro");
        user2.displayInfo();

        user2.setName("Pedro", "Penduko");
        user2.displayInfo();
    }
}
