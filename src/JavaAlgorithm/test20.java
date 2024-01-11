package JavaAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class test20 {
    public long solution(long n) {
        long answer = 0;
        long num;
        long fn = n;
        int index=0;
        ArrayList<Long> answerList = new ArrayList<>();
        for(long i=1000000000L;i>0;i/=10){
            num=(n/i);
            if(num!=0){
                n%=i;
                answerList.add(num);
            }else if((num==0) && (fn>i)){
                n%=i;
                answerList.add(num);
            }
        }
        Collections.sort(answerList, Collections.reverseOrder());
        for(long i=1;i<=fn;i*=10){
            answer+=answerList.get(answerList.size()-(index++)-1)*i;
        }
        return answer;
    }
}
