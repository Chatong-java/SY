package calculator;

/**
 * Created by Osy on 2017-03-16.
 */
public class Add implements cal {
    public Add(){}
    @Override
    public void alu(int a,int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " +sum);
    }
}
