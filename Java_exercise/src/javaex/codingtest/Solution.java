package javaex.codingtest;

import java.util.Arrays;

public class Solution {

	public int[] solution(int[] array, int[][] commands) {
		// commands 배열의 요소들을 뽑아오기
		// commands 0,1,2 요소들의 각 요소들 또 뽑기
		// 뽑은 요소들을 이용해서 array 자르기
		// 낼 수정하기
		int[] temp = new int[3];
		int[] answer = new int[commands.length];
		
		int start, end, pick, i = 0;

		for(int[] values : commands) {
			temp= values;
			start = temp[0];
			end = temp[1];
			pick = temp[2];
			int[] copyArr = new int[end-start+1];
//			copyArr = Arrays.copyOfRange(array, start-1, end);
			System.arraycopy(array, start-1, copyArr, 0, end-start+1);
			Arrays.sort(copyArr);
			System.out.println(Arrays.toString(copyArr));
			System.out.println(copyArr[pick-1]);
			if(i<answer.length) {
				answer[i++] = copyArr[pick-1];
				System.out.println(answer[i]);
			}
			else {
				break;
			}
		}

//		System.out.println(Arrays.toString(temp));
	return answer;
}

}
