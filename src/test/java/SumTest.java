import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest {

    @Test
    void sumTest() {

        Calculator calc = new Calculator();

        Ints intsCalc = new IntsCalculator();
        int a = 2;
        int b = 5;
        Integer expected = (int) calc.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUM)
                .result();

        Integer result = intsCalc.sum(a, b);


        Assertions.assertEquals(expected, result);

    }
}
