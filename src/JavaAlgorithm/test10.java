package JavaAlgorithm;

public class test10 {
    public double solution(int[] numbers) {
        double answer = 0;
        if(numbers.length>=1&&numbers.length<=100){
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>=0&&numbers[i]<=1000){
                    answer+=numbers[i];
                }else{
                    System.out.println("원소 잘못 입력");
                    break;
                }
            }
        }
        answer/=numbers.length;
        return answer;
    }
}
