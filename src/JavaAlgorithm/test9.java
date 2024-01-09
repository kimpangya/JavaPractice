package JavaAlgorithm;

public class test9 {
    public int solution(int n) {
        int answer = 0;
        if(n>0&&n<=1000){
            for(int i=0;i<=n;i+=2){
                answer+=i;
            }
        }else{
            System.out.println("잘못 입력");
        }
        return answer;
    }
}
