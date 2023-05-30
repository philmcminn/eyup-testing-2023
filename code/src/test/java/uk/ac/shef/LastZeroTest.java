package uk.ac.shef;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LastZeroTest {

    // (a) Identify the defect:

    // The method returns the first zero, not the last. There is a mistake in that
    // /elements are being considered in reverse order. This means the "defect"
    // could be interpreted to be in one of multiple places, for example:
    //
    // (1) the for loop header, which should start with i = x.length - 1 and count down to i = 0
    // (i.e., the complete loop header should be for (int i = x.length-1; i >= 0; i--))
    //
    // (2) in the if condition, where instead of x[i], it could be x[x.length - i - 1], and
    // the return statement in the true part would then be return i+1
    //
    // Other interpretations are possible!
    //

    @Test
    public void lastZero() {
        // Where there is more than one zero in the array x, the index of the first zero
        // is returned, rather than the last.
        int[] x = {0, 0};

        // note that this will fail!
        // assertEquals(1, BuggyClass.findLast(x, 1));

        assertEquals(1, FixedClass.lastZero(x));
    }

    // (b) A JUnit test case that does not execute the defect
    @Test
    public void lastZero_DoesNotExecuteDefect() {
        //  If we say the defect is (1) then the defect cannot be avoided, since at least
        //  part of the loop header (int i=0) is always executed.
        //
        //  If the defect is (2) then a null inputted array would never execute the defect.
        assertThrows(NullPointerException.class, () -> {
            BuggyClass.lastZero(null);
        });
    }

    // (c) A JUnit test that executes the defect but does not cause a failure
    @Test
    public void lastZero_ExecutesDefectButNoFailure() {
        // There are multiple ways in which this could happen.
        // Here the last zero is the first zero, so the result is
        // "coincidentally" correct.
        int[] x = {0};
        assertEquals(0, BuggyClass.lastZero(x));
    }
}
