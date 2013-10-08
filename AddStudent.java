import java.util.Scanner;
public class AddStudent{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a fullname : ");
		String fullname=sc.nextLine();
		int i=0;
		while(i<fullname.length()){
			System.out.print(fullname.charAt(i)+" ");
			i++;
		}
		System.out.println(); // for break
		System.out.println("Do you want to add another student? (Y/N)");
		String choice=sc.next();
		while(choice.equalsIgnoreCase("Y")){
			System.out.print("Enter a fullname : ");
			sc.nextLine(); // clear buffer
			fullname=sc.nextLine();
			i=0;
			while(i<fullname.length()){
				System.out.print(fullname.charAt(i)+" ");
				i++;
			}
			System.out.println();
			System.out.println("Do you want to owadd another student? (Y/N)");
			choice=sc.next();
		}
	}
}
