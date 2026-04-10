import org.junit.jupiter.api.Test;
import java.util.regex.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testValidFormats() {
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        assertTrue(trainPattern.matcher("TRN-1234").matches());
        assertTrue(cargoPattern.matcher("PET-AB").matches());
    }

    @Test
    void testInvalidFormats() {
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        assertFalse(trainPattern.matcher("TRN-12").matches());
        assertFalse(cargoPattern.matcher("PET-abc").matches());
    }
}