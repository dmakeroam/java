public class ShiftFollowIndex {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a letter : ");
        String letter=sc.nextLine();
        while(letter.length()<=0 || letter.length()>300){
            System.out.print("Try again ! , Enter a letter : ");
            letter=sc.nextLine();
        }
        char [] forShift=letter.toCharArray();
        for(int i=0;i<forShift.length;i++){
            switch(forShift[i]){
                case '^':
                case '&':
                case '#':
                case '@':
                case '*':
                case '(':
                case '!':
                case '/': 
                case ' ': System.out.print(forShift[i]); break;                    
                default : 
                if(!Character.isLowerCase(forShift[i]) && (forShift[i]+i)>90){
                    System.out.print((char)(((forShift[i]+i)-65)%26+65));
                }
                else if(Character.isLowerCase(forShift[i]) && (forShift[i]+i)>122){
                    System.out.print((char)(((forShift[i]+i)-97)%26+97));
                }
                else{
                    System.out.print((char)(forShift[i]+i));
                }
                break;
        }
    }
    }
}
