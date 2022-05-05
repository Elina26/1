import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void test_1() {
        double precision = 0.001; double x=-1;
        double actual = Main.exp(precision,x);
        double expected = 0.3680555555555556;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        double precision = 0.01; double x=1;
        double actual = Main.exp(precision,x);
        double expected = 2.708333333333333;
        assertEquals(expected, actual);
    }
}