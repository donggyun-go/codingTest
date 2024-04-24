package baekjun;

import java.util.Scanner;

public class Ex3003 {
	public static void main(String[] args) {
		//총 피스 16개
		//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		
		Scanner scan = new Scanner(System.in);
		int king = 1-scan.nextInt();
		int queen = 1-scan.nextInt();
		int look = 2-scan.nextInt();
		int bishop = 2-scan.nextInt();
		int knight = 2-scan.nextInt();
		int pawn = 8-scan.nextInt();
		
		scan.close();
		
		System.out.println(king+" "+queen+" "+look+" "+bishop+" "+knight+" "+pawn);
	}
}
