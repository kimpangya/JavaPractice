package JavaAlgorithm;

public class test28 {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0;i<numbers.length;i++){
            answer+=numbers[i];
        }
        answer=45-answer;
        return answer;
    }
}