import calculator.*;

import java.util.Scanner;

/**
 * Created by Osy on 2017-03-16.
 */
public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 두개를 입력해주세요");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("원하는 모드를 선택해주세요");
        System.out.println("1 : 덧셈 ");
        System.out.println("2 : 뺄셈 ");
        System.out.println("3 : 곱셈 ");
        System.out.println("4 : 나눗셈 ");

        int mode = sc.nextInt();

        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();

        switch (mode){
            case 1 :
                calcalcalcal(a,b,add);
                break;
            case 2 :
                calcalcalcal(a,b,sub);
                break;
            case 3 :
                calcalcalcal(a,b,mul);
                break;
            case 4 :
                calcalcalcal(a,b,div);
                break;
        }
    }
    public static void calcalcalcal(int a, int b, cal c){
        c.alu(a,b);
    }
}