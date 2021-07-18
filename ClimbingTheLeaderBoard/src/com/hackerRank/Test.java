package com.hackerRank;

/**
 * @author sourav
 *
 */
public class Test {
	public static void main(String[] args) {
		int[] ranked = { 100, 90, 90, 80 };
		int[] player = { 100, 101, 91 }; // 1 1 2
		int[] climbingLeaderBoard = getClimbingLeaderBoard(ranked, player);

		for (int i = 0; i < climbingLeaderBoard.length; i++) {
			System.out.println(climbingLeaderBoard[i]);
		}
	}

	// 100 90 90 80
	// 105 80 70
	private static int[] getClimbingLeaderBoard(int[] ranked, int[] player) {

		int m = ranked.length;
		int n = player.length;

		int[] rank = new int[m];
		int[] result = new int[n];

		rank[0] = 1;

		for (int i = 1; i < m; i++) {

			if (ranked[i] == ranked[i - 1]) {
				rank[i] = rank[i - 1];
			} else {
				rank[i] = rank[i - 1] + 1;
			}

		}

		for (int i = 0; i < n; i++) {
			int playerScore = player[i];

			if (playerScore > ranked[0]) {
				result[i] = 1;
			} else if (playerScore < ranked[m - 1]) {
				result[i] = rank[m - 1] + 1;
			} else {
				int index = binarySearch(ranked, playerScore);
				result[i] = rank[index];
			}

		}

		return result;

	}

	private static int binarySearch(int[] ranked, int playerScore) {

		int low = 0;
		int high = ranked.length - 1;

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (ranked[mid] == playerScore) {
				return mid;
			} else if (ranked[mid] < playerScore && ranked[mid - 1] > playerScore) {
				return mid;
			} else if (ranked[mid] > playerScore && ranked[mid + 1] < playerScore) {
				return mid + 1;
			} else if (ranked[mid] < playerScore) {
				high = mid - 1;
			} else if (ranked[mid] > playerScore) {
				low = mid + 1;
			}
		}
		return -1;
	}

}
