package com.company;

class Main {
    static int[] nansu = new int[100];
    public static void main(String[] args) {
        //난수 출력 0~100 까지 난수를 입력받아 삽입정렬한다 //
        setArray(nansu);

        System.out.println("정렬되기전 배열");
        printArray(nansu);
        insertSort(nansu);
        System.out.println("정렬된후 배열");
        printArray(nansu);
    }
    //난수값을 받아 삽입정렬 수행
    static int[] insertSort(int[] arr) {

        int i, j, a, b=0;
        int cnt = 0;

        for ( i=1 ; i< 100 ; i++ ) {
            a = arr[i];
            j = i;

            while(j >=1 && arr[j-1] > a) {    //현재 i번째 값과 i번째 전값을 비교
                arr[j] = arr[j-1];
                j--;
                cnt++;
            }
            //for문 수행하는 횟수
            arr[j] = a;
            cnt++;
        }
        System.out.println("정렬 횟수 : "+cnt+"번");
        return arr; //정렬한 함수 값 리턴
    }
    //출력문
    static void printArray(int[] arr) {
        for (int i=0; i<100; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void setArray(int[] ranArray) {
        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = (int) (Math.random() * 200);  //최대 199뜸

            for (int j = 0; j < i; j++) {               //이전에 나왓을경우 더돌림
                if (ranArray[i] == ranArray[j]) {
                    i--;
                    break;
                }
            }
        }
    }
}