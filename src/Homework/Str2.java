package Homework;

public class Str2 {
	public static void main(String[] args) {
		String[] names = { "Mano", "Sandy", "kiran", "Satheesh", "BCD" };
		int tem = names[0].length();
		String high = "";
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= tem) {
				tem = names[i].length();
				high = names[i];
			}
		}

			System.out.println(high);
		

	}
}
