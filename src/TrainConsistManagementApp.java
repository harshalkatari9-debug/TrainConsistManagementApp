public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogieIds = {"B3", "B1", "B7", "B2", "B5"};
        String searchKey = "B2";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}