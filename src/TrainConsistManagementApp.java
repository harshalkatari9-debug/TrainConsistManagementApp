public class TrainConsistManagementApp {
    public static void main(String[] args) {
        int[] capacities = {72, 78, 24, 50, 60};

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        for (int c : capacities) {
            System.out.println(c);
        }
    }
}