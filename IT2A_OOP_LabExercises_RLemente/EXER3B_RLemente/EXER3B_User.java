// Base Class
class EXER3B_User {
    protected String userId;
    protected String name;

    public EXER3B_User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }
}

// Officials subclass
class EXER3B_Officials extends EXER3B_User {
    public EXER3B_Officials(String userId, String name) {
        super(userId, name);
    }

    public void makeAnnouncement(String content) {
        System.out.println(name + " made an announcement: " + content);
    }

    public void updateComplaint(String complaintId, String newStatus) {
        System.out.println(name + " updated Complaint " + complaintId + " to status: " + newStatus);
    }
}

// Residents subclass
class EXER3B_Residents extends EXER3B_User {
    public EXER3B_Residents(String userId, String name) {
        super(userId, name);
    }

    public void register() {
        System.out.println(name + " has registered in the system.");
    }

    public void reactToAnnouncement(String announcementId, String reaction) {
        System.out.println(name + " reacted to Announcement " + announcementId + " with: " + reaction);
    }

    public void submitComplaint(String complaintId, String description) {
        System.out.println(name + " submitted Complaint " + complaintId + ": " + description);
    }
}
