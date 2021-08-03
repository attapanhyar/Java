import java.util.ArrayList;
import java.util.Collections;
public class BankAccount{
	String Name;
	int AccntNum;
	int Balance;
	
	public BankAccount(String Name,int AcctNum, int Balance){
	this.Name=Name;
	this.AcctNum=AcctNum;
	this.Balance=Balance;
	
	}
	public void showAll(){
		System.out.println("Name"+this.Name+" Acc Num"+this.AcctNum+" Balance"+this.Balance);
		
	}
	
	public static void main(String args[]){
		BankAccount bnk1 = new BankAccount("ALI","1234",1300);
		BankAccount bnk2 = new BankAccount("Atta","1264",1200);
		BankAccount bnk3 = new BankAccount("Ajay","0234",1350);
		bnk1.show();
		
		
	}

}