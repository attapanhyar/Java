// ATM.java
 // Represents an automated teller machine

public class ATM{
private boolean userAuthenticated; // whether user is authenticated
 private int currentAccountNumber; // current user's account number
 private Screen screen; // ATM's screen
 private Keypad keypad; // ATM's keypad
 private CashDispenser cashDispenser; // ATM's cash dispenser
 private DepositSlot depositSlot; // ATM's deposit slot
private BankDatabase bankDatabase; // account information database

 // constants corresponding to main menu options
 private static final int BALANCE_INQUIRY = 1;
 private static final int WITHDRAWAL = 2;
 private static final int DEPOSIT = 3;
 private static final int EXIT = 4;

 // no-argument ATM constructor initializes instance variables
 public ATM()
 {
 userAuthenticated = false; // user is not authenticated to start
 currentAccountNumber = 0; // no current account number to start
 screen = new Screen(); // create screen

 keypad = new Keypad(); // create keypad
 cashDispenser = new CashDispenser(); // create cash dispenser
 depositSlot = new DepositSlot(); // create deposit slot
 bankDatabase = new BankDatabase(); // create acct info database
 } // end no-argument ATM constructor

 // start ATM
 public void run()
 {
 // welcome and authenticate user; perform transactions
 while ( true )
 {
 // loop while user is not yet authenticated
 while ( !userAuthenticated )
 {
 screen.displayMessageLine( "\nWelcome!" );
 authenticateUser(); // authenticate user
 } // end while

 performTransactions(); // user is now authenticated
 userAuthenticated = false; // reset before next ATM session
 currentAccountNumber = 0; // reset before next ATM session
 screen.displayMessageLine( "\nThank you! Goodbye!" );
 } // end while
 } // end method run

 // attempts to authenticate user against database
 private void authenticateUser()
 {
 screen.displayMessage( "\nPlease enter your account number: " );
 int accountNumber = keypad.getInput(); // input account number
 screen.displayMessage( "\nEnter your PIN: " ); // prompt for PIN
 int pin = keypad.getInput(); // input PIN

 // set userAuthenticated to boolean value returned by database
 userAuthenticated =
 bankDatabase.authenticateUser( accountNumber, pin );

 // check whether authentication succeeded
 if ( userAuthenticated )
 {
 currentAccountNumber = accountNumber; // save user's account #
 } // end if
 else
 screen.displayMessageLine(
 "Invalid account number or PIN. Please try again." );
 } // end method authenticateUser

 // display the main menu and perform transactions
 private void performTransactions()
 {
 // local variable to store transaction currently being processed
 Transaction currentTransaction = null;


 boolean userExited = false; // user has not chosen to exit

 // loop while user has not chosen option to exit system
 while ( !userExited )
 {
 // show main menu and get user selection
 int mainMenuSelection = displayMainMenu();

 // decide how to proceed based on user's menu selection
 switch ( mainMenuSelection )
 {
 // user chose to perform one of three transaction types
 case BALANCE_INQUIRY:
 case WITHDRAWAL:
 case DEPOSIT:

 // initialize as new object of chosen type
 currentTransaction =
 createTransaction( mainMenuSelection );

 currentTransaction.execute(); // execute transaction
 break;
 case EXIT: // user chose to terminate session
 screen.displayMessageLine( "\nExiting the system..." );
userExited = true; // this ATM session should end
break;
 default: // user did not enter an integer from 1-4
 screen.displayMessageLine(
 "\nYou did not enter a valid selection. Try again." );
 break;
 } // end switch
 } // end while
 } // end method performTransactions

 // display the main menu and return an input selection
 private int displayMainMenu()
 {
 screen.displayMessageLine( "\nMain menu:" );
 screen.displayMessageLine( "1 - View my balance" );
 screen.displayMessageLine( "2 - Withdraw cash" );
 screen.displayMessageLine( "3 - Deposit funds" );
 screen.displayMessageLine( "4 - Exit\n" );
 screen.displayMessage( "Enter a choice: " );
 return keypad.getInput(); // return user's selection
 } // end method displayMainMenu

 // return object of specified Transaction subclass
 private Transaction createTransaction( int type )
 {
 Transaction temp = null; // temporary Transaction variable

//Fig. 13.13 | Class ATM represents the ATM. (Part 3 of 4.)526 Chapter 13 ATM Case Study Part 2: Implementing an Object-Oriented Design
//Lines 15–18 declare integer constants that correspond to the four options in the
//ATM’s main menu (i.e., balance inquiry, withdrawal, deposit and exit). Lines 21–30
//declare the constructor, which initializes the class’s attributes. When an ATM object is first
//created, no user is authenticated, so line 23 initializes userAuthenticated to false. Likewise, line 24 initializes currentAccountNumber to 0 because there’s no current user yet.
//Lines 25–28 instantiate new objects to represent the ATM’s parts. Recall that class ATM has
//composition relationships with classes Screen, Keypad, CashDispenser and DepositSlot,
//so class ATM is responsible for their creation. Line 29 creates a new BankDatabase. [Note:
//If this were a real ATM system, the ATM class would receive a reference to an existing database object created by the bank. However, in this implementation we’re only simulating
//the bank’s database, so class ATM creates the BankDatabase object with which it interacts.]
//ATM Method run
//The class diagram of Fig. 13.10 does not list any operations for class ATM. We now implement one operation (i.e., public method) in class ATM that allows an external client of the
//class (i.e., class ATMCaseStudy) to tell the ATM to run. ATM method run (lines 33–50) uses
//an infinite loop (lines 36–49) to repeatedly welcome a user, attempt to authenticate the
//user and, if authentication succeeds, allow the user to perform transactions. After an authenticated user performs the desired transactions and chooses to exit, the ATM resets itself, displays a goodbye message to the user and restarts the process. We use an infinite loop
//here to simulate the fact that an ATM appears to run continuously until the bank turns it
//off (an action beyond the user’s control). An ATM user has the option to exit the system
//but not the ability to turn off the ATM completely.
//Authenticating a User
//In method run’s infinite loop, lines 39–43 cause the ATM to repeatedly welcome and attempt to authenticate the user as long as the user has not been authenticated (i.e., !user-
//131 // determine which type of Transaction to create
 switch ( type )
 {
 case BALANCE_INQUIRY: // create new BalanceInquiry transaction
 temp = new BalanceInquiry(
 currentAccountNumber, screen, bankDatabase );
 break;
 case WITHDRAWAL: // create new Withdrawal transaction
 temp = new Withdrawal( currentAccountNumber, screen,
 bankDatabase, keypad, cashDispenser );
 break;
 case DEPOSIT: // create new Deposit transaction
 temp = new Deposit( currentAccountNumber, screen,
 bankDatabase, keypad, depositSlot );
 break;
 } // end switch

 return temp; // return the newly created object
 } // end method createTransaction
 } // end class ATM