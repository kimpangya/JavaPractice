package JavaAlgorithm;

public class test3 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1>0&&num1<=100&&num2>0&&num2<=100)
            answer=num1/num2;
        else
            System.out.println("범위를 잘못 입력했습니다(0<x<=100)");
        return answer;
    }
}
