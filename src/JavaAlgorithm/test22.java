package JavaAlgorithm;

public class test22 {
        public boolean solution(int x) {
            boolean answer = false;
            int originX=x;
            int rest;
            int xSum=0;
            for(int i=10000;i>0;i/=10){
                rest = x%i;
                xSum+=x/i;
                x=rest;
            }
            if(originX%xSum==0){
                answer=true;
            }
            return answer;
        }

}
