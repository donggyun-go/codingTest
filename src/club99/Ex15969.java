package club99;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15969 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = scan.nextInt();

        int[] scoreList = new int[people];

        for (int i = 0; i < people; i++) {
            int score = scan.nextInt();
            scoreList[i] = score;
        }
        
        scan.close();
        
        Arrays.sort(scoreList);


        int min = scoreList[0];
        int max = scoreList[people - 1];


        int scoreDifference = max - min;

        System.out.println(scoreDifference);
    }
}
