import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class SkillDemoTester {
    @Test
    public void testTestFile1() throws IOException {
        assertEquals(44,
                SkillDemo1.addDigits(Files.readString(Path.of(("tester" +
                        ".md")))));
    }
}
