import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tC = mealCost + (mealCost * tipPercent) / 100 + (mealCost * taxPercent) / 100;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(tC);
        System.out.println(totalCost);
        // Print your result
    }
}
