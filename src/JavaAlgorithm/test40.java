package JavaAlgorithm;

public class test40 {
    public int solution(int n) {
        int answer = 0;
        int[] list=new int[19];
        int index=0;
        for(int i=18;i>=0;i--){
            int num3 = (int)Math.pow(3,i);
            if(n>=num3*2){
                list[index++]=2;
                n-=num3*2;
            }else if(n>=num3){
                list[index++]=1;
                n-=num3;
            }else if(n<num3&&index!=0){
                list[index++]=0;
            }
        }
        for(int i=index-1;i>=0;i--){
            answer+=(int)Math.pow(3,i)*list[i];
        }

        return answer;
    }
}
