package quiz;

public class Gugudan {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("\n%d단: ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("\t%dx%d=%d ", dan, gop, dan * gop);

			}
		}
		// 2. 세로로
		for (int line = 0; line <= 10; ++line) {
			int mul = line;
			for (int step = 2; step <= 9; ++step) {
				if (line == 0) {
					System.out.printf("%d단\t\t", step);
				} else {
					System.out.printf("%d x %d= %d\t", line, mul, line * mul);
				}
			}
			System.out.println();
		}
	}
}
