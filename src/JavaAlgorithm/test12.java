package JavaAlgorithm;

public class test12 {
    public double solution(int[] arr) {
        double answer = 0;
        if(arr.length>=1 && arr.length<=100){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=-10000&&arr[i]<=10000){
                    answer+=arr[i];
                }else break;
            }
        }else{
            System.out.println("배열 길이 오류");
        }
        answer/=arr.length;
        return answer;
    }
}
