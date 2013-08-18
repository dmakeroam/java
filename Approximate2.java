public class Approximate2{
  public static void main(String[] args){
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.print("Enter the number of round : ");
     int round=sc.nextInt();
     int count=1;
     double sum=0;
     for(int i=1;i<=round;i++){
        sum+=(Math.pow(-1,(i-1))*(1/(count*1.0)));
        count+=2;
     }
     System.out.println("The result is "+(4*sum));
  }
}