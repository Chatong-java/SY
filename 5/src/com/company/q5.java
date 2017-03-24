package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by seung-yeoloh on 2017. 3. 17..
 */
public class q5 {
    public static void main(String[] args){
        System.out.println("숫자하나를 입력해주세요");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        ArrayList<Integer> sosuList = new ArrayList<>();
        sosuList.add(2);                            //2는 베이스로 넣어줍니다

        for (int j = 3 ; j <= input ; j++ ){
            int check = 0;
            for (int num = 0 ; num < sosuList.size() ; num++ ){
                if(j % sosuList.get(num) != 0){
                    check++;                        //sosulist의 값들로 전부나눔 나머지가 0아니면 증가
                }
            }
            if (check == sosuList.size()){          //check가 리스트사이즈와 같다면
                sosuList.add(j);                    //모든 소수로 나뉘지 않았으므로 리스트에 추가
            }
        }
        System.out.println(input +" 이하의 소수의 갯수는 "
                + sosuList.size() + "개 입니다");
    }
}