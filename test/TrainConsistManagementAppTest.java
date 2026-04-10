import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSearchFound() {
        String[] bogieIds = {"B3", "B1", "B7", "B2", "B5"};
        String searchKey = "B2";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }

    @Test
    void testSearchNotFound() {
        String[] bogieIds = {"B3", "B1", "B7", "B2", "B5"};
        String searchKey = "B9";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        assertFalse(found);
    }
}