package Homework;

public class Str3 {
	public static void main(String[] args) {
		String[] names = { "Mano", "Sandy", "kiran", "Satheesh", "BCD" };
		// int count=0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("a") || names[i].contains("e") || names[i].contains("i") || names[i].contains("o")
					|| names[i].contains("u")) {
				// count++;

			} else {
				System.out.println(names[i]);
			}

		}

	}
}
