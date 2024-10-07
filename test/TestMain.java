import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    public void testMain() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bos);
        System.setOut(ps);
        Main.main(new String[0]);
        String output = bos.toString();
        String expected = "Hello world!";
        assertEquals(expected.trim().replace("\r", ""), output.trim().replace("\r", ""));
    }
}
