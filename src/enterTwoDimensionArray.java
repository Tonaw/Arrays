import java.util.*;
public class enterTwoDimensionArray {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int ROWS = 2;
        final int COLUMNS = 2;
        int [] [] grid = new int [ROWS] [COLUMNS];

        //Storing values in them
        for (int row = 0; row < ROWS; row++){
            for(int column = 0; column < COLUMNS; column++){
                System.out.print("Enter a number (row " + row + ", column " +
                        column + ") : ");
                grid [row] [column] = keyboard.nextInt();

            }//for

        }

        //Printing their values
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                System.out.print("\t" + grid [row][column]);
            }//for
            System.out.println();
        }//for


    }
}