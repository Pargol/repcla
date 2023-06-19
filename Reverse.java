package test328;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("please put your N value?");
		int N = kb.nextInt();
		int[][] my_array = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				my_array[i][j] = kb.nextInt();
			}

		}
		
		for (int i = N-1; i >=0; i--) {
			for (int j = 0; j < N; j++) {
				System.out.print(my_array[i][j]+ " " );
			}
			System.out.println();

		}

	}

}
