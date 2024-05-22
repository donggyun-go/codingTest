package club99;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NoCompleteParticipant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> participant = new ArrayList<>();
		List<String> completion = new ArrayList<>();
        System.out.println("참가자를 입력해주세요(end를 입력하면 종료): ");
        inputList(scan, participant);

        System.out.println("완주자를 입력해주세요(end를 입력하면 종료):");
        inputList(scan, completion);
        scan.close();
        
        String result = findNonCompletingParticipant(participant, completion);
        System.out.println("완주하지 못한 선수: " + result);
        
	}
	
	private static void inputList(Scanner scan, List<String> list) {
        while (true) {
            String input = scan.next();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            list.add(input);
        }
    }
	
    private static String findNonCompletingParticipant(List<String> participant, List<String> completion) {
        Map<String, Integer> participantMap = new HashMap<>();

        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        
        System.out.println(participantMap.toString());

        for (String name : completion) {
            participantMap.put(name, participantMap.get(name) - 1);
        }
        
        System.out.println(participantMap.toString());

        for (Map.Entry<String, Integer> entry : participantMap.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }

        return null;
    }
}

