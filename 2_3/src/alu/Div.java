package alu;

/**
 * Created by Osy on 2017-03-16.
 */
public class Div implements Arithmetic {
    @Override
    public void alu(int x, int y) {
        System.out.println(x + " / " + y + " = " +x/y +" 나머지 : " +x%y);
    }
}
