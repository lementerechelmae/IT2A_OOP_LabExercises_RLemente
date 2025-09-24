public class EXER4_ProjectTester {
    public static void main(String[] args) {
        // Runtime polymorphism: array of parent type but holds different child objects
        EXER4_User[] users = {
            new EXER4_User("GenericUser1"),
            new EXER4_Admin("Alice"),
            new EXER4_Customer("Bob")
        };

        System.out.println("=== Demonstrating Runtime Polymorphism (Overriding) ===");
        for (EXER4_User u : users) {
            u.displayInfo(); // Different output depending on actual object
        }

        System.out.println("\n=== Demonstrating Compile-time Polymorphism (Overloading) ===");
        EXER4_User testUser = new EXER4_User("Charlie");
        testUser.sendMessage("Hello everyone!");
        testUser.sendMessage("Meeting at 3 PM", "Team A");
    }
}
