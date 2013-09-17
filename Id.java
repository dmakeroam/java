import java.util.Scanner;
public class Id{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		if(num%2==0 && num%5==0){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
	}
}
