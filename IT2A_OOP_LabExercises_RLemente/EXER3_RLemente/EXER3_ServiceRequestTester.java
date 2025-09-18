public class EXER3_ServiceRequestTester {
    public static void main(String[] args) {
        EXER3_ServiceRequest r1 = new EXER3_ServiceRequest("Garbage", "Pending", "Uncollected garbage in Zone 1");
        EXER3_ServiceRequest r2 = new EXER3_ServiceRequest("Water", "In Progress", "No water supply since yesterday");
        EXER3_ServiceRequest r3 = new EXER3_ServiceRequest("Streetlight", "Resolved", "Broken streetlight near barangay hall");

        System.out.println("=== Initial Requests ===");
        System.out.println("Request 1: " + r1.getCategory() + " | " + r1.getStatus() + " | " + r1.getDescription());
        System.out.println("Request 2: " + r2.getCategory() + " | " + r2.getStatus() + " | " + r2.getDescription());
        System.out.println("Request 3: " + r3.getCategory() + " | " + r3.getStatus() + " | " + r3.getDescription());

        // Modify
        r1.setStatus("In Progress");
        r1.setDescription("Garbage now being collected by barangay staff");

        r2.setStatus("Resolved");
        r2.setDescription("Water supply restored this morning");

        r3.setStatus("Pending");
        r3.setDescription("Streetlight problem returned after heavy rain");

        System.out.println("\n=== After Updates ===");
        System.out.println("Request 1: " + r1.getCategory() + " | " + r1.getStatus() + " | " + r1.getDescription());
        System.out.println("Request 2: " + r2.getCategory() + " | " + r2.getStatus() + " | " + r2.getDescription());
        System.out.println("Request 3: " + r3.getCategory() + " | " + r3.getStatus() + " | " + r3.getDescription());
    }
}
