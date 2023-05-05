package codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeup1084 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int color1 = sc.nextInt();
        int color2 = sc.nextInt();
        int color3 = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = color1 * color2 * color3;
        for (int i = 0; i < color1; i++) {
            for (int j = 0; j < color2; j++) {
                String str = "";
                for (int k = 0; k < color3; k++) {
                    str += i + " " + j + " " + k + " \n";
                }
                bw.write(str);
                bw.flush();
            }
        }
        System.out.println(cnt);
    }
}
