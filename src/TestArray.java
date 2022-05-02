import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MAX = 8;
        int[] myNumbers = new int[MAX];
        int index = 0;
        int isOdd = 0, sumOfIntegers = 0;
        double arrayAverage = 0.0;


        for (index = 0; index < MAX; index++) {
            System.out.println("Enter an integer: ");
            myNumbers[index] = keyboard.nextInt();

        }
        System.out.println("************");

        for (index = 0; index < MAX; index++) {
            if (myNumbers[index] % 2 == 1) {
                isOdd = isOdd + 1;
            }//if

        }//for
        System.out.println("number of odd number is " + isOdd);
        System.out.println("************");

        for (index = 0; index < MAX; index++) {
            sumOfIntegers = sumOfIntegers + myNumbers[index];
            System.out.println("The value of Array" + index + " is " + myNumbers[index]);
            System.out.println("************");
            }//for

            System.out.println("Sum of all the integers is " + sumOfIntegers);
            System.out.println("************");

        arrayAverage = (double) sumOfIntegers / myNumbers.length;
        System.out.println("The average of myNumber array is " + arrayAverage);

    }//main


}//class



