public class EXER2_Car {
    private String brand;
    private String model;
    private String color;
    private String plateNo;
    private String chassisNo;
    private int year;
    private String engineType;

    // Default constructor
    public EXER2_Car() {
        this.brand = "No Brand";
        this.model = "No Model";
        this.color = "No Color";
        this.plateNo = "No Plate Number";
        this.chassisNo = "No Chassis Number";
        this.year = 0;
        this.engineType = "Unknown";
    }

    // Parameterized constructor
    public EXER2_Car(String brand, String model, String color, String plateNo, String chassisNo, int year, String engineType) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.year = year;
        this.engineType = engineType;
    }

    // Display info method
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Plate No: " + this.plateNo);
        System.out.println("Chassis No: " + this.chassisNo);
        System.out.println("Year: " + this.year);
        System.out.println("Engine Type: " + this.engineType);
    }
}
