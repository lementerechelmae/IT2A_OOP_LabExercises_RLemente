public class EXER2_CarTester {
    public static void main(String[] args) {
        // Car 1 (default constructor)
        EXER2_Car car1 = new EXER2_Car();

        // 9 Cars with parameterized constructor
        EXER2_Car car2 = new EXER2_Car("Toyota", "Corolla", "Red", "ABC-1234", "CHS-001", 2020, "Gasoline");
        EXER2_Car car3 = new EXER2_Car("Honda", "Civic", "Blue", "XYZ-5678", "CHS-002", 2021, "Gasoline");
        EXER2_Car car4 = new EXER2_Car("Ford", "Mustang", "Black", "MST-9988", "CHS-003", 2019, "Gasoline");
        EXER2_Car car5 = new EXER2_Car("Tesla", "Model S", "White", "TES-3456", "CHS-004", 2022, "Electric");
        EXER2_Car car6 = new EXER2_Car("BMW", "X5", "Gray", "BMW-2222", "CHS-005", 2018, "Diesel");
        EXER2_Car car7 = new EXER2_Car("Mercedes", "C-Class", "Silver", "MER-7890", "CHS-006", 2021, "Gasoline");
        EXER2_Car car8 = new EXER2_Car("Hyundai", "Tucson", "Green", "HYU-1122", "CHS-007", 2020, "Hybrid");
        EXER2_Car car9 = new EXER2_Car("Chevrolet", "Camaro", "Yellow", "CAM-4455", "CHS-008", 2019, "Gasoline");
        EXER2_Car car10 = new EXER2_Car("Nissan", "Altima", "Blue", "NIS-6677", "CHS-009", 2021, "Gasoline");

        // Store cars in an array for easier looping
        EXER2_Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};

        // Display all cars
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + " Info:");
            cars[i].displayInfo();
            System.out.println("---------------");
        }
    }
}
