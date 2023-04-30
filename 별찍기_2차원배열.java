package workspace;

public class 별찍기_2차원배열 {
	static char[][] s1 = new char[5][5];

	public static void print() {
		int i, j;
		for (i = 0; i < s1.length; i++) {

			for (j = 0; j < s1[0].length; j++) {
				
				System.out.print(s1[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < s1.length; i++) {

			for (j = 0; j < s1[0].length; j++) {
				if (j <= i) {
					s1[i][j] = '*';
				} else {
					s1[i][j] = '_';
				}
			}

		}
		print();
	}

}
