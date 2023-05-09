package week4.day2;

public class PrintStatUtils {
    public static String makePhramidLine(int height, int i) {
        return String.format("%s%s\n", " ".repeat(height-i-1),"*".repeat(2*i+1));
    }
}
