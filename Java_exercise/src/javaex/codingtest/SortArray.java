package javaex.codingtest;

public class SortArray {
	// 낼 수정하기 
	public int[] solution(int[] array, int[][] commands) {

		int[] temp = {};

		for (int[] idx : commands) {
			int i = 0;
			System.out.println(idx[i++]);
		}

		int[] answer = {};

		return answer;
	}


	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		Solution sol = new Solution();
		sol.solution(array, commands);
	}

}
