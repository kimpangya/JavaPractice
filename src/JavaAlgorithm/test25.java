package JavaAlgorithm;

import java.util.Arrays;

public class test25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[0];
        int indexSize=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){

                int[] newArr = Arrays.copyOf(answer, answer.length + 1);
                answer = newArr;

                answer[indexSize]=arr[i];
                indexSize++;
            }
        }

        if(indexSize==0){
            answer = new int[1];
            answer[0]=-1;
        }
        else{
            Arrays.sort(answer);
        }
        return answer;
    }
}
