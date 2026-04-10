import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testValidCapacity() throws InvalidCapacityException {
        Bogie b = new Bogie("Sleeper", 72);
        assertEquals(72, b.capacity);
    }

    @Test
    void testInvalidCapacity() {
        assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("AC Chair", -5);
        });
    }
}