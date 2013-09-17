import java.util.Scanner;
public class ComputeGrade{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your scores : ");
		double score=sc.nextDouble();
		char grade='?';
		if(score>79){
			grade='A';
		}
		else if(score>=70 && score<=79){
			grade='B';
		}
		else if(score>=60 && score<=69){
			grade='C';
		}
		else if(score>=50 && score<=59){
			grade='D';
		}
		else{
			grade='F';
		}
		System.out.println(grade);
	}
}
