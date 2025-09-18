// ----------------- TESTER CLASS -----------------
public class EXER3A_TransportationTester {
    public static void main(String[] args) {

          // ----- Print Class Hierarchy -----
        System.out.println("CLASS HIERARCHY DIAGRAM");
        System.out.println("EXER3A_Transportation");
        System.out.println(" ├── AirTransport");
        System.out.println(" │    ├── Helicopter");
        System.out.println(" │    ├── Airplane");
        System.out.println(" │    └── SpaceShuttle");
        System.out.println(" ├── LandTransport");
        System.out.println(" │    ├── Truck");
        System.out.println(" │    ├── SUV");
        System.out.println(" │    ├── Tricycle");
        System.out.println(" │    ├── Motorcycle");
        System.out.println(" │    └── Kariton");
        System.out.println(" └── WaterTransport");
        System.out.println("      ├── Boat");
        System.out.println("      └── Submarine");
        System.out.println();

        // Air Transport
        Helicopter heli = new Helicopter("Rescue Helicopter", 6);
        Airplane plane = new Airplane("Commercial Airplane", 180);
        SpaceShuttle shuttle = new SpaceShuttle("NASA Space Shuttle", 7);

        // Land Transport
        Truck truck = new Truck("Cargo Truck", 2);
        SUV suv = new SUV("Family SUV", 7);
        Tricycle trike = new Tricycle("Public Tricycle", 4);
        Motorcycle motor = new Motorcycle("Sports Motorcycle", 2);
        Kariton kariton = new Kariton("Manual Kariton", 1);

        // Water Transport
        Boat boat = new Boat("Fishing Boat", 10);
        Submarine sub = new Submarine("Nuclear Submarine", 100);

        // Display Info
        heli.displayInfo();
        plane.displayInfo();
        shuttle.displayInfo();

        truck.displayInfo();
        suv.displayInfo();
        trike.displayInfo();
        motor.displayInfo();
        kariton.displayInfo();

        boat.displayInfo();
        sub.displayInfo();
        
    }
}