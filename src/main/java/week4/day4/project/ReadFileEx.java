package week4.day4.project;

import java.io.*;

public class ReadFileEx {
    public String[] read(){
        return new String[5];
    }
    //FileReader x
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\daeon\\java-project02\\1.병원정보서비스 2022.10..csv"));
        System.out.println(br.readLine());
    }
}
