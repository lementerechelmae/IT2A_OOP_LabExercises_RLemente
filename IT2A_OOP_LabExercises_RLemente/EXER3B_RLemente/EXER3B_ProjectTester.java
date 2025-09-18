public class EXER3B_ProjectTester {
    public static void main(String[] args) {

        System.out.println("                         EXER3B_User");
        System.out.println("                       /            \\");
        System.out.println("             EXER3B_Officials       EXER3B_Residents");
        System.out.println("               /        \\                /     |    \\");
        System.out.println(" makeAnnouncement()  updateComplaint()  /      |    submitComplaint()");
        System.out.println("                                    register() |");
        System.out.println("                                     reactToAnnouncement()      ");
        System.out.println();
        


        // Create instances
        EXER3B_Residents res1 = new EXER3B_Residents("R001", "Juan Dela Cruz");
        EXER3B_Officials off1 = new EXER3B_Officials("O001", "Captain Reyes");

        // Demonstrations
        res1.login();
        res1.register();
        res1.submitComplaint("C001", "Streetlight not working");
        res1.reactToAnnouncement("A001", "Like");

        off1.login();
        off1.makeAnnouncement("Barangay Clean-up Drive this Saturday!");
        off1.updateComplaint("C001", "In Progress");
    }
}
