/*Below is the binary search algorithm to find a number in a sorted array. Write the complete program
design for this and implement a Java application called BinarySearch which uses this algorithm to
find the location of 32 in the following array:
myArray = {23, 27, 32, 45, 56, 57, 60, 67}
 */

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int SIZE = 8;
        int [] myArray = {23, 27, 32, 45, 56, 57, 60, 67};
        int searchNumber = 0;
        boolean found = false;
        int top = SIZE - 1, middle, bottom = 0, location = 0;

        searchNumber = keyboard.nextInt();

        do {
            middle = (bottom + top) / 2; //3
            if (myArray[middle] == searchNumber){
                location = myArray[middle];
                found = true;
            }
            else if (myArray[middle] < searchNumber){
                bottom = middle + 1;
            }
            else top = middle - 1;
        }while (!(found) && (bottom <= top));

        if (found) {
            System.out.print("The number is found in the index number " + middle++);
        }
            else System.out.print("The number could not be found");
    }

}