
package Java1stage;

public class Logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=15;
int b=25;
int c=30;
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a<c);
System.out.println(b>c);
  
System.out.println(a<b&&b>a);

System.out.println(a<b&&b<c);
System.out.println(a>b&&a<c);
System.out.println(b>c&&c<a);

System.out.println(a<b||a<b);System.out.println(a<b||b>a);System.out.println(a>b||b<c);System.out.println(a<b||c>a);
System.out.println(a<b||b<a||c>a);System.out.println(a<b||b>c||a<c);

/*logical and operator
 * true&&true=true only  otherwise all false
 *    ex   true&&false=false....
 *    
 *    logical or operator
 *    false||flase =false inly  otherwise all thrue
 *    ex true|| false= true 
 *  
 * we have also bitwise operators here 
 * & | snigle symbols use is bitwise operators 
 * 
 * 
 * 
 * 
 * 
 */
System.out.println(a<b|b<c);//here  check second condition also
	}

}
