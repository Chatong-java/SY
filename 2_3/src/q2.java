import alu.*;

import java.util.Scanner;

/**
 * Created by Osy on 2017-03-16.
 */
public class Q2 {
    Calculator cal = new Calculator();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Q2 q = new Q2();
        q.Mode();
        q.Integer();
        q.cal.getAnswer();
    }

    public void Mode(){
        System.out.println("원하는 모드를 선택해주세요");
        System.out.println("1 : 덧셈 ");
        System.out.println("2 : 뺄셈 ");
        System.out.println("3 : 곱셈 ");
        System.out.println("4 : 나눗셈 ");
        int mode = sc.nextInt();

        cal.setMode(mode);
    }
    public void Integer(){
        System.out.println("숫자 두개를 입력해주세요");
        int x = sc.nextInt();
        int y = sc.nextInt();

        cal.setInt(x,y);
    }
}