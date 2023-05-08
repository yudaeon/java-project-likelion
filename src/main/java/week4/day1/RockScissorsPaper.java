package week4.day1;

import java.util.Scanner;

public class RockScissorsPaper {

    //wint tie lose
    public String play(int user, int computer) {

        if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockScissorsPaper rpc = new RockScissorsPaper();
        System.out.println(rpc.play(sc.nextInt(),sc.nextInt()));
        }
    }
