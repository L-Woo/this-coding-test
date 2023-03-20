package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자카드게임 {

    // N 행 M 열
    // 각 행 중에서 가장 낮은 숫자를 뽑는다.
    // 뽑은 카드 중에서 가장 높은 숫자를 채택

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                min = Math.min(min, Integer.parseInt(st.nextToken()));
            }
            max = Math.max(max, min);
            min = Integer.MAX_VALUE;
        }

        System.out.println(max);

    }

}
