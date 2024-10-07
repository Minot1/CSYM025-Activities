import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;

public class TestWeek2 {

    @Test
    public void testNameGreeter() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // Change system output to ps so that print statements will instead print to here
        System.setOut(ps);

        NameGreeter nameGreeter = new NameGreeter();
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Taner".getBytes());
        // Simulate user input
        System.setIn(in);
        nameGreeter.read(System.in);

        String expected = "Enter your name:";
        assertEquals(expected, baos.toString().trim());
        System.setIn(sysInBackup);

        nameGreeter.greet();
        expected += " \nHello Taner";

        // Trims and replaces are to get rid of EOF difference of Windows (LF to CRLF)
        assertEquals(expected.trim().replace("\r", ""), baos.toString().trim().replace("\r", ""));
    }
}
