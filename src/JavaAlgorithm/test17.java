package JavaAlgorithm;

public class test17 {
    public int[] solution(long n) {
        int[] reverse=new int[11];
        int index=0;
        int num;
        long fn=n;
        if(n<=10000000000L&&n>=0){
            for(long i=10000000000L;i>0;i/=10){
                num=(int)(n/i);
                if(num!=0){
                    n%=i;
                    reverse[index++]=num;
                }else if((num==0) && (fn>i)){
                    n%=i;
                    reverse[index++]=num;
                }
            }
        }

        int[] answer=new int[index];
        for(int i=0;i<index;i++){
            answer[i]=reverse[index-i-1];
        }
        return answer;
    }
}
