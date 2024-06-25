package ConditionalStatements;
import java.util.Scanner;

public class SwitchStatement {

    static void calculateDaysInMonth(int month) {
          
        int days;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                days = 28; // Assuming non-leap year
                break;
            default:
                days = -1; // Invalid month number
        }

        if (days != -1) {
            System.out.println("Number of days in month " + month + ": " + days);
        } else {
            System.out.println("Invalid month number!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number (1 to 12):");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            calculateDaysInMonth(month);
        } else {
            System.out.println("Invalid month number! Please enter a number between 1 and 12.");
        }
    }
}