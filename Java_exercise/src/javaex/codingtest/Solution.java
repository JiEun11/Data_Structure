package javaex.codingtest;

import java.util.Arrays;

public class Solution {

	public int[] solution(int[] array, int[][] commands) {
		// commands 배열의 요소들을 뽑아오기
		// commands 0,1,2 요소들의 각 요소들 또 뽑기
		// 뽑은 요소들을 이용해서 array 자르기
		
		int[] temp = new int[3];	// commands의 행을 저장할 배열
		int[] answer = new int[commands.length]; // commands의 length만큼 생성되는 answer 배열 
		
		int start, end, pick, i = 0;

		for(int[] values : commands) {
			temp= values;   // commands 배열의 요소들 뽑아오기
			start = temp[0];  // commands의 0번째 요소 (시작 인덱스)
			end = temp[1];    // commands의 1번째 요소 (끝 인덱스)
			pick = temp[2];   // commands의 2번째 요소 (뽑을 인덱스)
			
			int[] copyArr = new int[end-start+1];  // original array인 array를 복사할 배열 
			System.arraycopy(array, start-1, copyArr, 0, end-start+1);   // array배열 복사 후 copyArr에 저장 
//			int[] copyArr = Arrays.copyOfRange(array, start-1, end);  //아니면 이렇게!!
			
			Arrays.sort(copyArr);  // copyArr 정렬
//			System.out.println(Arrays.toString(copyArr));  // 맞게 되었나 체크
//			System.out.println(copyArr[pick-1]);	//  뽑은 인덱스 맞나 확인
			
//			i가 애초에 answer 범위를 넘을 일이 없구나...
//			if(i<answer.length) {
//				answer[i++] = copyArr[pick-1];    // answer 배열에 고른 인덱스 값 넣기 
//			}
//			else {
//				break;
//			}
			answer[i++] = copyArr[pick-1]; //이 코드로 끝남! if문 필요 없음
			
		}

	return answer;
}

}
