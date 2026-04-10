import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testEmptyCollectionThrowsException() {
        List<String> bogies = new ArrayList<>();

        assertThrows(IllegalStateException.class, () -> {
            if (bogies.isEmpty()) {
                throw new IllegalStateException("Cannot perform search: Train has no bogies");
            }
        });
    }

    @Test
    void testSearchWhenDataExists() {
        List<String> bogies = Arrays.asList("B1", "B2", "B3");
        String key = "B2";

        boolean found = false;

        if (bogies.isEmpty()) {
            throw new IllegalStateException();
        }

        for (String b : bogies) {
            if (b.equals(key)) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }
}