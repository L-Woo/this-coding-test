package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이될때까지 {

    // N이 1이 될 때까지 아래의 과정을 반복한다.

    // N에서 1을 뺸다
    // N을 K로 나눈다 -> 단 N이 K로 나누어 떨어진다면 실행(나머지가 0)

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        while(true) {

            if(N % K == 0) {
                count++;
                N = N / K;
            }else {
                N = N - 1;
                count++;
            }

            if(N == 1) {
                System.out.println(count);
                break;
            }

        }

    }

}
