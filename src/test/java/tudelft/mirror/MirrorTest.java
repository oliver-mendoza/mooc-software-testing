package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {
    @Test
    public void testFullMirrorOdd() {
        assertEquals("aba", new Mirror().mirrorEnds("aba"));
    }
    @Test
    public void testFullMirrorEven() {
        assertEquals("abba", new Mirror().mirrorEnds("abba"));
    }
    @Test
    public void testPartialMirror() {
        assertEquals("ab", new Mirror().mirrorEnds("abXYZba"));
    }
    @Test
    public void testSingleCharMirror() {
        assertEquals("a", new Mirror().mirrorEnds("abca"));
    }
    @Test
    public void testNoMirror() {
        assertEquals("", new Mirror().mirrorEnds("xyz"));
    }
    @Test
    public void testEmptyString() {
        assertEquals("", new Mirror().mirrorEnds(""));
    }
    @Test
    public void testOneChar() {
        assertEquals("a", new Mirror().mirrorEnds("a"));
    }
}