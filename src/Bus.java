import java.util.*;

public class Bus {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int SIZE = 2;
        final int REQUIREDBUS = 301;
        boolean found = false;
        int position = 0;
        int[] id = new int[SIZE];
        String[] make = new String[SIZE];
        int[] capacity = new int[SIZE];
        boolean[] automatic = new boolean[SIZE];
        for (int index = 0; index < SIZE; index++) {
            System.out.print("Bus " + (index + 1) + " id : ");
            id[index] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " make : ");
            make[index] = keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " capacity : ");
            capacity[index] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " is Automatic: ");
            automatic[index] = keyboard.nextBoolean();
            keyboard.nextLine();
        }//for
        System.out.println("ID\tMake\t\tCapacity");
        for (int index = 0; index < SIZE; index++) {
            System.out.println(id[index] + "\t" + make[index] + "\t" +
                    capacity[index]);
        }//for
        while ((!found) && (position < SIZE)) {
            if (REQUIREDBUS == id[position]) {
                found = true;
            }//if
            if (!found) {
                position++;
            }//if
        }//while
        if (found) {
            System.out.println("ID\tMake\t\tCapacity");
            System.out.println(id[position] + "\t" + make[position] + "\t" +
                    capacity[position]);
        }//if
        else {
            System.out.println("Bus " + REQUIREDBUS + " not found");
        }//else
    }//main
}//class
