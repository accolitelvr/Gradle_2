/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testCase1() throws Exception {
        App testApp = new App("hello!");
        String[] output = testApp.UpperCaseOfMessage();
        assertEquals("standard message : hello!", output[0]);
        assertEquals("capitalized by org.apache.commons.lang.WordUtils : Hello!", output[1]);
    }

    @Test
    void testCase2() throws Exception {
        App testApp = new App();
        String[] output = testApp.UpperCaseOfMessage();
        assertEquals("standard message : hello world!", output[0]);
        assertEquals("capitalized by org.apache.commons.lang.WordUtils : Hello World!", output[1]);
    }
}
