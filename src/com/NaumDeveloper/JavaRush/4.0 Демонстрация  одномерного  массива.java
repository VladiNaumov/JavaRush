package com.NaumDeveloper.JavaRush;//  Демонстрация  одномерного  массива

class  ArrayDemo  {

	public static void main(String args[]){
		int array [] = new int[10];
		int i;

		for(i=0;i<10;i++)
			array[i]=i;


		for(i=0;i<10;i++)
			System.out.println("Element [" + i +"]:"+array[i]);


	}
}