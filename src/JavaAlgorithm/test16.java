package JavaAlgorithm;

public class test16 {
    public long[] solution(int x, int n) {
        long[] answer;
        answer=new long[n];
        long fx=x;
        long px=x;
        if(x>=-10000000&&x<=10000000&&n<=1000){
            for(int i=0;i<n;i++){
                answer[i]=px;
                px+=fx;
            }
        }
        return answer;
    }
}
