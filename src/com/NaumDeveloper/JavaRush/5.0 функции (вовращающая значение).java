// функции (вовращающая значение).

package com.NaumDeveloper.JavaRush;


public class Main {

    public static void main(String[] args) {
		int temp = func (3, 4);  // считает степень (3 в степени 4)
		System.out.print(temp);

	}

	//создаём функцию для расчёта степени

	public static int func(int a, int b) {

		int result = 1;
		for (int i = 0; i < b; i++)
			result *= a;
		return result;

	}


}
