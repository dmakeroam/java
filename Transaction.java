package report;

/**
 *
 * @author Student Lab
 */
public class Transaction implements Report{
    private BankAccount[] account;
    private String header;
    private String body;
    private String footer;

    public Transaction() {
    }

    @Override
    public String toString() {
        return "Transaction{" + "account=" + account + ", header=" + header + ", body=" + body + ", footer=" + footer + '}';
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public String getFooter() {
        return footer;
    }

    @Override
    public void setHeader(String header) {
        this.header=header;
    }

    @Override
    public void setBody(String body) {
        this.body=body;
    }

    @Override
    public void setFooter(String footer) {
        this.footer=footer;
    }
}
