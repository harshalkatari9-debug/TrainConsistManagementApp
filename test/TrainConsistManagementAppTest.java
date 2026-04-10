import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    public void testFilterBogies() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        List<Bogie> result = TrainConsistManagementApp.filterBogies(bogies);

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }
}