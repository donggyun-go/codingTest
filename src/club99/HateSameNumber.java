package club99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HateSameNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        inputList(scan, numberList);

        List<Integer> result = removeConsecutiveDuplicates(numberList);
        
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
    
    private static void inputList(Scanner scan, List<Integer> list) {
        while (true) {
            int input = scan.nextInt();
            if (input == 00) {
                break;
            }
            list.add(input);
        }
    }
    
    private static List<Integer> removeConsecutiveDuplicates(List<Integer> numberList) {
        List<Integer> result = new ArrayList<>();
        if (numberList.isEmpty()) {
            return result;
        }
        
        result.add(numberList.get(0));
        
        for (int i = 1; i < numberList.size(); i++) {
            if (!numberList.get(i).equals(numberList.get(i - 1))) {
                result.add(numberList.get(i));
            }
        }
        
        return result;
    }
}
