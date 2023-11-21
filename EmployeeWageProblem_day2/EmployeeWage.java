package GE_JAVA.EmployeeWageProblem_day2;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWage{

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int WORKING_DAYS_PER_MONTH = 20;
    private static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        System.out.println("Select an option:");
        System.out.println("1. Check Employee is Present or Absent");
        System.out.println("2. Calculate Daily Employee Wage");
        System.out.println("3. Add Part-time Employee & Wage");
        System.out.println("4. Calculate Wages for a Month");
        System.out.println("5. Calculate Wages till a condition is reached for a month");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();


        // use case 6
        switch (option) {
            case 1:
                checkEmployeeAttendance();
                break;
            case 2:
                calculateDailyWage();
                break;
            case 3:
                addPartTimeEmployee();
                break;
            case 4:
                calculateWagesForMonth();
                break;
            case 5:
                calculateWagesTillCondition();
                break;
            default:
                System.out.println("Invalid option");
        }

        sc.close();

       
    }

    // Use Case 1
    private static void checkEmployeeAttendance() {
        Random random = new Random();
        int attendance = random.nextInt(2); // 0 for absent, 1 for present
        System.out.println("Employee is " + (attendance == 1 ? "Present" : "Absent"));
    }

    // Use Case 2
    private static void calculateDailyWage() {
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
        System.out.println("Daily Employee Wage: " + dailyWage);
    }

    // Use Case 3
    private static void addPartTimeEmployee() {
        int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOURS;
        System.out.println("Part-time Employee Wage: " + partTimeWage);
    }

    // Use Case 4
    private static void calculateWagesForMonth() {
        int monthlyWage = WAGE_PER_HOUR * FULL_DAY_HOURS * WORKING_DAYS_PER_MONTH;
        System.out.println("Monthly Employee Wage: " + monthlyWage);
    }

    // Use Case 5
    private static void calculateWagesTillCondition() {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours < MAX_WORKING_HOURS && totalWorkingDays < WORKING_DAYS_PER_MONTH) {
            totalWorkingHours += FULL_DAY_HOURS;
            totalWorkingDays++;
        }

        int totalWage = WAGE_PER_HOUR * totalWorkingHours;
        System.out.println("Wages till condition: " + totalWage);
    }

}