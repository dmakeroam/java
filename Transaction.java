import java.util.*;
import java.text.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Transaction implements Report {

    private BankAccount account[];
    private String header;
    private String body;
    private String footer;

    public Transaction() {

        account = new BankAccount[10];
        Address add1 = new Address("111", "Pracha-U-thid 45", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add2 = new Address("402", "Pracha-U-thid 48", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add3 = new Address("100", "Pracha-U-thid 44", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add4 = new Address("103", "Pracha-U-thid 46", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add5 = new Address("205", "Pracha-U-thid 55", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add6 = new Address("189", "Pracha-U-thid 79", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add7 = new Address("199", "Pracha-U-thid 80", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add8 = new Address("181", "Pracha-U-thid 78", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add9 = new Address("134", "Pracha-U-thid 90", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);
        Address add10 = new Address("11", "Pracha-U-thid 105", "Pracha-U-thid", "Thung-Kru", "Bangkok", 10140);


        String ph0[] = {"0-24709850"};
        String ph1[] = {"081-123-4567", "0-24709850"};
        String ph2[] = {"0" + (int) (Math.random() * 10000000)};
        String ph3[] = {"0" + (int) (Math.random() * 10000000)};
        String ph4[] = {"0" + (int) (Math.random() * 10000000)};
        String ph5[] = {"0" + (int) (Math.random() * 10000000)};
        String ph6[] = {"0" + (int) (Math.random() * 10000000)};
        String ph7[] = {"0" + (int) (Math.random() * 10000000)};
        String ph8[] = {"0" + (int) (Math.random() * 10000000)};
        String ph9[] = {"0" + (int) (Math.random() * 10000000), "0" + (int) (Math.random() * 10000000)};

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String input = "1980-12-01";
        Date t = null;
        try {
            t = sdf.parse(input);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + sdf);
        }

        Customer custs[] = new Customer[10];
        custs[0] = new Customer("somkiat", "kiatpisarn", add1, ph0, "somkiat@gmail.com", t);
        custs[1] = new Customer("suttiporn", "saisuwan", add2, ph1, "suttiporn@gmail.com", new Date(1999-1900,04,01));
        custs[2] = new Customer("vasinee", "wattanawat", add3, ph2, "vasinee@gmail.com", new Date(1986-1900,00,31));
        custs[3] = new Customer("adisorn", "meeboon", add4, ph3, "adisorn@gmail.com", new Date(1990-1900,01,01));
        custs[4] = new Customer("onkamon", "wongwisa", add5, ph4, "wongwisa@gmail.com", new Date(1991-1900,02,11));
        custs[5] = new Customer("charoensri", "kiatpisarn", add6, ph5, "charoensri@gmail.com", new Date(1980-1900,03,03));
        custs[6] = new Customer("paisarn", "meeboon", add7, ph6, "sathit@gmail.com", new Date(1981-1900,04,14));
        custs[7] = new Customer("sathit", "charoensri", add8, ph7, "somkiat@gmail.com", new Date(1992-1900,05,24));
        custs[8] = new Customer("somrak", "wattanawat", add9, ph8, "somrak@gmail.com", new Date(1999-1900,06,30));
        custs[9] = new Customer("somkiat", "parnpiti", add10, ph9, "parnpiti@gmail.com", new Date(1999-1900,07,10));

        for (int i = 0; i < custs.length; i++) {
            if (i % 2 == 0) {
                account[i] = new SavingsAccount(custs[i], 500, 5);
            } else {
                account[i] = new CurrentDepositAccount(custs[i], account[i - 1].getAccId(), 100000);
            }
        }

    }
    
    public void writeAccountObject(){
      try{
      ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("account.dat"));
      for(BankAccount e : this.account){
        oos.writeObject(e);
      }
      oos.close();
      }
      catch(IOException ioe){
        ioe.printStackTrace();
      }
    }
    
    public void readAccountObject(){
      ObjectInputStream ois=null;
      try{
      ois=new ObjectInputStream(new FileInputStream("account.dat"));
      while(true){
        BankAccount ba=(BankAccount)(ois.readObject());
        System.out.println(ba);
      }
      }
      catch(IOException | ClassNotFoundException eof){
        try{
          ois.close();
        }
        catch(IOException iof){
          System.out.println("IO Error");
        }
      }
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
        this.header = header;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < account.length; i++) {
            result += account[i] + "\n" + "------------------------------------------------------------------------------------------------------------------------------" + "\n";
        }
        return result;
    }
}
