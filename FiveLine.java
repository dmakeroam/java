public class FiveLine{
	public static void main(String[] args){
		final int PLINE=5;
		int count=1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter a number : ");
		int end=sc.nextInt();
		for(int i=0;i<=end;i++){
			if(count%PLINE==0){
				System.out.println(i);
			}
			else{
				System.out.print(i+" ");
			}
			count++;
		}
	}
}
