package pattern;

public class Swastik2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			System.out.println();
		}
		int num = 19;
		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= 10; j++) {
				System.out.print(" ");
			}
			// cube
			for (int j = 1; j <= num; j++) {
				if (j == 10 && i != 1 && i != 19 || i == 10 && j != 1 && j != 19
						|| j == 2 && i != 1 && i != 19 && i != 18 && i != 17 && i != 16 && i != 15 && i != 14 && i != 13
								&& i != 12 && i != 11
						|| j == 1 && i == 1 || i == 6 && j == 6
						|| i == 2 && j != 1 && j != 2 && j != 3 && j != 4 && j != 5 && j != 6 && j != 7 && j != 8
								&& j != 9 && j != 19
						|| i == 1 && j == 19 || i == 6 && j == 14
						|| j == 18 && i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8
								&& i != 9 && i != 19
						|| i == 19 && j == 19 || j == 14 && i == 14 || i == 18 && j != 11 && j != 12 && j != 13
								&& j != 14 && j != 15 && j != 16 && j != 17 && j != 18 && j != 19 && j != 1
						|| i == 19 && j == 1 || i == 14 && j == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
