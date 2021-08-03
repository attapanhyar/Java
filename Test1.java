public class Test1{
public static void main(String args[]){

int a =10;
int b= 1;

try{
	b = a/0;
}
catch(Exception ae){
System.out.println("Exception occured");
}
System.out.println(b);

}


}