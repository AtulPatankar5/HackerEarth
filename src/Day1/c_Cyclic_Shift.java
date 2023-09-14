package Day1;

import java.util.Scanner;

public class c_Cyclic_Shift {


	public static int[] dataAddition(/* int num, int length */String str) {

//		int arr[] = new int[length];
//		int i = 1;
//		while (num > 0) {
//			int val = num % 10;// 10101
//			arr[length - i++] = val;// 43210
//			num = num / 10;// 10101
//		}
//		System.out.println(Arrays.toString(arr));

		int[] intArray = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int val = Character.getNumericValue(c);
			intArray[i] = val;
		}
		return intArray;
	}

	public static int calculateBinary(int[] arr) {// [1,0,1,0,1]
		int p = 0;
		int sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			sum += Math.pow(2, p++) * arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test Cases");
		int T = sc.nextInt();
		for (int p = 1; p <= T; p++) {

			System.out.println("Enter length of string");// 5
			int length = sc.nextInt();

			System.out.println("Enter number of time max is required");// 2
			int N = sc.nextInt();

			System.out.println("Enter Binary String");
			String str = sc.next();

			int arr[] = dataAddition(str);

			int val = calculateBinary(arr);

			int count = -1;
			int val2 = 0;

			for (int j = 1; j <= N; j++) {
				do {
					StringBuilder sb = new StringBuilder();
					int temp = arr[0];
					for (int i = 0; i < arr.length - 1; i++) {
						arr[i] = arr[i + 1];
					}
					arr[length - 1] = temp;
					for (int i = 0; i < arr.length; i++) {
						sb.append(arr[i]);
					}
					String valString = sb.toString();
					arr = dataAddition(valString);
					val2 = calculateBinary(arr);
					count++;
				} while (val2 != val);
				if (j == N)
					System.out.println(count);
			}
		}
	}
}
