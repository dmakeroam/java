package bankaccountquiz;
import java.util.Date;
/**
 *
 * @author Ares
 */
public class BankAccount {

    private long accId;
    private double balance;
    private Date dateCreated;
    private Customer cust;
    private static final String ACCTYPE="";
    private static int generate_id=10001;

    public BankAccount() {
    }
    
    public String getAccType(){
        return BankAccount.ACCTYPE;
    }

    public long getAccId() {
        return accId;
    }

   public long genAccountId(){
       accId=generate_id++;
       return accId;
   }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
    
    public void deposit(double amount){
        if(!(amount<0)){
            this.setBalance(this.getBalance()+amount);
        }
        else{
            System.err.println("Error from deposit : Amount is less than zero.");
        }
    }
    
    public void withdraw(double amount){
        if(!(amount<0 || (amount>this.getBalance()))){
            this.setBalance(this.getBalance()-amount);
        }
        else{
           System.err.println("Error from withdraw : Amount is less than zero or amount is greater than your balance."); 
        }
    }
    
    public void transfer(BankAccount target,double amount){
       if(!(amount<0 || (amount>this.getBalance()))){
            this.setBalance(this.getBalance()-amount);
            target.deposit(amount);
        }
       else{
           
       }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accId=" + accId + ", balance=" + balance + ", dateCreated=" + dateCreated + ", cust=" + cust + ", ACCTYPE="+BankAccount.ACCTYPE+'}';
    }
  
    
}
