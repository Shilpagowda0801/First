package gitt;

public class Fst_prog {
	public static void main(String[] args) {
		int count = 0;
		int n = 893893937;
		while (n != 0) {
			int r = n % 10;
			if (r % 2 == 0) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);
	}
}
