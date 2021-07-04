


				// Demonstrate throw.
				class ThrowDemo {
				static void demoproc() {
				try {
				throw new NullPointerException("demo");
				} catch(NullPointerException e) {
				System.out.println("Caught inside demoproc.");
				try{
				throw e; // rethrow the exception
				}
				catch(NullPointerException ae){System.out.println("Caught inside demoproc.");}
				}
				}
				public static void main(String args[]) {
				try {
				demoproc();
				} catch(NullPointerException x) {
				System.out.println("Recaught: " + x);
				}
				}
				}