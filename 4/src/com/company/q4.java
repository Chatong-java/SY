package com.company;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args){

        System.out.println("숫자하나를 입력해주세요");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i<2){
            System.out.println("2이상의 수를 다시 적어주세요");
            i = sc.nextInt();
        }
        long fSum = fibonacci(i);
        System.out.println(fSum);
    }

    public static long fibonacci(int a){
        if (a == 1 || a == 2){
            return 1;
        }
        long f = fibonacci(a-1)+fibonacci(a-2);
        return f;
    }
}
