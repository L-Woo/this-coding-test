package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class 큰수의법칙 {

    // 주어진 수들을 M번 더하여 가장 큰 수를 만든다.
    // 단 배열의 특정한 인덱스(번호)에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없다.
    // 같은 숫자라도 배열의 인덱스가 다르면 다른 숫자이다.

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = 0;
        Integer[] arr = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int count = 0;
        for(int i = 0; i < M; i++) {

            if(count == K) {
                ans += arr[1];
                count = 0;
                continue;
            }

            ans += arr[0];
            count++;

        }
        System.out.println(ans);
    }

}

