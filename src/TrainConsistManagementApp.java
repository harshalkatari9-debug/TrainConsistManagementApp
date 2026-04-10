class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe Cargo Assignment");
            }
            this.cargo = cargo;
            System.out.println("Cargo Assigned: " + cargo);
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Assignment Attempt Completed");
        }
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        GoodsBogie bogie = new GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        GoodsBogie safeBogie = new GoodsBogie("Cylindrical");
        safeBogie.assignCargo("Petroleum");
    }
}