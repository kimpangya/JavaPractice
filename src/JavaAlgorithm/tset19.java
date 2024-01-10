package JavaAlgorithm;

public class tset19 {
    public long solution(long n) {
        n=50000000000000L;
        long answer = (long)Math.sqrt(n);
        answer=(answer+1)*(answer+1);
        /*if(answer*answer!=n){
            answer=-1;
        }else{
            answer=(answer+1)*(answer+1);
        }*/
        return answer;
    }
}
