import alu.*;

import java.util.Scanner;

/**
 * Created by Osy on 2017-03-25.
 */
public class Calculator {
    Arithmetic arithmetic;
    int X,Y,mode;

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setInt(int x,int y) {
        X = x;
        Y = y;
    }
    public void setArithmetic(Arithmetic arithmetic){
        this.arithmetic = arithmetic;
    }
    public void getAnswer(){
        switch (mode){
            case 1 :
                setArithmetic(new Add());
                arithmetic.alu(X,Y);
                break;
            case 2 :
                setArithmetic(new Sub());
                arithmetic.alu(X,Y);
                break;
            case 3 :
                setArithmetic(new Mul());
                arithmetic.alu(X,Y);
                break;
            case 4 :
                setArithmetic(new Div());
                arithmetic.alu(X,Y);
                break;
        }
    }
}
