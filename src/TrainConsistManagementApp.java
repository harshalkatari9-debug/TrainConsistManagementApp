import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<String> bogies = new ArrayList<>();
        String searchKey = "B1";

        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies");
        }

        boolean found = false;

        for (String b : bogies) {
            if (b.equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}