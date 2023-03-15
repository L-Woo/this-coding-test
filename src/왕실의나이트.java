package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 왕실의나이트 {

    // 8 x 8 크기의 체스판
    // 나이트의 이동은 2 가지 경우
    // 1. 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동
    // 2. 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동
    // 나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의 수를 출력하라
    // r -> 1 ~ 8, c -> a ~ h
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[8][8];
        int[] dr = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dc = {-1, -2, -2, -1, 1, 2, 2, 1};

        String str = br.readLine();

        int C = str.charAt(0) - 'a';
        int R = str.charAt(1) - '1';
        int count = 0;

        for(int i = 0; i < 8; i++) {

            int nr = R + dr[i];
            int nc = C + dc[i];

            if(nr >= 0 && nr < 8 && nc >= 0 && nc < 8) {
                count++;
            }

        }
        System.out.println(count);
    }

}
