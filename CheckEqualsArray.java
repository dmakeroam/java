package forquiz;


import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.TreeSet;

public class CheckEqualsArray {

    public static void main(String[] args) {
        int countEquals = 0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat ft = new DecimalFormat("0");
        TreeSet<Double> display = new TreeSet<>();
        System.out.print("Enter numbers 1 : ");
        String[] num1Before = sc.nextLine().split(" ");
        double[] num1 = new double[num1Before.length];
        for (int i = 0; i < num1Before.length; i++) {
            num1[i] = Double.parseDouble(num1Before[i]);
        }
        System.out.print("Enter numbers 2 : ");
        String[] num2Before = sc.nextLine().split(" ");
        double[] num2 = new double[num2Before.length];
        for (int i = 0; i < num2Before.length; i++) {
            num2[i] = Double.parseDouble(num2Before[i]);
        }
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    countEquals++;
                    display.add(num2[j]);
                }
            }
        }
        System.out.println("Equals : " + countEquals);
        System.out.print("The number of equals is "); // 3.0 3.5
        for (double elements : display) {
            System.out.print((elements == Math.ceil(elements)) ? ft.format(elements) + " " : elements + " ");
        }
        System.out.println();
    }
}