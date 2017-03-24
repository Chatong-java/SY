package calculator;

import calculator.cal;

/**
 * Created by Osy on 2017-03-16.
 */
public class Mul implements cal {
    @Override
    public void alu(int a, int b) {
        System.out.println(a + " X " + b + " = " +a*b);
    }
}
