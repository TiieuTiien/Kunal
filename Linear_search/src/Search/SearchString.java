package Search;

public class SearchString {
	public static void main(String[] args) {
		String name = "Tien";
		char target = 'i';
		System.out.println(stringSearch(name, target));
	}

	private static boolean stringSearch(String name, char target) {
		if (name.length() == 0) {
			return false;
		}

		for (int i = 0; i < name.length(); i++) {
			if (target == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	private static boolean stringSearch2(String name, char target) {
		if (name.length() == 0) {
			return false;
		}

		for (char ch : name.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}
		return false;
	}

}
