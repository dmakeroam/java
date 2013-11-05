public class ShiftWords {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a letter : ");
        String letter=sc.nextLine();
        while(letter.length()<=0 || letter.length()>300){
            System.out.print("Try again ! , Enter a letter : ");
            letter=sc.nextLine();
        }
        char [] forShift=letter.toCharArray();
        for(char e : forShift){
            switch(e){
                case '^':
                case '&':
                case '#':
                case '@':
                case '*':
                case '(':
                case '!':
                case '/':
                break;
                case ' ': System.out.print(" "); break;
                default : System.out.print((char)(e+3)); break;
            }         
        }
    }
}
