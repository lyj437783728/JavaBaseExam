package com.hand;

public class judge {

	public static  boolean isSushu(int a){
		boolean boo = true;
		
		for (int b = 2; b < a; b++) {
			if(a%b == 0){
				boo = false;
				break;
			}
		}
		return boo;
		
	}
}
