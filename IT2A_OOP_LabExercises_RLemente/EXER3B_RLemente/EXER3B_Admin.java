public class EXER3B_Admin extends EXER3B_User {
    public EXER3B_Admin(String name, String username, String password) {
        super(name, username, password);
    }

    public void makeAnnouncement(String content) {
        System.out.println("Admin " + getName() + " posted announcement: " + content);
    }

    public void updateComplaint(String complaint, String newStatus) {
        System.out.println("Admin " + getName() + " updated complaint '" + complaint + "' to status: " + newStatus);
    }
}
