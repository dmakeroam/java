package bankaccountquiz;

/**
 *
 * @author Ares
 */
public class SavingsAccount extends BankAccount {
    private static final String ACCTYPE="Savings Account";
    private double interestRate;
    private static double TRANSFER_FEE=20;

    public SavingsAccount() {
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void addInterest(){
        double balance=super.getBalance()*this.interestRate;
        super.deposit(balance);
    }

    @Override
     public String getAccType(){
        return SavingsAccount.ACCTYPE;
    }

    @Override
    public void transfer(BankAccount target, double amount) {
        if(target instanceof CurrentDepositAccount){
            CurrentDepositAccount tg=(CurrentDepositAccount)target;
            if(this.getAccId()==tg.getLinkSavingsAccount()){
                super.withdraw(amount+SavingsAccount.TRANSFER_FEE);
                target.deposit(amount);
            }
            else{
               super.withdraw(amount);
               target.deposit(amount); 
            }
        }
        else{
            super.withdraw(amount);
            target.deposit(amount); 
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{"+super.toString() + ", interestRate=" + interestRate + '}';
    }
    
    
    
}
