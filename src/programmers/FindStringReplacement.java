package programmers;

public class FindStringReplacement {
    public int solution(String myString, String pat) {
        // StringBuilder를 사용하여 변환된 문자열을 저장
        StringBuilder transformed = new StringBuilder();

        // 각 문자에 대하여 A와 B를 서로 바꿔서 추가
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar == 'A') {
                transformed.append('B');
            } else {
                transformed.append('A');
            }
        }

        // 변환된 문자열에서 패턴이 포함되어 있는지 확인
        if (transformed.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
