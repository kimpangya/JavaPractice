package JavaAlgorithm;

public class test36 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4||s.length()==6){
            char[] c=s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(c[i]<48||c[i]>57){
                    answer=false;
                }
            }
        }else{
            answer=false;
        }
        return answer;
    }
}
