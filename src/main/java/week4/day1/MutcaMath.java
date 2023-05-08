package week4.day1;

public class MutcaMath {
    // 약수의 합을 리턴하는 메소드 만들기
    int sumOfFactors(int num){
        // num % i == 0 이면 약수
        // 12 --> 1 2 3 4 6 12 = 28
        int answer = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) answer += i;
        }
        return answer;
    }
    void printResult(int num){
        System.out.printf("%d의 약수의 합은 %d입니다.\n",num,sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutcaMath mutcaMath = new MutcaMath();
        mutcaMath.printResult(12);
        mutcaMath.printResult(36);
        mutcaMath.printResult(48);
        mutcaMath.printResult(29);
    }
}
