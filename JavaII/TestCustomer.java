package JavaII;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class TestCustomer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of objects : ");
        int num=sc.nextInt();
        Customer [] cust=new Customer[num];
        for(int i=0;i<cust.length;i++){
            cust[i]=new Customer();
            cust[i].genCustomerId();
            cust[i].setCustName("Bayer");
            cust[i].setCustSurname("Tree");
            cust[i].setCustEmail("cpf@ruk-com.in.th");
            cust[i].setCustAdd("173 Moo 6 Saimai Saimai Bangkok 10220");
            cust[i].setCustPhone(new String[]{"0865881888","0819195895"});
            cust[i].setCustBirth(new Date(94,1,24));
            System.out.println("Cust ID : "+cust[i].getCustId());
            System.out.println("Cust Name : "+cust[i].getCustName());
            System.out.println("Cust Surname : "+cust[i].getCustSurname());
            System.out.println("Cust Email : "+cust[i].getCustEmail());
            System.out.println("Cust Address : "+cust[i].getCustAdd());
            System.out.println("Cust Phone : "+Arrays.toString(cust[i].getCustPhone()));
            System.out.println("Cust Birth : "+cust[i].getCustBirth().toLocaleString());
            System.out.println("ToString : "+cust[i].toString());
            System.out.println("---------------------------------------------------------");
        } 
    }
}
