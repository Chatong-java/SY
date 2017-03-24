package calculator;

/**
 * Created by Osy on 2017-03-16.
 */
public class Div implements cal {
    @Override
    public void alu(int a, int b) {
        System.out.println(a + " / " + b + " = " +a/b);
    }
}
