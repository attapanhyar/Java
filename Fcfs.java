import java.util.*;
class Fcfs
{
	public static void main(String[] args)
	{
		String id[]=new String[20];
		int btime[]=new int[20];
		int wtime[]=new int[20];
		int total=0;
		float avg;
		Scanner sn = new Scanner(System.in);
		System.out.print("\nEnter the number of processes : ");
		int n = sn.nextInt();
		for (int i=0;i	<n;i++)	{
			System.out.println();
			System.out.print("Enter the process ID of process "+(i+1)+" : ");
			id[i]=sn.next();
			System.out.print("Enter the burst time of process "+(i+1)+" : ");
			btime[i]=sn.nextInt();
		}
		wtime[0]=0;
		for (int i=1;i<n;i++)	{
			wtime[i]=wtime[i-1]+btime[i-1];
			total=total+wtime[i];
		}
		avg=(float)total/n;
		System.out.println("\nProcess_ID\tBurst_time\tWait_time");
		for(int i=0;i<n;i++)
		{
			System.out.println(id[i]+"\t\t"+btime[i]+"\t\t"+wtime[i]);
		}
		System.out.println("\nTotal wait time: "+total+"\nAverage wait time: "+avg);
	}

}