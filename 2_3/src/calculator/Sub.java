package calculator;

import calculator.cal;

/**
 * Created by Osy on 2017-03-16.
 */
public class Sub implements cal {
    @Override
    public void alu(int a, int b) {
        int sub = a-b;
        System.out.println(a + " - " + b + " = " +sub);
    }
}
