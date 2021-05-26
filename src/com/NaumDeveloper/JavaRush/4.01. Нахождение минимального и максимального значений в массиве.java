package com.NaumDeveloper.JavaRush;//   Нахождение минимального и максимального значений в массиве

class  ArrayDemo  {

	public static void main(String args[]){
		int nums [] = new int[10];
		int min, max ;

		nums[0]=99;
		nums[1]=-10;
		nums[2]=1001;
		nums[3]=9;
		nums[4]=19;
		nums[5]=39;
		nums[6]=-99;
		nums[7]=-9;
		nums[8]=997;
		nums[9]=1000;

		min = max = nums[0];


		for (int i=1; i<10; i++){
			if(nums[i]<min) min=nums[i];
			if(nums[i]>max) max=nums[i];
		}


			System.out.println("min ja max: " + min +" "+ max);


	}
}