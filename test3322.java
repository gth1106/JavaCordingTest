package workspace;

public class test3322 {

	public static void main(String[] args) {
		int i, j;
		int n = 0;
		i = 0;
		j = 0;
		int s[][] = new int[3][5];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				s[i][j] = n;
				n++;
			}
		}

		System.out.print(s[i - 2][j - 1]);
	}
}
