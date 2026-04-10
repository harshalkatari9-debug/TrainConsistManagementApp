class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid Capacity");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            Bogie b2 = new Bogie("AC Chair", -10);

            System.out.println(b1.name + " " + b1.capacity);
            System.out.println(b2.name + " " + b2.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}