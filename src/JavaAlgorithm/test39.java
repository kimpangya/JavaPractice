package JavaAlgorithm;

import java.util.Arrays;

public class test39 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4, 10)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int firstN = n;
        int firstM = m;
        int temp;
        if (n == 0 || m == 0) {
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }

        if (m < n) {
            temp = n;
            n = m;
            m = temp;
        }

        while (n != 0) {
            temp = m % n;
            m = n;
            n = temp;
        }
        answer[0] = m;
        answer[1] = firstN * firstM / answer[0];

        return answer;
    }
}
