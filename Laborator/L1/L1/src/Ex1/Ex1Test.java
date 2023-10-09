package Ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.rules.ExpectedException;
import utils.tstUtils;

public class Ex1Test {

    private static final String TEST_ONE = "Array with insufficient grades";
    private static final String TEST_TWO = "Average grade";
    private static final String TEST_THREE = "Array with rounded grades";
    private static final String TEST_FOUR = "Maximum rounded grade";


    private static final String SUCCESSFUL = "was successful";
    private static final String FAILED = "has failed";

    @BeforeEach
    public void setUp() {
        Ex1 ex1 = new Ex1();
        utils.tstUtils tstUtils = new tstUtils();
    }

    @Test
    public void testFailingGrades() {

        int[] grades = {84, 29, 72, 38, 41};
        int[] result = Ex1.getFailingGrades(grades);
        int[] expected = {29, 38};

        try {
            Assertions.assertArrayEquals(expected, result);
            utils.tstUtils.testLogger(TEST_ONE, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            utils.tstUtils.testLogger(TEST_ONE, utils.tstUtils.FAILED);
        }

    }

    @Test
    public void testFailingGradesNull() {

        int[] grades = {};
        assertThrows(IllegalArgumentException.class, ()-> Ex1.getFailingGrades(grades));

    }

    @Test
    public void testGetAverageGrade() {
        int[] grades = {84, 29, 72, 38, 41};
        double expected = 52.8;

        double result = Ex1.getAverageGrade(grades);
        try {
            assertEquals(expected, result);
            utils.tstUtils.testLogger(TEST_TWO, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            utils.tstUtils.testLogger(TEST_TWO, utils.tstUtils.FAILED);
        }

    }

    @Test
    public void testGetAverageGradeFail() {
        int[] grades = {};
        assertThrows(IllegalArgumentException.class, ()->Ex1.getAverageGrade(grades));

    }



    @Test
    public void testRoundedGrades() {
        int[] grades = {84, 29, 72, 38, 41};
        int[] expected = {85, 29, 72, 40, 41};

        int[] result = Ex1.getRoundedGrades(grades);
        try {
            Assertions.assertArrayEquals(expected, result);
            utils.tstUtils.testLogger(TEST_THREE, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            utils.tstUtils.testLogger(TEST_THREE, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testRoundedGradesFail() {
        int[] grades = {};

        assertThrows(IllegalArgumentException.class, ()->Ex1.getRoundedGrades(grades));
    }

    @Test
    public void testMaxGrade() {
        int[] grades = {84, 29, 72, 38, 41};
        int expected = 85;

        int result = Ex1.getMaxRoundedGrade(grades);

        try {
            Assertions.assertEquals(expected, result);
            utils.tstUtils.testLogger(TEST_FOUR, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            utils.tstUtils.testLogger(TEST_FOUR, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testMaxGradeFail() {
        int[] grades = {};

        assertThrows(IllegalArgumentException.class, ()->Ex1.getMaxRoundedGrade(grades));

    }
}

