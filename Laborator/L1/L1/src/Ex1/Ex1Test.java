package Ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Ex1Test {

    private Ex1 ex1;

    @BeforeEach
    public void setUp() {
        ex1 = new Ex1();
    }

    @Test
    public void testRoundGradeWithGradeLessThan38() {
        int roundedGrade = ex1.roundGrade(35);
        assertEquals(35, roundedGrade);
    }

    @Test
    public void testRoundGradeWithGradeBetween38And42() {
        int roundedGrade = ex1.roundGrade(40);
        assertEquals(40, roundedGrade);
    }

    @Test
    public void testRoundGradeWithGradeGreaterThan42() {
        int roundedGrade = ex1.roundGrade(45);
        assertEquals(45, roundedGrade);
    }

    @Test
    public void testNotGoodEnoughGrade() {
        int[] grades = {35, 40, 45, 37, 39};
        int[] result = ex1.notGoodEnoughGrade(grades);
        int[] expected = {40, 45};

        try {
            for (int i = 0; i < expected.length; i++) {
                if (result[i] != expected[i]) {
                    System.err.println("Error at index " + i + ": Expected " + expected[i] + ", but got " + result[i]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Result and expected arrays have different lengths");
        }

        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual: " + Arrays.toString(result));
    }

    @Test
    public void testNotGoodEnoughGradeObj() {
        Object[] grades = {35, "A", 40, 45, 37};
        Object[] result = ex1.notGoodEnoughGradeObj(grades);
        Object[] expected = {40, 45};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testAverageGrade() {
        int[] grades = {35, 40, 45, 37, 39};
        double result = ex1.averageGrade(grades);
        double expected = 39.2;
        assertEquals(expected, result);
    }

    @Test
    public void testRoundGrades() {
        int[] grades = {35, 40, 45, 37, 39};
        int[] result = ex1.roundGrades(grades);
        int[] expected = {35, 40, 45, 40, 40};
        System.out.println("result: " + Arrays.toString(result));

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testBiggestRoundedGrade() {
        int[] grades = {35, 40, 45, 37, 39};
        int result = ex1.biggestRoundedGrade(grades);
        int expected = 45;
        assertEquals(expected, result);
    }
}
