package com.hand;

public class Sushu {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = new int[30];
	    int index = 0;
		for (int i = 101; i < 200; i++) {
			if(judge.isSushu(i)){
				count++;
				arr[index++] = i;
			}
		}
		System.out.print("101-200间总共有"+count+"个素数，分别是：");
		for (int i = 0; i < count; i++) {
			if(i != count-1)
				System.out.print(arr[i]+",");
			else
				System.out.println(arr[i]);
		}
	}
	
	
	
	
	

}
