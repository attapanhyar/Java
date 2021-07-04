import java.util.*;
public class RepStruc{
	public static void main(String[] args){
		
		/*
		int Counter=0;
		// For Loop
		for(Counter =0; Counter<10;Counter++){
			System.out.print("*");
					
		}
		System.out.println();
		
		
		// do while.... REPEAT....UNTIL
		
		do{
			
		System.out.println("*");
						
		}while(Counter<10);
		
		
		
		// While ..... WHILE DO
		
		while(Counter >0)
		{
			System.out.print("*");
			
			
			Counter--;
			
		}
		
		*/
		
		// Switch statement ..  Control
		Scanner sc = new Scanner(System.in);
		int x=3;
		int num1=12, num2 = 5, sum = 0,sub,mult;
		double div;
		System.out.println("Enter the value of First operand");
		num1 = sc.nextInt();
		System.out.println("Enter the value of Second operand");
		num2 = sc.nextInt();
		
		System.out.println("For Addition Press 1 \n for Subtraction Press 2 \n For Multiplication Press 3 \n For Division Press 4");
		x = sc.nextInt();
			
		switch(x){
			
			case 1: sum= num1+num2; System.out.println("Addition of two number =: "+sum);break;
			case 2: sub= num1-num2; System.out.println("Subtraction of two number =: "+sub);break;
			case 3: mult= num1*num2; System.out.println("Multiplication of two number =: "+mult);break;
			case 4: div= num1/num2; System.out.println("Division of Two Numbers =: "+div);break;
			default: System.out.println("Invalid Number");
			}
		
		
	}
	
	
	
	
	
}