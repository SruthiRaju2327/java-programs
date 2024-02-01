
package Java1stage;

import java.util.Scanner;

public class Rajscanner {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
/*int n=s.nextInt();
boolean b=s.nextBoolean();
String S=s.nextLine();
System.out.println(n);
System.out.println(b);*/

System.out.println("enter name, age,and salary:");
String name=s.nextLine();
int age=s.nextInt();
double salary=s.nextDouble();
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("salary:"+salary);
	}

}
