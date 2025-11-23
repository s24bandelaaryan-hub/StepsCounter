import java.util.Scanner;

public class WeeklyStepCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] st = new int[7];  

        System.out.println("Enter steps walked for each of the 7 days:");

        for (int i = 0; i < st.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            st[i] = sc.nextInt();
        }

        int total = 0;

        for (int i = 0; i < st.length; i++) {
            total += st[i];
        }

        double avg = total / 7.0;

        System.out.println("\n--------------OUTPUT------------------");
        System.out.println("Total Steps in the Week: " + total);
        System.out.println("Average Steps per Day: " + avg);

        sc.close();
    }
}