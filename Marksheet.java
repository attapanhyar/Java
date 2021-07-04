import java.util.*;
class Marksheet
{
public static void main(String[] arg)
{
int noS=0;
Scanner sc=new Scanner(System.in);
System.out.println("\nWelcome to marks sheet\n\n");
System.out.print("Enter the name of Student \t:\t");
String name=sc.next();
System.out.print("Enter the Roll Number \t\t:\t");
String roll=sc.next();
System.out.print("Enter the College Name \t\t:\t");
String clg=sc.next();

String sub[] = new String[100];
int Marks[] = new int[100];
System.out.print("Enter Number of Subjects = ");
noS = sc.nextInt();
for(int i=0;i<noS;i++)
{
	System.out.print("\nEnter Subject "+(i+1)+" Name\t:\t");
	sub[i]=sc.next();
}

for(int i=0;i<noS;i++)
{
	System.out.print("\nEnter Marks of Subject "+(i+1)+"\t:\t");
	Marks[i]=sc.nextInt();
}
int total=0;
float percent;
for(int i=0;i<noS;i++)
{
	total+=Marks[i];
}

percent=total/noS;

System.out.print("\n\n\t\t   Marksheet");
System.out.print("\n-----------------------------------------------------");
System.out.print("\n\tName\t\t:\t"+name);
System.out.print("\n\tRoll No.\t:\t"+roll);
System.out.print("\n\tCollege\t\t:\t"+clg);
System.out.print("\n-----------------------------------------------------");
System.out.print("\n\tSubject\t\t:\tMarks");
for(int i=0;i<noS;i++)
{
	System.out.print("\n\t"+sub[i]+"\t\t:\t"+Marks[i]+"\n");
}
System.out.print("\n-----------------------------------------------------"); 
System.out.print("\n\tTotal\t\t:\t"+total);
System.out.print("\n\tPercentage\t:\t"+percent);

if(percent>=60)
{
System.out.print("\n\tDivision\t:\tFirst");
}

if(percent>=40 && percent<60)
{
System.out.print("\n\tDivision\t:\tSecond");
}

if(percent<40)
{
System.out.print("\n\tDivision\t:\tThird");
}
}
}