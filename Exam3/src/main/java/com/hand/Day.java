package com.hand;
import java.util.*;
public class Day {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入日期：");
		String str = input.nextLine();
		String arr[] = str.split("-");
		int dayc[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int days = 0,a=0;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		int year = Integer.parseInt(arr[0]);
		//System.out.println(year);
		int month = Integer.parseInt(arr[1]);
		//System.out.println(month);
		int day = Integer.parseInt(arr[2]);
		if( (year%4==0 && year%100!=0) || (year%400==0)) {
			a=1;
		}
		for(int i = 0;i<month-1;i++){
			days+=dayc[i];
		}
		
		days+=a+day;
		if(a == 1 && month <= 2)
			days-=1;
		System.out.println("你输入的日期为当年的第"+days+"天");
		
	}

}
