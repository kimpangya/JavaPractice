package JavaAlgorithm;

public class test1 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1>=-50000&&num1<=50000&&num2>=-50000&&num2<=50000)
            answer = num1-num2;
        else {
            System.out.println("범위에 맞게 입력해주세요(-50000 ~ 50000)");
        }
        return answer;
    }
}
