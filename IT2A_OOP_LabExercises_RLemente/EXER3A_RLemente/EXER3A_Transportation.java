// Base class
class EXER3A_Transportation {
    String name;
    int capacity;

    public EXER3A_Transportation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Transportation: " + name + ", Capacity: " + capacity);
    }
}

// ----------------- AIR TRANSPORT -----------------
class AirTransport extends EXER3A_Transportation {
    public AirTransport(String name, int capacity) {
        super(name, capacity);
    }
}

class Helicopter extends AirTransport {
    public Helicopter(String name, int capacity) {
        super(name, capacity);
    }
}

class Airplane extends AirTransport {
    public Airplane(String name, int capacity) {
        super(name, capacity);
    }
}

class SpaceShuttle extends AirTransport {
    public SpaceShuttle(String name, int capacity) {
        super(name, capacity);
    }
}

// ----------------- LAND TRANSPORT -----------------
class LandTransport extends EXER3A_Transportation {
    public LandTransport(String name, int capacity) {
        super(name, capacity);
    }
}

class Truck extends LandTransport {
    public Truck(String name, int capacity) {
        super(name, capacity);
    }
}

class SUV extends LandTransport {
    public SUV(String name, int capacity) {
        super(name, capacity);
    }
}

class Tricycle extends LandTransport {
    public Tricycle(String name, int capacity) {
        super(name, capacity);
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle(String name, int capacity) {
        super(name, capacity);
    }
}

class Kariton extends LandTransport {
    public Kariton(String name, int capacity) {
        super(name, capacity);
    }
}

// ----------------- WATER TRANSPORT -----------------
class WaterTransport extends EXER3A_Transportation {
    public WaterTransport(String name, int capacity) {
        super(name, capacity);
    }
}

class Boat extends WaterTransport {
    public Boat(String name, int capacity) {
        super(name, capacity);
    }
}

class Submarine extends WaterTransport {
    public Submarine(String name, int capacity) {
        super(name, capacity);
    }
}