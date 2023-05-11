package week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer2{ //implements추가한 후 alt enter로 오버라이딩

    @Override
    public void print(String message) throws IOException {
        //파일프린터 구현하기
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        bw.append(message);
        bw.flush();
        bw.close();
    }
}
