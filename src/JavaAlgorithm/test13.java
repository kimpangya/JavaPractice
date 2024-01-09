package JavaAlgorithm;

public class test13 {
    public int solution(int n) {
        int rest;
        int answer = 0;
        if(n<=100000000&&n>=0){
            for(int i=100000000;i>0;i/=10){
                rest=n%i;
                n/=i;
                answer+=n;
                n=rest;
            }
        }else{
            System.out.println("n 범위 초과");
        }


        return answer;
    }
}
