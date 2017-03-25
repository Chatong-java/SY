package alu;

/**
 * Created by Osy on 2017-03-16.
 */
public class Add implements Arithmetic {
    public Add(){}
    @Override
    public void alu(int x,int y) {
        int sum = x + y;
        System.out.println(x + " + " + y + " = " +sum);
    }
}
