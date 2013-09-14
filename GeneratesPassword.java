import java.util.Scanner;
public class GeneratesPassword{
	public static void main(String[] args){ // ancdef >> ncd111f uppercase a
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a username : ");
		String username=sc.next();
		String password=username.substring(1,4)+((int)(Math.random()*999)+111)+(char)(username.charAt(username.length()-1)-32)+(char)(username.charAt(0)+32);
		System.out.println("Your username is "+username+" and password is "+password);
	}
}
