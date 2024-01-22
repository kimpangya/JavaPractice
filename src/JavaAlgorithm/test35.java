package JavaAlgorithm;

public class test35 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long longMoney=money;
        for(int i=1;i<=count;i++){
            longMoney-=price*i;
        }

        if(longMoney>0) answer=0;
        else answer=longMoney*-1;
        return answer;
    }
}
