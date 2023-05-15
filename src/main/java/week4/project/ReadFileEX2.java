package week4.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEX2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\daeon\\java-project02\\hospital_info_0920_utf8.csv"));
        System.out.println(br.readLine());
    }
}
