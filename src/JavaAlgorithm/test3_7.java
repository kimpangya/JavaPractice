package JavaAlgorithm;

public class test3_7 {
	public int solution(String[][] board, int h, int w) {
		int answer = 0;
		int[][] check={{-1,0}, {0,-1}, {1,0}, {0,1}};

		for(int i=0;i<4;i++){
			int newH = check[i][0]+h;
			int newW = check[i][1]+w;
			//h , w
			if(newH >=0 && newH <board.length
				&& newW >=0 && newW <board.length){
				if(board[h][w].equals(board[newH][newW])){
					answer++;
				}
			}
		}

		return answer;
	}
}
