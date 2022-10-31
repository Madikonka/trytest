public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    //for (int i=0; i<balance; i=+)
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+balance);
    }

    public void deposit(int amountToDeposit){
        balance = balance + amountToDeposit;
        System.out.println("You just deposited "+amountToDeposit);
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew "+amountToWithdraw);
        return balance;
    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(30);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(20);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(10);

        //Check balance:
        savings.checkBalance();

    }
}
