import java.util.Scanner;
import java.text.DecimalFormat;
public class ForRam{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    DecimalFormat ft=new DecimalFormat("0,000.00");
    System.out.print("Enter the number of terms : ");
    int term=(sc.nextInt()*12)/12+1;
    System.out.print("Enter the payments : ");
    double payments=sc.nextDouble();
    double termOfP=0;
    double interest=0;
    double total=0;
    System.out.println("Terms\t\tTerm of payments\tInterest\tTotal of terms\t\tPayments");
    System.out.println("0\t\t"+ft.format(termOfP)+"\t\t"+ft.format(interest)+"\t"+ft.format(total)+"\t\t"+ft.format(payments));
    termOfP=payments/(term-1);
    for(int i=1;i<term;i++){
      interest=(payments*(0.05/12));
      payments=payments-termOfP;
      total=termOfP+interest;
      System.out.println(i+"\t\t"+ft.format(termOfP)+"\t\t"+ft.format(interest)+"\t"+ft.format(total)+"\t\t"+ft.format(payments));
    }
  }
}