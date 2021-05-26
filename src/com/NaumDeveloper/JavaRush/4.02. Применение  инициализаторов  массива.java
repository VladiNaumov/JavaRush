package com.NaumDeveloper.JavaRush;//    Применение  инициализаторов  массива
//   Нахождение минимального и максимального значений в массиве

class  ArrayDemo  {

	public static void main(String args[]){
		int nums [] =  {20,100,-900,66,500,56,43,22,0,-1};
		int min, max ;


		min = max = nums[0];


		for (int i=1; i<10; i++){
			if(nums[i]<min) min=nums[i];
			if(nums[i]>max) max=nums[i];
		}


			System.out.println("min ja max: " + min +" "+ max);


	}
}
