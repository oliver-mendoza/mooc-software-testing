package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class GHappyTest {
    @ParameterizedTest
    @CsvSource({
            "'xxggxx', true",
            "'xxgxx', false",
            "'xxggyygxx', false",
            "'gg', true",
            "'g', false",
            "'ggg', true",
            "'gggg', true",
            "'ggxgg', true",
            "'xg', false",
            "'gx', false"
    })
    public void testGHappy(String input, boolean expected) {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy(input);
        Assertions.assertEquals(expected, result);
    }
}