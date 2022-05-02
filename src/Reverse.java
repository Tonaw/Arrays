import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MAX = 6;
        int[] reverse = new int[MAX];

        for (int index = 0; index < reverse.length; index++)
        {
            System.out.print("Enter an integer: ");
            reverse[index] = keyboard.nextInt();
        }
        System.out.print(Arrays.toString(reverse) + "\n"); // just learnt this

        for (int index = 0; index < reverse.length; index++)
        {
            System.out.println(reverse[index] + "\t");
        }


        for (int index = reverse.length - 1; index > -1; index--)
        {
            System.out.println(reverse[index] + "\t");
        }

    }
}