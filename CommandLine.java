// Display all command-line arguments.
class CommandLine {
		public static void main(String args[]) {
		int[] x=new int[args.length];
		int Sum=0;
		for(int i=0; i<args.length; i++){
		System.out.println("args[" + i + "]: " +
		args[i]);
		x[i] = Integer.parseInt(args[i]);
		Sum +=x[i];
		}
		System.out.println("Sum is " +Sum);
		}
		
		
	
		
		
}