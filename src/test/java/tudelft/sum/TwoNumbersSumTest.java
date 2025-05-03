package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
public class TwoNumbersSumTest {

    private final TwoNumbersSum calculator = new TwoNumbersSum();

    @Test
    public void testSimpleAddition() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 6));
        Assertions.assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    @Test
    public void testDifferentLengths() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0));
        Assertions.assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    @Test
    public void testWithCarryAtEnd() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0));
        Assertions.assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    @Test
    public void testZerosOnly() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
        Assertions.assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    @Test
    public void testOneNumberIsZero() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        Assertions.assertEquals(expected, calculator.addTwoNumbers(first, second));
    }
}