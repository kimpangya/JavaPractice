package JavaAlgorithm;

public class test4 {
    public int solution(int age) {
        int answer = 0;
        if(age>0&&age<=120){
            answer=2022-age+1;
        }else{
            System.out.println("범위를 잘못 입력했습니다(0<x<=120)");
        }
        return answer;
    }
}
}
