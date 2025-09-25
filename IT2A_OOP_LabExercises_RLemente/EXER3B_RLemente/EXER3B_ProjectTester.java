public class EXER3B_ProjectTester {
    public static void main(String[] args) {
        EXER3B_Admin admin = new EXER3B_Admin("Kap. Reyes", "kapreyes", "12345");
        EXER3B_Resident resident = new EXER3B_Resident("Juan Dela Cruz", "juanDC", "67890");

        admin.login();
        admin.showHome();

        System.out.println();

        resident.login();
        resident.showHome();

        System.out.println();
        resident.register();

        System.out.println();
        String complaint = resident.submitComplaint("Street light not working.");

        System.out.println();
        admin.updateComplaint(complaint, "In Progress");

        System.out.println();
        String announcement = "Community clean-up drive this Saturday!";
        admin.makeAnnouncement(announcement);

        System.out.println();
        resident.reactToAnnouncement(announcement, "Will join!");
    }
}
