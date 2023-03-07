import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeBookTester {
    private GradeBook g1;
    private GradeBook g2;

 // Creating a method to setup initial values before running any tests.
    @BeforeEach
    public void setUp() {
        // Creating two new GradeBook objects with size 5.
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        // Adding scores to GradeBook objects "g1" and "g2".
        g1.addScore(55);
        g1.addScore(77);
        g2.addScore(88);
        g2.addScore(95);
    }

    // Creating a method to reset the values of objects after running the tests.
    @AfterEach
    public void tearDown() {
        // Setting the values of objects "g1" and "g2" to null.
        g1 = null;
        g2 = null;
    }

    // Creating a test case to check the sum of scores.
    @Test
    public void testSum() {
        // Testing the sum of scores for both objects and checking if they are equal to the expected value.
        assertEquals(132, g1.sum(), 0.001);
        assertEquals(183, g2.sum(), 0.001);
    }

    // Creating a test case to check the minimum score.
    @Test
    public void testMinimum() {
        // Testing the minimum score for both objects and checking if they are equal to the expected value.
        assertEquals(55, g1.minimum(), 0.001);
        assertEquals(88, g2.minimum(), 0.001);
    }

    // Creating a test case to check the addition of scores.
    @Test
    public void addScoreTest() {
        // Testing the addition of scores for both objects and checking if they are equal to the expected value.
        assertEquals("55.0 77.0 ", g1.toString());
        assertEquals("88.0 95.0 ", g2.toString());
    }

    // Creating a test case to check the final score.
    @Test
    public void finalScoreTest() {
        // Testing the final score for both objects and checking if they are equal to the expected value.
        assertEquals(77, g1.finalScore(), 0.001);
        assertEquals(95, g2.finalScore(), 0.001);
    }
}