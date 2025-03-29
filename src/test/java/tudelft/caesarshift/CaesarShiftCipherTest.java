package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "message={0}, shift={1}, expected={2}")
    @CsvSource({
            "abc, 3, def",
            "xyz, 3, abc",
            "hello world, 5, mjqqt btwqi",
            "abc, -3, xyz",
            "xyz, -3, uvw",
            "abc123, 2, invalid",
            "a b c, 1, b c d"
    })
    public void testCaesarShiftCipher(String message, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }
}