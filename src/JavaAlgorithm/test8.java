package JavaAlgorithm;

public class test8 {
    public int solution(int angle) {
        int answer = 0;
        if(angle>0&&angle<=180){
            if(angle>0&&angle<90){
                answer=1;
            }else if(angle==90){
                answer=2;
            }else if(angle==180){
                answer=4;
            }else{
                answer=3;
            }
        }else{
            System.out.println("잘못 입력");
        }
        return answer;
    }
}
