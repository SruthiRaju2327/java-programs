package Ifandlooping;

import java.util.Scanner;

public class Leepscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter year num");
int year=s.nextInt();
if(((year%400==0)||(year%4==0))&&(year%100!=0)){
	System.out.println("leap year");
	
}else
	System.out.println("not a leap year");
}
	}


