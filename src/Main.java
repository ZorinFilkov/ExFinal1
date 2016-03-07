import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
