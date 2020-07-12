package Tutorial;

public class RajProblem {

	public static void main(String[] args) {
		char cap = 'A';
		int i;
		int j;
		int k;

		for (i = 1; i <= 5; i++) {
			for (k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				if (i%2 == 0) {
					System.out.print((char)(cap+32));
					System.out.print(" ");
				} else {
					System.out.print(cap);
					System.out.print(" ");
				}
				cap++;
			}

			System.out.println();
		}
	}
}
