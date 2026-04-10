import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testArraySort() {
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        Arrays.sort(bogieTypes);

        assertArrayEquals(new String[]{"AC Chair", "Cargo", "First Class", "Guard", "Sleeper"}, bogieTypes);
    }
}