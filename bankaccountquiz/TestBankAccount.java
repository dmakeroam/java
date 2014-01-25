package bankaccountquiz;

/**
 *
 * @author Ares
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba=new SavingsAccount();
        BankAccount ba1=new CurrentDepositAccount();
        ba.deposit(3000);
        CurrentDepositAccount ba1Tran=(CurrentDepositAccount)ba1;
        ba1Tran.setLinkSavingsAccount(1);
        ba.transfer(ba1Tran,300);
        System.out.println(ba.getBalance());
    }
}
