package programmers;

public class calculateScore {
        public static int calculateScore ( int val1, int val2, int val3){
            if (val1 == val2 && val2 == val3) {
                return (val1 + val2 + val3) * (val1 * val2 + val2 * val2 + val3 * val3) * (val1 * val1 * val1 + val2 * val2 * val2 + val3 * val3 * val3);
            } else if (val1 == val2 || val1 == val3 || val2 == val3) {
                int sum = val1 + val2 + val3;
                return sum * (val1 * val1 + val2 * val2 + val3 * val3);
            } else {
                return val1 + val2 + val3;
            }
        }
    }