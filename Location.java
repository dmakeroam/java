
import java.util.Scanner;

public class Location {

    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location forReturn = new Location();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > forReturn.maxValue) {
                    forReturn.maxValue = a[i][j];
                    forReturn.row = i;
                    forReturn.column = j;
                }
            }
        }
        return forReturn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and collumn of array: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        double size[][] = new double[row][column];
        System.out.print("Enter the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                size[i][j] = sc.nextDouble();
            }
        }
        Location display = Location.locateLargest(size);
        System.out.println("The location of largest element is " + display.maxValue + " at (" + display.row + "," + display.column + ")");
    }
}