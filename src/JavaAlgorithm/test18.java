package JavaAlgorithm;

public class test18 {
    public int solution(String s) {
        int answer = 0;
        //아스키코드 문자0=48
        char[] c = new char[s.length()];
        int ten=1;

        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        for(int i=1;i<s.length();i++){
            answer+= ((int)c[s.length()-i]-48)*ten;
            ten*=10;
        }
        if(c[0]=='-'){
            answer*=-1;
        }else if(c[0]=='+'){

        }else{
            answer+=((int)c[0]-48)*ten;
        }
        return answer;
    }
}
