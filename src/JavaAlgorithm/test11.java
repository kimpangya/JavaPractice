package JavaAlgorithm;

public class test11 {
    public String solution(int num) {
        String answer = "";
        if(num>=-2147483648 && num<= 2147483647){
            if(num%2==0) answer="Even";
            else answer="Odd";
        }
        return answer;
    }
}
