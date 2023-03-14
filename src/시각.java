package test;

import java.util.Scanner;

public class 시각 {

    static int count;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        count = 0;

        while(N >= 0){
            for(int i = 0; i < 60; i++) {
                for(int j = 0; j < 60; j++) {
                    check(N, i, j);
                }
            }
            N--;
        }
        System.out.println(count);
    }
    static void check(int h, int m, int s) {
        if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
            count++;
        }
    }
}
