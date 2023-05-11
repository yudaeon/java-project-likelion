package codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1097_2 {
    public static void main(String[] args) throws IOException {
        //바둑판을 세팅한다.(19*19)
        //가로번호, 세로번호 int a, int b
        //입력값을 받아서 뒤집기 횟수가 입력된다.
        //단 n은 10이하의 자연수이다
        //2차원 배열, n차원 배열
        //뒤집어야할 좌표가 횟수만큼 입력이 된다.
        //좌표 찾아서 뒤집는다.

        int[][] arr = new int[19][19]; //바둑판 세팅

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 19; i++) {
            String[] line = br.readLine().split(" "); //한 라인 만들어서 공백 만들기
            for (int j = 0; j < 19; j++) {
                arr[i][j]  = Integer.parseInt(line[j]); //int 이므로 형변환 시키기
            }
        }
        int reverseCount = Integer.parseInt(br.readLine()); //형변환

        for (int i = 0; i < reverseCount; i++) {

           String[] location = br.readLine().split(" "); //10,10
            int x = Integer.parseInt(location[0]) -1; //형변환 integer.parseint사용
            int y = Integer.parseInt(location[1]) -1;

            // 좌표찾아서 뒤집기
            for (int j = 0; j < 19; j++) {
                arr[x][j] = arr[x][j] == 1 ? 0 : 1; //삼항연산자 사용 1이면 0으로 아니면 1로
            }
            for (int j = 0; j < 19; j++) {
                arr[j][y] = arr[j][y] == 1 ? 0 : 1;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
