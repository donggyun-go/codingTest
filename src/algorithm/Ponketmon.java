package algorithm;

import java.util.HashSet;
/*
 * 문제풀이
 * 1. 최대값을 구하기 위해 sums의 length에 2를 나눈 값을 max에 할당
 * 2. 중복을 제거한 값을 구하기 위해 Set을 사용해서 num를 할당
 * 3. 중복을 제거한 Set의 크기가 max보다 크면 max, 작으면 Set의 사이즈를 리턴한다.
 */
public class Ponketmon {
	public int solution(int[] nums) {
		int max = nums.length / 2;
		      
		HashSet<Integer> numsSet = new HashSet<>();
		
		for (int num : nums) {
			numsSet.add(num);
		}
		      
		if (numsSet.size() > max) {
			return max;
		} else {
			return numsSet.size();
		}
	}
}

/*
 * JAVA의 자료구조에 대한 지식이 필요함
 * List, Set, Map, Stack, Queue
 * 문제 해결을 할 때 적합한 자료구조를 파악할 수 있어야한다.
 */