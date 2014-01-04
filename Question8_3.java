import java.util.Date;
public class Question8_3 {
    public static void main(String[] args) {
        int k=0;
        Date [] d=new Date[9];
        for(int i=0;i<d.length;i++){
            if(i==2){
                continue;
            }
            if(i==d.length-1){
                break;
            }
            if(i==0 || i==1 || i==3){
               d[i]=new Date((int)Math.pow(10,(4+i)));
            }
            else if(i==4 && k==0){
               i--;
               d[i+1]=new Date((int)Math.pow(10,(4+(i)))); 
               k++;
            }
            else if(i>=4 && i<=7 && k!=0){
               d[i+1]=new Date((long)Math.pow(10,(4+(i)))); 
            }
            System.out.println(d[i].toString());
        }
    }
}
