package programmers;

import java.util.Arrays;

public class Back5 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

}