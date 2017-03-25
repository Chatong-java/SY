package alu;

/**
 * Created by Osy on 2017-03-16.
 */
public class Sub implements Arithmetic {
    @Override
    public void alu(int x, int y) {
        int sub = x-y;
        System.out.println(x + " - " + y + " = " +sub);
    }
}
