package bankaccountquiz;

/**
 *
 * @author Ares
 */
public class CurrentDepositAccount extends BankAccount {
    private static final String ACCTYPE="Current Deposit Account";
    private long linkSavingsAccount;

    public CurrentDepositAccount() {
    }

    @Override
    public String getAccType() {
        return CurrentDepositAccount.ACCTYPE;
    }

    public long getLinkSavingsAccount() {
        return linkSavingsAccount;
    }

    public void setLinkSavingsAccount(long linkSavingsAccount) {
        this.linkSavingsAccount = linkSavingsAccount;
    }

    @Override
    public String toString() {
        return "CurrentDepositAccount{" +super.toString() + ", linkSavingsAccount=" + linkSavingsAccount + '}';
    }
    
}
