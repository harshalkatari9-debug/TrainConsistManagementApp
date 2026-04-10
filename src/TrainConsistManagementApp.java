import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        Arrays.sort(bogieTypes);

        System.out.println(Arrays.toString(bogieTypes));
    }
}