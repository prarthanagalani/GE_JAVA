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
    }

    // Use Case 1
    private static void checkEmployeeAttendance() {
        Random random = new Random();
        int attendance = random.nextInt(2); // 0 for absent, 1 for present
        System.out.println("Employee is " + (attendance == 1 ? "Present" : "Absent"));
    }

}