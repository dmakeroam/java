public class Reverse {
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("The result is "+(num%10)+""+((num/10)%10)+""+(num/100));
    }
}
