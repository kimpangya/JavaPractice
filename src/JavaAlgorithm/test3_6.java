package JavaAlgorithm;

import java.util.Arrays;

import org.w3c.dom.ls.LSOutput;

public class test3_6 {
	public static void main(String[] args){

		String[] keymap = {"ABACD", "BCEFD"};
		String[] targets = {"ABCD","AABB"};
		System.out.println(Arrays.toString(solution(keymap, targets)));
	}
	public static int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		int[] alpha = new int[26];
		for(int i=0;i<26;i++){
			alpha[i]=101;
		}

		//         for(int i=0;i<keymap.length;i++){
		//             //문자열
		//             for(int j=0;j<keymap[i].length();j++){
		//                 char c = keymap[i].charAt(j);

		//                 //j가 min인지 확인해야 함
		//                 //몇 번 눌러야 하는지
		//                 int index = (int)c -65;
		//                 if(j<alpha[index]){
		//                     alpha[index] = j;
		//                 }
		//             }
		//         }

		//         for(int i=0;i<targets.length;i++){
		//             for(int j=0;j<targets[i].length();j++){
		//                 char c = targets[i].charAt(j);
		//                 int index = (int)c - 65;

		//                 if(alpha[index]!=101){
		//                     answer[i] += alpha[index];
		//                 }
		//             }
		//             if(answer[i]==0) answer[i]=-1;
		//         }


		for(int i=0;i<keymap.length;i++){
			//문자열
			for(int j=0;j<keymap[i].length();j++){
				char c = keymap[i].charAt(j);

				//j가 min인지 확인해야 함
				//몇 번 눌러야 하는지
				int index = (int)c -65;
				if(j+1<alpha[index]){
					alpha[index] = j+1;
				}
			}
		}


		return alpha;
	}
}




