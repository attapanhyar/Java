// This program creates a custom exception type.
class  ExceptionDemo extends Exception  {
private int detail;
ExceptionDemo(int a) {
detail = a;
}
public String toString() {
return "JamaliSb[" + detail + "]";
}
}
class MyException {
static void compute(int a) throws ExceptionDemo {
System.out.println("Called compute(" + a + ")");
if(a > 10)
throw new ExceptionDemo(a);
System.out.println("Normal exit");
}
public static void main(String args[]) {
try {
compute(1);
compute(20);
} catch (ExceptionDemo e) {
System.out.println("Caught " + e);
}
}
}