package pattern;

public class print_pattern {

	public static void main(String[] args) {

		int num = 5;
		System.out.println("1.");
		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("2.");
		for (int i = 1; i <= num; i++) {

			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("3.");
		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("4.");
		for (int i = 1; i <= num; i++) {
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print("  ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("5.");
		for (int i = 1; i <= num; i++) {
			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("  ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("6.");
		for (int i = 1; i <= num; i++) {
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {

			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("7.");
		for (int i = 1; i <= num; i++) {
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {

			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("8.");
		for (int i = 1; i <= num; i++) {
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print("  ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		for (int i = 1 + 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("  ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("9.");
		for (int i = 1; i <= num; i++) {
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}

			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("10.");
		for (int i = 1; i <= num; i++) {
			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("11.");
		for (int i = 1; i <= num; i++) {

			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print("  ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("* ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("  ");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("12.");

		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("  ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print("* ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("13.");
		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("  ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print("  ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("14.");
		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = i + 1; j <= num; j++) {

				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("15.");

		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print("*");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {

			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("*");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("16.");

		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}

			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {

			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("17.");

		for (int i = 1; i <= num; i++) {

			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");

			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		for (int i = 1 + 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("18.");

		for (int i = 1; i <= num; i++) {
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("*");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print("*");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("19.");

		for (int i = 1; i <= num; i++) {
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// increment

			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decremnt
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {

			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("20.");

		for (int i = 1; i <= num; i++) {

			// decrement
			for (int j = i + 1; j <= num; j++) {

				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("21.");

		for (int i = 1; i <= num; i++) {
			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}

			// decrement
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("22.");

		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {
			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("23.");

		for (int i = 1; i <= num; i++) {

			// decrement
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increment
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {

			// increment
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrement
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("24.");

		for (int i = 1; i <= num; i++) {
			// increment
			for (int j = 1, p = 'A'; j <= i; j++, p++) {
				System.out.print((char) p + "");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("25.");

		for (int i = 1, k = 'A'; i <= num; i++, k++) {
			// incremnt
			for (int j = 1; j <= i; j++) {
				System.out.print((char) k + "");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("26.");

		for (int i = 1, k = 'A'; i <= num; i++, k++) {
			// increment
			for (int j = 1; j <= i; j++) {
				System.out.print((char) k + "");
			}

			System.out.println();
		}

		for (int i = 1 + 1, k = 'D'; i <= num; i++, k--) {
			// decrement
			for (int j = i; j <= num; j++) {
				System.out.print((char) k + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("27.");

		for (int i = 1; i <= num; i++) {

			// increment
			for (int j = 1, p = 'A'; j <= i; j++, p++) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// decrement
			for (int j = i, p = 'A'; j <= num; j++, p++) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("28.");

		for (int i = 0; i <= num; i++) {

			// decrement
			for (int j = i, p = 'A'; j <= num; j++, p++) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}

		for (int i = 0; i <= num; i++) {
			// increment
			for (int j = 1, p = 'A'; j <= i + 1; j++, p++) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("29.");

		for (int i = 0, k = 'F'; i <= num; i++, k--) {
			// decrement
			for (int j = i, p = k; j <= num; j++, p--) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}

		for (int i = 0, k = 'A'; i <= num; i++, k++) {
			// increment
			for (int j = 0, p = k; j <= i; j++, p--) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("30.");

		for (int i = 0; i <= num; i++) {

			// decremet
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increment
			for (int j = 0, p = 'A'; j <= i; j++, p++) {
				System.out.print((char) p + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("31.");

		for (int i = 0; i <= num; i++) {
			// dec
			for (int j = i, p = 'F'; j <= num; j++, p--) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("32.");

		for (int i = 0; i <= num; i++) {
			// incre
			for (int j = 0, p = 'F'; j <= i; j++, p--) {
				System.out.print((char) p + "");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("33.");

		for (int i = 0; i <= num; i++) {
			// dec
			for (int j = i, p = 'A'; j <= num; j++, p++) {
				System.out.print((char) p + "");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("34.");
		char p1 = 'A';
		for (int i = 0; i <= num; i++) {
			// incre
			for (int j = 0; j <= i; j++) {

				System.out.print(p1 + "");
				p1++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("35.");

		for (int i = 0, k = 'A'; i <= num; i++, k++) {
			// incre
			for (int j = 0, p = k; j <= i; j++, p--) {
				System.out.print((char) p + "");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("36.");
//		char k1 = 'A';
//		int i = 0;
		for (int i = 0, k1 = 'A'; i <= num; i++, k1++) {
			System.out.print((char) k1 + "");
			// increment
			for (int j = 1, num1 = 5, p = k1; j <= i; j++) {
				p = p + num;
				System.out.print(" " + (char) p);
//				k1++;
			}
//			
			System.out.println("");

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("37.");

		for (int i = 1; i <= num; i++) {
			// increm
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");

			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("38.");

		for (int i = 1; i <= num; i++) {
			// decrement
			for (int j = 1, p = 5; j <= i; j++, p--) {
				System.out.print(p + "");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("39.");

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// decre
			for (int j = i, p = k; j <= num; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("40.");
		for (int i = 1, k = 1; i <= num; i++, k++) {
			// incre
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// decrem
			for (int j = i, p = k; j <= num; j++, p++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		for (int i = 1, k = 5; i <= num; i++, k--) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increm
			for (int j = 1, p = k; j <= i; j++, p++) {
				System.out.print(p + " ");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("41.");

		for (int i = 1, k = 5; i <= num; i++, k--) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// incre
			for (int j = 1, p = k; j <= i; j++, p++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("42.");

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// incre
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("43.");
		int size = 9;
		for (int i = 1; i <= size; i++) {
			// increment
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("44.");

		for (int i = 1, k = 1; i <= size; i++, k++) {
			// increme
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("45.");
		System.out.println();

		for (int i = 1; i <= size; i++) {
			// incre
			for (int j = 1, p = 9; j <= i; j++, p--) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("46.");
		System.out.println();

		for (int i = 1, k = 9; i <= size; i++, k--) {
			// increm
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("47.");
		System.out.println();

		for (int i = 1; i <= size; i++) {
			// dec
			for (int j = i + 1; j <= size; j++) {
				System.out.print(" ");

			}
			// incre
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("48.");
		System.out.println();

		int num1 = 7, num2 = 10;
		for (int i = 1; i <= num1; i++) {
			// cube
			for (int j = 1, p = 0; j <= num2; j++, p++) {
				System.out.print(p + "");
				System.out.print(p + "");
				System.out.print(p + "");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("49.");
		System.out.println();

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// increm
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		for (int i = 1 + 1, k = 5; i <= num; i++, k--) {
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i; j <= num; j++) {
				System.out.print(k + " ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("50.");
		System.out.println();

		for (int i = 1, k = 1; i <= size; i++, k++) {
			// dec
			for (int j = i + 1; j <= size; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("51.");
		System.out.println();

		for (int i = 1; i <= size; i++) {
			// dec
			for (int j = i + 1; j <= size; j++) {
				System.out.print(" ");
			}
			// incre
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("52.");
		System.out.println();

		for (int i = 1, k = 9; i <= size; i++, k--) {

			// increm
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i; j <= size; j++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("53.");
		System.out.println();

		for (int i = 1; i <= num; i++) {

			// incre
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// dec
			for (int j = i, p = 1; j <= num; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("54.");
		System.out.println();

		for (int i = 1; i <= num; i++) {

			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("55.");
		System.out.println();
		int s = 1;
		for (int i = 1; i <= num; i++) {
			// dec
			for (int j = 1; j <= i; j++) {
				System.out.print(s + " ");
				s++;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("56.");
		System.out.println();

		for (int i = 1; i <= num; i++) {

			// dec
			for (int j = i, p = 1; j <= num; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();

		}
		for (int i = 1 + 1; i <= num; i++) {
			// incre
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("57.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// incre
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i, p = 1; j <= num; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		for (int i = 1 + 1; i <= num; i++) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// incre
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("58.");
		System.out.println();

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// incre
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i, p = k; j <= num; j++, p++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

		for (int i = 1 + 1, k = 4; i <= num; i++, k--) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1, p = k; j <= i; j++, p++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("59.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
//			System.out.print("* ");
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("60.");
		System.out.println();

		for (int i = 1, k = 0; i <= num; i++, k++) {
			// incre
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			// incre
			for (int j = 1 + 1, p = k; j <= i; j++, p--) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("61.");
		System.out.println();

		for (int i = 1, k = 0; i <= num; i++, k++) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// in
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			// incre
			for (int j = 1 + 1, p = k; j <= i; j++, p--) {
				System.out.print(p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("62.");
		System.out.println();

		for (int i = 1, k = 64; i <= num; i++, k++) {
			// inc

			for (int j = 1, p = 'A'; j <= i; j++, p++) {
				System.out.print((char) p + "");
			}
			// incr

			for (int j = 1 + 1, p = k; j <= i; j++, p--) {
				System.out.print((char) p + "");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("63.");
		System.out.println();

		for (int i = 1, k = 64; i <= num; i++, k++) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// incre
			for (int j = 1, p = 'A'; j <= i; j++, p++) {
				System.out.print((char) p + "");
			}
			// ince
			for (int j = 1 + 1, p = k; j <= i; j++, p--) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("64.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (i == j) {
					System.out.print(" ");
				}
			}
			// increm
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("65.");
		System.out.println();
		int p2 = 1;
		for (int i = 1; i <= num; i++) {
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print(p2 + " ");
				p2++;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("66.");
		System.out.println();

		for (int i = 1, k = 1; i <= num; i++, k++) {
			System.out.print(i);
			// incre
			for (int j = 1 + 1, add = 4; j <= i; j++, add--) {
				add = add + i;
				System.out.print(" " + add);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("67.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// incre
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}

			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// ince
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("68.");
		System.out.println();

		for (int i = 1; i <= num; i++) {

			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// dec
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("69.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// incre
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("70.");
		System.out.println();

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// inc
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// incre
			for (int j = 1, p = k; j <= i; j++, p--) {
				System.out.print(p + "");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("71.");
		System.out.println();

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// incre
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("72.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// inc
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// incre
			for (int j = 1, p = 1; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("73.");
		System.out.println();

		for (int i = 1; i <= num; i++) {

			// cube
			for (int j = 1; j <= num; j++) {
				if (j == 1 || j == i || i == num) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("74.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == num || j == 1 || j == num) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("75.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 3 || j == 3) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("76.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 3 || j == 3) {
					System.out.print("*");
				} else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("77.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					System.out.print("O");
				} else {
					System.out.print("x");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("78.");
		System.out.println();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num; j++) {
				if ((j + i) == 6 || i == j) {
					System.out.print("*");
//					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("79.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if ((i + j) == 6 || i == j) {
					System.out.print("A");
				} else {
					System.out.print("B");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("80.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (j == 1 || i == 1 || j == 5 || i == 5) {
					System.out.print("P");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("81.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == 1 || j == 5 || i == 5) {
					System.out.print("P");
				} else {
					System.out.print("Q");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("82.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if ((j + i) == 6) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("83.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("84.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j || (i + j) == 6) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("85.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {

				if (i == j) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}
			}
			// cube
			for (int j = 1 + 1; j <= num; j++) {
				if ((i + j) == 6) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("86.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == 1 || (j + i) == 6) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("87.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == 5 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("88.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 5 || (i + j) == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			for (int j = 1 + 1; j <= num; j++) {
				if (i == j || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("89.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1 + 1; j <= num; j++) {
				if (i == 1 || (i + j) == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("90.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if ((i + j) == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1 + 1; j <= num; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1 + 1; j <= num; j++) {
				if ((i + j) == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("91.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (j == 1 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (j == 1 || (j + i) == 6) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("92.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if ((i + j) == 6 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1 + 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("93.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if ((i + j) == 6 || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1 + 1; j <= num; j++) {
				if (i == 1 || (i + j) == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("94.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1 + 1; j <= num; j++) {
				if (i == j || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("95.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == 5 || i == 1 || i == j || (i + j) == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("96.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (j % 2 != 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("97.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j || (i + j) == 6 || i == 3 && j == 1 || j == 3 && i == 1 || j == 5 && i == 3
						|| i == 5 && j == 3) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("98.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// incr
			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
				if (j % 2 != 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("99.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// inc
			for (int j = 1; j <= i; j++) {
				if (i == j || (i + j) == 4 || (i + j) == 6 || i == 5 && j == 3) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("100.");
		System.out.println();
		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("101.");
		System.out.println();

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					System.out.print(k + "");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("102.");
		System.out.println();

		for (int i = 1, k = 1; i <= num; i++, k++) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print("1");
			}
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("103.");
		System.out.println();

		for (int i = 1, k = 5; i <= num; i++, k--) {
			// inc
			for (int j = 1, p = k; j <= i; j++, p++) {
				System.out.print(p + "");
			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print("5");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("104.");
		System.out.println();

		for (int i = 1, k = 5; i <= num; i++, k--) {
			// cube
			for (int j = 1, p = 5; j <= num; j++, p--) {
				if (i == 1 || j == 5 || j == 4 && i == 2 || j == 3 && i == 2 || j == 4 && i == 3) {
					System.out.print(k + "");

				} else {
					System.out.print(p + "");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("105.");
		System.out.println();

		for (int i = 1; i <= num; i++) {
			// cube
			for (int j = 1; j <= num; j++) {
				if ((i == j && j != 1) || (i == 1 && j == 3) || (i == 1 && j == 4 || i == 2 && j == 5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1 + 1; j <= num; j++) {
				if (((i + j) == 6 && j != 5) || (i == 1 && j == 2) || i == 1 && j == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("106.");
		System.out.println();

		for (int i = 1 + 1; i <= num; i++) {
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print(" ");
			}
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("*");
			}
			// inc
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
//			// dec
//			for (int j = i + 1 + 1; j <= num; j++) {
//				System.out.print(" ");
//			}
			// dec
			for (int j = i + 1; j <= num; j++) {
				System.out.print("  ");
			}
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("*");
			}
			// inc
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();
		}

		int h = 9;
		for (int i = 1; i <= h; i++) {
			// inc
			for (int j = 1 + 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec
			for (int j = i; j <= h; j++) {
				System.out.print("*");
			}
			// dec
			for (int j = i + 1; j <= h; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("107.");
		System.out.println();

		int c = 5;
		int r = 7;
		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 && i != 1 || i == 4 || j == 5 && i != 1 || i == 1 && j != 1 && j != 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("108.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 4 && j != 5 || j == 1 || i == 1 && j != 5 || j == 5 && i != 1 && i != 4 && i != 7
						|| i == 7 && j != 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("109.");
		System.out.println();

		for (int i = 1; i <= r - 1; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 && i != 1 && i != 6 || j != 1 && i == 1 || j != 1 && i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("110.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 || i == 1 && j != 5 || i == 7 && j != 5 || j == 5 && i != 1 && i != 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("111.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 || i == 1 || i == 4 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("112.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {

				if (j == 1 || i == 1 || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("113.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c + 1; j++) {
				if (i == 1 && j != 6 || i == 7 && j != 6 || j == 1 || i == 4 && j != 2 && j != 3
						|| j == 5 && i != 2 && i != 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("114.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 4 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("115.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 1 || i == 7 || j == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("116.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 1 || j == 3 || i == 7 && j != 4 && j != 5 || j == 1 && i != 2 && i != 3 && i != 4 && i != 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("117.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 || i == 1 && j == 5 || i == 2 && j == 4 || i == 3 && j == 3 || i == 4 && j == 2
						|| i == 5 && j == 3 || i == 6 && j == 4 || i == 7 && j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("118.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("119.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c + 1 + 1; j++) {
				if (j == 1 || j == 7 || i == 2 && j == 2 || i == 3 && j == 3 || i == 4 && j == 4 || i == 3 && j == 5
						|| i == 2 && j == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("120.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c + 1 + 1; j++) {
				if (j == 1 || j == 7 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("121.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 1 && j != 1 && j != 5 || j == 1 && i != 1 && i != 7 || j == 5 && i != 1 && i != 7
						|| i == 7 && j != 1 && j != 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("122.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 1 && j != 1 && j != 5 || j == 1 && i != 1 || i == 4 && j != 5 || i == 2 && j == 5
						|| i == 3 && j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("123.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 1 && j != 1 && j != 5 || j == 1 && i != 1 && i != 6 && i != 7 || j == 5 && i != 1 && i != 6
						|| i == 6 && j != 1 && j != 5 || i == 5 && j == 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("124.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 && i != 1 || i == 1 && j != 1 && j != 5 || i == 4 && j != 5 || j == 5 && i != 1 && i != 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("125.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 1 || i == 7 || i == 4 || j == 1 && i == 2 || j == 1 && i == 3 || j == 5 && i == 5
						|| j == 5 && i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("126.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (i == 1 || j == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("127.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c; j++) {
				if (j == 1 && i != 7 || j == 5 && i != 7 || i == 7 && j != 1 && j != 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("128.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= r; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// cube
			for (int j = 1 + 1; j <= r; j++) {
				if ((i + j) == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("129.");
		System.out.println();

		for (int i = 1; i <= c - 1; i++) {
			// cube
			for (int j = 1; j <= c - 1; j++) {
				if (j == 1 || (i + j) == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// cube
			for (int j = 1 + 1; j <= c; j++) {
				if (j == 4 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("130.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= r; j++) {
				if (i == j || (i + j) == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("131.");
		System.out.println();

		for (int i = 1; i <= r; i++) {
			// cube
			for (int j = 1; j <= c - 1; j++) {
				if (i == j || j == 4 && i != 1 && i != 2 && i != 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// cube
			for (int j = 1 + 1; j <= c - 1; j++) {
				if ((i + j) == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("----------------------------------------------------------");
		System.out.println("132.");
		System.out.println();

		for (int i = 1; i <= r; i++) {

			// cube
			for (int j = 1; j <= r; j++) {
				if (i == 1 || (i + j) == 8 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
