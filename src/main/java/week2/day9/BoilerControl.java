package week2.day9;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45;//물온도
        int roomTemperature = 22; //실내온다

        boolean check = waterTemperature < 50 && roomTemperature < 24;
        System.out.printf("check: %b\n", check);
    }
}
