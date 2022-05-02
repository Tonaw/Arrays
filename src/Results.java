import java.text.DecimalFormat;
import java.util.*;

public class Results{

    public static void main(String[]args)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);
        final int NOOFSTUDENTS= 2;
        final int NOOFMODULES = 3;
        // Array to store names
        String [] names = new String [NOOFSTUDENTS];
        // Array to store marks
        int [][] marks = new int [NOOFSTUDENTS][NOOFMODULES];
        // Array to student averages
        double [] studentAverage = new double [NOOFSTUDENTS];
        // Array to store module averages
        double [] moduleAverage = new double [NOOFMODULES];
        String [] studentGrade = new String [NOOFSTUDENTS];

        for (int row = 0; row < NOOFSTUDENTS; row++){
            System.out.print("Enter a name: ");
            names [row] = keyboard.nextLine();
            for (int column = 0; column < NOOFMODULES ; column++){
                System.out.print("Enter a mark: ");
                marks [row][column] = keyboard.nextInt();
                }//for
            keyboard.nextLine();
            }//for

        for (int row = 0; row < NOOFSTUDENTS; row++){
            double total = 0;
            for (int column = 0; column < NOOFMODULES ; column++){
                total = total + marks [row] [column];
                }//for
            studentAverage [row] = (double)total / NOOFMODULES;
            }//for

        for (int column = 0; column < NOOFMODULES; column++){
            double total = 0;
            for (int row = 0; row < NOOFSTUDENTS; row++){
                total = total + marks [row][column] ;
                }//for
            moduleAverage [column] = (double)total / NOOFSTUDENTS;
            }//for


        //Printing their values
        System.out.println("\nName\t\tMark 1\tMark 2\tMark 3\tAverage\tGrade");
        for (int row = 0; row < NOOFSTUDENTS; row++){
            System.out.print(names[row]);
            for (int column = 0; column < NOOFMODULES ; column++){
                System.out.print("\t\t" + marks [row][column]);
            }//for
            System.out.print("\t\t" + studentAverage [row]);
            if (studentAverage[row] > 70){
                System.out.print("\tDIST");
            }
            else if (studentAverage[row] > 40){
                System.out.print("\tPASS");
            }
            else System.out.print("\tFAIL");
            System.out.println();
        }//for

        System.out.print("Module Average\t");
        for (int column = 0; column < NOOFMODULES ; column++){
            System.out.print(moduleAverage [column] + "\t");
        }//for


    }

}

