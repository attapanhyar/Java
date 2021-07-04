

						// This program contains an error and will not compile.
						class ThrowsDemo {
						static void throwOne() throws IllegalAccessException 
						{
						System.out.println("Inside throwOne.");
						throw new IllegalAccessException("Jamali");
						}
						public static void main(String args[]) 
						{
								try{
									throwOne();}
							
						catch(IllegalAccessException e){
							System.out.println("Caught IllegalAccessException"+ e);
							
						}
						
						}
						}