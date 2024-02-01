package Ifandlooping;

import java.util.Scanner;

public class ifelseifcurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner os=new Scanner(System.in);
System.out.println("enter ammount");
int a=os.nextInt();
if(a%100==0) {
	if(a>=2000) {
	int n=a/2000;
	System.out.println("2000*"+n);
	a=a-(2000*n);
	System.out.println("plz take your ammount  "+n);}else {
			
		System.out.println("plz enter curect ammount");
	}
	}
}
	}


