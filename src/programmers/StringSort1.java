package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort1 {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c>='0' && c<='9'){
                answer.add(c-'0');
            }
        }
        Collections.sort(answer);
        
        return answer;
    }
}
