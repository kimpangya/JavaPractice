package JavaAlgorithm;

public class test42 {
    public int solution(int[] number) {
        int answer = 0;
        int num2 = 0;
        for(int i=0;i<number.length-2;i++){
            for(int k=i+1;k<number.length-1;k++){
                num2 = number[i] + number[k];
                for(int j=k+1;j<number.length;j++){
                    if(number[j]+num2==0) answer++;
                }
            }
        }
        return answer;
    }
}
