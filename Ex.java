public class Ex
{  
public static int factorial(int N) { 
if (N == 1) return 1; 
   return N*  factorial(N-1); 
} 
 public static void main(String args[])
 { 
int a=5; 
  System.out.println("The factorial of  "+" is "+Ex.factorial(a));
 } }
