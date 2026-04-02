import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class TrainConsistManagementAppTest {

    @Test
    void testFilterBogies() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie(1, 50),
                new Bogie(2, 70),
                new Bogie(3, 65)
        );

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        assertEquals(2, result.size());
    }
    class Bogie {
        int id;
        int capacity;

        Bogie(int id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }
    }
}