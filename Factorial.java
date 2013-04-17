package testheap;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        while(n<1 || n>=1000){
            System.out.print("Try again : ");
            n=sc.nextInt();
        }
        long fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        String lastDigit=fac+"";
        System.out.println("The last digit is : "+lastDigit.charAt(lastDigit.length()-1));
    }
}
