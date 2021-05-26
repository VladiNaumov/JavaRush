package com.NaumDeveloper.JavaRush;/*Демонстрация  алгоритма  пузырьковой  сортировки

пузырьковая сортировка отлично подходит дл я обработки
небольших массивов,  но при большом  числе элементов  массива она
становится  неэффективной.

*/

class  ArrayDemo  {

	public static void main(String args[]){
		int nums [] =  {20,100,-900,66,500,56,43,22,0,-1};
		int a,b,t;
		int size ;

		size=10; //  количество  сортируем элементов



//  Отобразить  исходный  массив

		System.out.print ("исходный массив: ");

		for (int i=1; i<size; i++)
			System.out.print(" "  +  nums[i]);

			System.out.println();

//  Реализовать  алгоритм  пузырьковой  сортировки

		for(a = 1;  a <  size;  a++)
			for (b = size-1;  b  >=  a;  b--) {
				if (nums[b - 1] > nums[b]) {
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}


//Отобразить  отсортированный  массив

		System.out.print ("исходный массив: ");

		for (int i=1; i<size; i++)
			System.out.print(" "  +  nums[i]);

		System.out.println();

	}
}