package com.lib.tns;
import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj = new car();
		obj.forward();
		obj.backward();
		obj.stop();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the reg no");
		int reg = sc.nextInt();
		
		System.out.println("the reg no is:"+ reg);
		System.out.println("the color is :" +obj.color);

	}

}
