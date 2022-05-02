import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final int MAX = 10;
        int[] commission = new int[MAX];
        int sumOfSales = 0, index = 0;
        double twoThirdOfAverage = 0.0, salesCommission = 0.0;

        for (index = 0; index < commission.length; index++)
        {
            System.out.println("Enter an integer: ");
            commission[index] = keyboard.nextInt();
        }
        System.out.println("************");

        //Getting sum of the sales
        for (index = 0; index < MAX; index++) {
            sumOfSales = sumOfSales + commission[index];

        }//for
        twoThirdOfAverage = (double) sumOfSales / commission.length * 2/3;
        System.out.println("The total sales" + " is " + sumOfSales);
        System.out.println("************");

        for (index = 0; index < MAX; index++) {
            if (commission[index] > twoThirdOfAverage)
            {
                //salesCommission = commission[index] - twoThirdOfAverage;
                System.out.println("The saleman that qualified for commission of " + (commission[index] - twoThirdOfAverage) + " is from reference " + index);
            }

        }

    }
}
