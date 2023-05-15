# EyUp – Introduction to Software Testing 

## 15th May 2023

### Talk Slides

The slides for the talk can be found
[here](https://github.com/philmcminn/eyup-testing-spr2023/blob/main/presentation/testing.pdf).

You may need to refer to these during the practical part of the session
below.

### Practical

Navigate to the `uk.ac.shef` package (in the `code` directory of this
repository) and open the `BuggyClass.java` class. 

The class contains three methods. Each method has a defect, and you will
need to write JUnit tests to establish the presence of the defect (by
producing a failure) and that, following fixing the defect, the method now
works. 

For each method:

(a) Identify the defect, and write a JUnit test that causes it to fail. (The
JUnit test should fail too.)

(b) Write a JUnit test that _does not_ execute the defect.

(c) Write a JUnit test that executes the defect but _does not_ cause a
failure.

(d) Fix the defect and add it to `FixedClass.java`. Change the test you
wrote in (a) to use the fixed method, and verify that it now passes. 

Add your tests for each method into a new JUnit test class.

## References

* JUnit 5: https://junit.org/junit5
* Assertions in JUnit5:
  https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html
