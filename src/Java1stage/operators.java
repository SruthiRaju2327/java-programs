package Java1stage;

public class operators {
public static void main(String[]args) {
	int a=10;
	int j=20;
	System.out.println(a+j); //operators are using arithamatic operations 
	System.out.println(a-j);//a j  are operans   + this operator
	
	System.out.println(a*j);
	
	System.out.println(a/j);
	System.out.println(a%j);
	
	System.out.println(a++);//10   
	/*this operator unary operator
	 * a++ post increment operator ..here value update on memory but not return that value
	 * ++a preincrement operator ..here update value and return printed
	 * 
	 * 
	 * 
	 */
	
	System.out.println(++a);//12   
	System.out.println(j--);//20
	System.out.println(--j);//18
	
	System.out.println(a++ -j++);
	System.out.println(++a+j--);
	
}}



