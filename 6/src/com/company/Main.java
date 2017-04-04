package com.company;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        m.printLotto(m.lotto());
    }
    public int[] lotto(){

        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++){
            double ran = Math.random();
            int random = (int)(ran*45) +1;
            lotto[i] = random;
            for (int j = 0; j < i; j++){
                if (lotto[j] == random){
                    i--;
                    break;
                }
            }
        }
        return lotto;
    }
    public void printLotto(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
