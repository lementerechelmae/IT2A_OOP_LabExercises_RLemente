public class EXER3B_Resident extends EXER3B_User {
    // ✅ Constructor is REQUIRED to match your tester calls
    public EXER3B_Resident(String name, String username, String password) {
        super(name, username, password);
    }

    public void register() {
        System.out.println(getName() + " has been registered as a resident.");
    }

    public String submitComplaint(String description) {
        System.out.println(getName() + " submitted a complaint: " + description);
        return description;
    }

    public void reactToAnnouncement(String announcement, String reaction) {
        System.out.println(getName() + " reacted to announcement '" + announcement + "': " + reaction);
    }
}
