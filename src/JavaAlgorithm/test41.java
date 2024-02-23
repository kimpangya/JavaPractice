package JavaAlgorithm;

public class test41 { public String solution(String s) {
    String answer = "";
    char[] c=s.toCharArray();
    int count=0;

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            count = 0;
        }
        else{
            if(count%2==0){
                if('a'<=c[i]&&c[i]<='z')
                    c[i]-=32;
            }
            else if('A'<=c[i]&&c[i]<='Z'){
                c[i]+=32;
            }
            count++;
        }

    }
    answer=String.valueOf(c);
    return answer;
}
}
