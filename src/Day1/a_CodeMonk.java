package Day1;

import java.util.Scanner;

public class a_CodeMonk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();// 1
//		int N = s.nextInt();//
		int K = 2;// s.nextInt();
//		int[] arr = new int[N];
//		for (int i = 0; i < N; i++) {
//			arr[i] = s.nextInt();
//		}
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 1; i <= K; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
