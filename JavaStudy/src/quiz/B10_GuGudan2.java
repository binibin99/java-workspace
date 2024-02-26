package quiz;

public class B10_GuGudan2 {

	// for문으로 출력했던 구구단 2개를 while문으로 출력해보세요

	public static void main(String[] args) {
		int dan = 2;

		while (dan <= 9) {
			System.out.printf("%d단:", dan);

			// 곱하기를 다시 1로 만들어야 다시 반복할 수 있다
			int gop = 1;
			while (gop <= 9) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
				++gop;

			}
			System.out.println();
			++dan;
		}
			
			dan = 2;
			while (dan <= 9) {
				System.out.printf("%d단\t", dan++);
			}
			System.out.println();
			
			int gop2 = 1;			
			while (gop2 <= 9) {
				int dan2 = 2;
				while (dan2 <= 9) {
					System.out.printf("%d x %d= %d\t", dan2, gop2, dan2 * gop2);
					++dan2;
	
				}
				System.out.println();
				++gop2;
			}
		}
	}

