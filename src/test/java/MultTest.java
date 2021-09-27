import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultTest {

    @Test
    void multTest() {

        Calculator calc = new Calculator();

        Ints intsCalc = new IntsCalculator();
        int a = 8;
        int b = 4;
        Integer expected = (int) calc.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.MULT)
                .result();

        Integer result = intsCalc.mult(a, b);


        Assertions.assertEquals(expected, result);

    }
}
