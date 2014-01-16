package JavaII;

import java.util.Arrays;
import java.util.Date;
public class Customer {
    private long custId;
    private String custName;
    private String custSurname;
    private String custAdd;
    private String[] custPhone;
    private String custEmail;
    private Date custBirth;
    private static int n;

    public Customer() {
        this(null,null,null);
    }

    public Customer(String custAdd, String[] custPhone, Date custBirth) {
        this.custAdd = custAdd;
        this.custPhone = custPhone;
        this.custBirth = custBirth;
        n++;
    }

    public long getCustId() {
        return custId;
    }

    public long genCustomerId(){
        this.custId=10000+n;
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public void setCustSurname(String custSurname) {
        this.custSurname = custSurname;
    }

    public String getCustAdd() {
        return custAdd;
    }

    public void setCustAdd(String custAdd) {
        this.custAdd = custAdd;
    }

    public String[] getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String[] custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getCustBirth() {
        return custBirth;
    }

    public void setCustBirth(Date custBirth) {
        this.custBirth = custBirth;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName=" + custName + ", custSurname=" + custSurname + ", custAdd=" + custAdd + ", custPhone=" + Arrays.toString(custPhone) + ", custEmail=" + custEmail + ", custDate=" + custBirth.toLocaleString() + '}';
    }
    
}
