package com.NaumDeveloper.JavaRush;//  Демонстрация  использования  двуxмерного  массива

class  TwoD  {

	public static void main(String args[]) {
		int t, i;
		int tаblе[][] = new int[3][4];

		for (t = 0; t < 3; ++t) {
			for (i = 0; i < 4; ++i) {
				tаblе[t][i] = (t * 4) + i + 1;
				System.out.print(tаblе[t][i] + "  ");
			}

			System.out.println();

		}

	}
}

