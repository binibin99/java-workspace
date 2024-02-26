package myobj.card;

import java.util.ArrayList;
import java.util.HashSet;

public class card {
	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
		ArrayList<String> form = new ArrayList<>();
		HashSet<String> sum = new HashSet<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");

		form.add("●");
		form.add("★");
		form.add("▲");

			for (int i = 0; i < (Math.random() * colors.size()); ++i) {
				for (int q = 0; q < (Math.random() * form.size()); ++q) {
					while (sum.size() < 12) {
						sum.add(colors.get(i) + form.get(q));
				}
					System.out.println(sum);
			}

		}
	}
}

