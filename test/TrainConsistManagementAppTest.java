import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testGroupingBogies() {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));

        Map<String, List<Bogie>> grouped =
                bogies.stream().collect(Collectors.groupingBy(b -> b.name));

        assertEquals(3, grouped.size());
        assertEquals(2, grouped.get("Sleeper").size());
        assertEquals(1, grouped.get("AC Chair").size());
        assertEquals(1, grouped.get("First Class").size());
    }
}