package com.hand;

import java.util.Scanner;

public class Shui {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入工资：");
		float sal = input.nextFloat();
		sal = sal - 3500;
		double sum = 0;
		if(sal < 1500 && sal >0){
			sum = sal*0.03;
		}else if(sal > 1500 && sal <= 4500){
			sum = 1500*0.03+(sal-1500)*0.1;
		}else if(sal > 4500 && sal <= 9000){
			sum = 1500*0.03+3000*0.1+(sal-4500)*0.2;
		}else if(sal > 9000 && sal <= 35000){
			sum = 1500*0.03+3000*0.1+4500*0.2+(sal-9000)*0.25;
		}else if(sal > 35000 && sal <= 55000){
			sum = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+(sal-35000)*0.3;
		}else if(sal > 55000 && sal <= 80000){
			sum = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(sal-55000)*0.35;
		}else if(sal > 80000){
			sum = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(sal-80000)*0.45;
		}
		
		System.out.println("所需要缴纳的税费为："+sum);
	}

}
