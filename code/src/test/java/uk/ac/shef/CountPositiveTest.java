package uk.ac.shef;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPositiveTest {

    // (a) Identify the defect: "x[i] >= 0" includes zero as a positive number, zero does not have a sign
    @Test
    public void countPositive() {
        // anything with zero in the array
        int[] x = {0};

        // note that this will fail!
        // assertEquals(0, BuggyClass.countPositive(x));

        assertEquals(0, FixedClass.countPositive(x));
    }

    // (b) A JUnit test case that does not execute the defect
    @Test
    public void countPositive_DoesNotExecuteDefect() {
        // The defective if condition is not executed when the inputted array is null or of zero length.
        int[] x = {};
        assertEquals(0, BuggyClass.countPositive(x));
    }

    // (c) A JUnit test that executes the defect but does not cause a failure
    @Test
    public void countPositive_ExecutesDefectButNoFailure() {
        // When the array contains elements but none of them are zero
        int[] x = {1};
        assertEquals(1, BuggyClass.countPositive(x));
    }
}
