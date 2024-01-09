package JavaAlgorithm;

public class test5 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1>=0&&num1<=10000&&num2>=0&&num2<=10000){
            if(num1==num2){
                answer=1;
            }
            else{
                answer=-1;
            }
        }else{
            System.out.println("잘못 입력하였습니다");
        }
        return answer;
    }
}
