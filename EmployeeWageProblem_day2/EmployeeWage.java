package GE_JAVA.EmployeeWageProblem_day2;

import java.util.Random;

public class EmployeeWage{

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int WORKING_DAYS_PER_MONTH = 20;
    private static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //use case 1
        checkEmployeeAttendance();

        //use case 2
        calculateDailyWage();

        //use case 3
        addPartTimeEmployee();

        //use case 4
        calculateWagesForMonth();
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

}