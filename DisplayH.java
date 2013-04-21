package forquiz;

/**
 *
 * @author oam
 */
public class DisplayH {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 2) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
