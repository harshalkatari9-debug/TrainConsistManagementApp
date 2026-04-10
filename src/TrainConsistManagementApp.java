public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogieIds = {"B1", "B2", "B3", "B5", "B7"};
        String key = "B5";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(found);
    }
}