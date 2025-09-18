public class EXER3_ServiceRequest {
    private String category;
    private String status;
    private String description;

    // Constructor
    public EXER3_ServiceRequest(String category, String status, String description) {
        this.category = category;
        this.status = status;
        this.description = description;
    }

    // Getters and Setters
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
