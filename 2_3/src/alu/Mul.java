package alu;

/**
 * Created by Osy on 2017-03-16.
 */
public class Mul implements Arithmetic {
    @Override
    public void alu(int x, int y) {
        System.out.println(x + " X " + y + " = " +x*y);
    }
}
