package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게임개발 {

    // N x M 크기의 직사각형 맵
    // 캐릭터는 동서남북중 한 곳을 바라본다.
    // 캐릭터는 상하좌우 이동가능, 단 바다로 되어 있는 공간에는 갈 수 없다.
    // 1. 현재 위치에서 현재 방향을 기준으로 왼쪽 방향부터 차례대로 갈 곳을 정한다.
    // 2. 캐릭터의 바로 왼쪽 방향에 아직 가보지 않은 칸이 존재한다면, 왼쪽으로 회전만 수행하고 1단계로 돌아간다.
    // 3. 만약 네 방향 모두 이미 가본 칸이거나 바다로 되어 있는 칸인 경우에는, 바라보는 방향을 유지한 채로 한 칸 뒤로 가고 1단계로 돌아간다.
    // 이때 뒤쪽 방향이 바다인 칸이라 뒤로 갈 수 없는 경우에는 움직임을 멈춘다.

    static int N, M;
    static int[][] map, visited;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());
        int dirCount = 0;
        int count = 1;

        for(int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }



        visited[x][y] = 1;
        // 0 : 북 / 1 : 동 / 2 : 남 / 3 : 서
        while (true) {

            if(dir - 1 >= 0) {
                dir--;
            }else {
                dir = 3;
            }

            int nx = x + dr[dir];
            int ny = y + dc[dir];
            if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if(map[nx][ny] == 0 && visited[nx][ny] == 0) {
                    visited[nx][ny] = 1;
                    count++;
                    dirCount = 0;
                    x = nx;
                    y = ny;
                    continue;
                }
            }else {
                dirCount++;
            }
            if(dirCount == 4) {
                if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    nx = x - dr[dir];
                    ny = y - dc[dir];
                    if(map[nx][ny] == 0){
                        x = nx;
                        y = ny;
                    }
                }else {
                    break;
                }
                dirCount = 0;
            }

        }
        System.out.println(count);
    }

}
