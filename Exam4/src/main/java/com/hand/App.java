package com.hand;

import java.util.*;

public class App 
{
	public static void main( String[] args ){

		Map<Integer,Integer[]> map = new HashMap<Integer, Integer[]>();
		int a[][] = new int [10][100]; 
		int b[] = new int[10];
		List l = new ArrayList();
		System.out.println("随机生成50个小于100的数，分别为：");
		for (int i = 0; i < 50; i++) {
			int x=(int)(Math.random()*100);
			System.out.print(x+",");
			l.add(x);
		}
		System.out.println();
		for (int i = 0; i < l.size(); i++) {
			int key = (Integer) l.get(i)/10;
			//System.out.println("key="+key+" b[key]="+b[key]+" i="+i);
			a[key][b[key]++] = (Integer) l.get(i);
		}
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < b[i]; j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 10; i++) {
//			map.put(i, a[i]);
//		}
		System.out.print("Map中的数据为：{");
		for (int i = 0; i < 10; i++) {
			System.out.print(i+"=>[");
			for (int j = 0; j < b[i]; j++) {
				if(i != 9){
					if(j != b[i]-1)
						System.out.print(a[i][j]+",");
					else
						System.out.print(a[i][j]+"],");
				}else{
					if(j != b[i]-1)
						System.out.print(a[i][j]+",");
					else
						System.out.println(a[i][j]+"]}");
				}
			}
		}
	}

}
