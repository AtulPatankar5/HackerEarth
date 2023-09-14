package Day1;

import java.util.Scanner;

public class b_Monk_Inversion {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter test cases");
		int T =s.nextInt();
		for (int t = 1; t <= T; t++) {
			int count = 0;
			System.out.print("Enter size=");
			int N = s.nextInt();
			int[][] arr = new int[N][N];
//			int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//			int[][] arr = {{4,1},{3,4}};

			//Addition of data
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print("arr["+i+"]["+j+"]=" );
					arr[i][j] = s.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int val = arr[i][j];
					for (int k = i; k < N; k++) {
						for (int l = j; l < N; l++) {
							if (val > arr[k][l]) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);

		}
	}

}
