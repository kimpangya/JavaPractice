package JavaAlgorithm;

public class test23 {
    public int solution(int num) {
        int answer = 0;
        int breakNum=0;
        if(num==1){
            return answer;
        }
        for(int i=0;i<500;i++){
            if(num%2==0){
                num/=2;
            }else if(num==1){
                breakNum=1;
                break;
            }else if(num%2==1){
                num=num*3+1;
            }
            answer++;
        }
        if(breakNum==0) answer=-1;

        return answer;
    }
}
