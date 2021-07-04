

						import java.util.*;						class Exc0 {
						public static void main(String args[]) {
						int num1, num2;
						double div = 0;
						Scanner sc = new Scanner(System.in);
						Scanner sc1 = new Scanner(System.in);
						String str1;
						//sc.nextInt()----->integer
						//sc.nextDouble()--->double
						//sc.next()----->String
						
						try{
						/*x[2]=9;	
						int a = 42 / d;
						System.out.println("This will not be printed");*/
						
						System.out.println("Enter the first Integer");
						num1 = sc.nextInt();
						System.out.println("Enter the Second Integer");
						num2 = sc.nextInt();
						div = num1/num2;
						System.out.println("The division of num1 and num2 is: "+div);
											
						}catch(Exception ae){
							
							
							System.out.println("Exception caught"+ae);
							
						}
						finally{
							
							System.out.println("This will always be printed");
							
						}
						System.out.println("This is out of catch");
						str1 = sc1.next();
						}
						
						}