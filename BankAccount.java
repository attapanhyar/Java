import java.util.ArrayList;
import java.util.Collections;
public class BankAccount{
	String Name;
	int AcctNum;
	int Balance;
	public BankAccount(String Name,int AcctNum, int Balance){
	this.Name=Name;
	this.AcctNum=AcctNum;
	this.Balance=Balance;
	}
	public static void showAll(ArrayList<BankAccount> lst){
		int tot=0;
		int bal=0;
		for (int i =0;i<lst.size();i++){
			bal = lst.get(i).Balance;
			System.out.println("Name "+lst.get(i).Name+"\nAcc Num "+lst.get(i).AcctNum+"\nBalance "+lst.get(i).Balance);
			tot +=lst.get(i).Balance;
		}
		System.out.println(tot);
	}
	
	public static void main(String args[]){
		BankAccount bnk1 = new BankAccount("ALI",1234,13);
		BankAccount bnk2 = new BankAccount("Atta",1264,12);
		BankAccount bnk3 = new BankAccount("Ajay",0234,13);
		ArrayList<BankAccount> lst = new ArrayList<BankAccount>();
		lst.add(bnk1);
		lst.add(bnk2);
		lst.add(bnk3);
		showAll(lst);
		
	}

}