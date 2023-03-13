package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상하좌우 {

    // N x N 크기의 정사각형 공간
    // 가장 왼쪽 위 좌표는 (1, 1), 가장 오른쪽 아래 좌표는 (N, N)
    // 상, 하, 좌, 우 방향으로 이동
    // 시작 좌표는 항상 (1, 1)
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int r = 1, c = 1;

        // st에 토큰이 없을때까지 실행
        while(st.hasMoreTokens()) {
            // 문자열 명령어를 하나씩 수행
            switch (st.nextToken()) {
                //  L일 경우
                case "L" :
                    // 범위를 벗어나는 경우 바로 다음 명령 수행
                    if(c - 1 <= 0) {
                        break;
                    }
                    // 범위를 벗어나지 않는 다면 이동
                    c -= 1;
                    break;
                case "R" :
                    if(c + 1 > N) {
                        break;
                    }
                    c += 1;
                    break;
                case "U" :
                    if(r - 1 <= 0) {
                        break;
                    }
                    r -= 1;
                    break;
                case "D" :
                    if(r + 1 > N) {
                        break;
                    }
                    r += 1;
                    break;
            }
        }

        System.out.println(r + " " + c);

    }

}
