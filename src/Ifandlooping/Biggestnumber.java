package Ifandlooping;

import java.util.Scanner;

public class Biggestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
int num1=s.nextInt();
int num2=s.nextInt();
if(num1>num2) {
	System.out.println("num1 is bigg ");
}else if(num2>num1) {
	System.out.println("num2 is bigg");
}else
	System.out.println("boat are equal");
	}

}
