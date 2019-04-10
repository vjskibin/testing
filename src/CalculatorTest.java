import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        assertThat("Plus check: ", calculator.plus(0.0000001, 0.0000007),equalTo(0.0000008));
    }

    @Test
    public void plusBig() {
        Calculator calculator = new Calculator();
        assertThat("PlusBig check: ", calculator.plus(2000000000.0, 4000000000.0),equalTo(6000000000.0));
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        assertThat("Multiply check: ", calculator.division(10.0, 0.0),equalTo(0.0));
    }

    @Test
    public void division() {
        Calculator calculator = new Calculator();
        assertThat("Division check: ", calculator.division(10.0, 0.0),equalTo(0.0));
    }

    @Test
    public void factorial() {
        Calculator calculator = new Calculator();
        assertThat("Fact check: ", calculator.factorial(21),equalTo(51090942171709440000.0));
    }

    @Test
    public void factorialNegative() {
        Calculator calculator = new Calculator();
        assertThat("FactNegative check: ", calculator.factorial(-5),equalTo(0));
    }
}