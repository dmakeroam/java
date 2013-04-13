/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posn;
import java.util.Scanner;
/**
 *
 * @author oam
 */
public class FairAndSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        int [] count=new int[testCase];
        for(int i=0;i<testCase;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            if(isPalindrome(a) && isPalindrome((int)(Math.sqrt(a)))){
                count[i]++;
            }
             if(isPalindrome(b) && isPalindrome((int)(Math.sqrt(b)))){
                count[i]++;
            }
        }
        for(int i=0;i<testCase;i++){
            System.out.println("CASE #"+(i+1)+":"+count[i]);
        }
    }
    public static int reverse(int input){
        String a=Integer.toString(input);
        String num="";
        for(int i=0;i<a.length();i++){
            num=a.charAt(i)+""+num;   
        }
        return Integer.parseInt(num);
    }
    public static boolean isPalindrome(int input){
        if(input==reverse(input)){
            return true;
        }
        else{
            return false;
        }        
    }
    
}
