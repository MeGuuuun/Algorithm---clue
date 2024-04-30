import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] card = new int[n];

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			card[i] = sc.nextInt();
		}

		int tmp = 0;

		for (int i = 0; i < n - 2; i++) {
			int sum = 0;

			if (card[i] >= m)
				continue;
			for (int j = i + 1; j < n - 1; j++) {
				sum = card[i];
				if (sum + card[j] >= m) {
					continue;
				}
					
				for (int k = j + 1; k < n; k++) {
					sum=card[i]+card[j];
					if (sum + card[k] > m) {
						continue;
					}
						
					sum += card[k];
					if (tmp < sum) {
						tmp = sum;
					}
				}
			}
		}
		System.out.println(tmp);

	}

}
