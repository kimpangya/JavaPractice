package JavaAlgorithm;

import java.util.Arrays;
import java.util.Collections;


class test34 {
    public String solution(String s) {
        String answer = "";
        String[] sList = s.split("");

        Arrays.sort(sList, Collections.reverseOrder());
        /*for(String x : sList){
            answer+=x;
        }*/
        answer=String.join("",sList);

        return answer;
    }
}