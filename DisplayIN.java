/*
 I N

***456*789X*
 *    * *  *
 *    *  * *
 *    *   **
***   *    *

 */
package forquiz;

/**
 *
 * @author oam
 */
public class DisplayIN {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 12; j++) {
                switch (i) {
                    case 0:
                        if (j == 1 || j == 2 || j == 3 || j == 7 || j == 12) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 1:
                        if (j == 2 || j == 7 || j == 9 || j == 12) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 2:
                        if(j==2 || j==7 || j==10 || j==12){
                            System.out.print("*");
                        }
                        else{
                           System.out.print(" "); 
                        }
                        break;
                    case 3:
                         if(j==2 || j==7 || j==11 || j==12){
                            System.out.print("*");
                        }
                        else{
                           System.out.print(" "); 
                        } 
                        break;
                    case 4:
                        if (j == 1 || j == 2 || j == 3 || j == 7 || j == 12) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;                        
                }
            }
            System.out.println();
        }
    }
}
